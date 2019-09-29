package com.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {

		System.out.println("****** Liked list operations ******");

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Rakesh");
		linkedList.add("Ramesh");

		System.out.println("Contetnts of Linked list: " + linkedList);

		// add(index, element) - Adds an element at particular index of linked list
		linkedList.add(1, "Krishna");
		System.out.println("Contetnts of Linked list after add() at index 1: " + linkedList);

		// addFirst() - Adds an element to the beginning of linked list
		linkedList.addFirst("Arvind");
		System.out.println("Contetnts of Linked list after addFirst(): " + linkedList);

		// addLast() - Adds an element to the end of linked list
		linkedList.addLast("Asha");
		System.out.println("Contetnts of Linked list after addLast(): " + linkedList);

		// set() - Overrides an element at particular position
		linkedList.set(3, "Sujay");
		System.out.println("Contetnts of Linked list after set() at index 3: " + linkedList);

		// remove() - Removes an element at particular index in linked list
		linkedList.remove(2);
		System.out.println("Contetnts of Linked list after remove() from index 2: " + linkedList);

		// removeFirst() - Removes an element from the beginning of linked list
		linkedList.removeFirst();
		System.out.println("Contetnts of Linked list after removeFirst(): " + linkedList);

		// removeLast() - Removes an element from the end of linked list
		linkedList.removeLast();
		System.out.println("Contetnts of Linked list after removeLast(): " + linkedList);

		System.out.println("****** Iterating elements in a Linked List ******");

		System.out.println("--- for loop ---");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

		System.out.println("--- Advanced for loop ---");
		for (String element : linkedList) {
			System.out.println(element);
		}

		System.out.println("--- Using Iterator ---");
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("--- Using while loop ---");
		int numberIterator = 0;
		while(numberIterator < linkedList.size()) {
			System.out.println(linkedList.get(numberIterator));
			numberIterator++;
		}
	}

}
