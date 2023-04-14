package com.bridgelabz.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

class MapNode<K, V> {
	K key;
	V value;
	MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setvalue(V value) {
		this.value = value;

	}

	public MapNode<K, V> getNext() {
		return next;
	}

	public void setNext(MapNode<K, V> next) {
		this.next = (MapNode<K, V>) next;
	}

	@Override
	public String toString() {
		return "MapNode [key=" + key + ", value=" + value + ", next=" + next + "]";
	}

}

class MyHashMap<K, V> {
	private  MapNode<K, V> V = null;
	MapNode head;
	MapNode tail;

	public V get(K word) {
		MapNode<K, V> myNode = searchNode(word);
		return (myNode == null) ? null : myNode.getValue();
	}

	public MapNode<K, V> searchNode(K word) {
		MapNode<K, V> currentNode = head;
		int position = 0;
		while (currentNode != null) {
			position++;
			if (currentNode.getKey().equals(word)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	public void add(K key, V value) {
		MapNode<K, V> myNode = searchNode(key);
		if (myNode == null) {
			myNode = new MapNode<>(key, value);
			this.append(myNode);
		} else {
			myNode.setvalue(value);
		}
	}

	private void append(MapNode<K, V> myNode) {
		if (this.head == null) {
			this.head = myNode;
			if (this.tail == null)
				this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}

	public void printNodes() {
		System.out.println("My nodes" + head);
	}
}

public class HashTable {

	public static void main(String args[]) {
		String sentence = "To be or not be";
		String[] words = sentence.toLowerCase().split("");

		HashMap<String, Integer> myHashMap = new HashMap<>();
		for (String word : words) {
			Integer value = myHashMap.get(words);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.put(word, value);
		}
		int frequency=(int)myHashMap.get("to");
		System.out.println(myHashMap);
	}

}
