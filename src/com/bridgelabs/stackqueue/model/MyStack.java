package com.bridgelabs.stackqueue.model;

public class MyStack<E> {
	private MyLinkedList<E> linkedList;

	public MyStack() {
		linkedList = new MyLinkedList<E>();
	}

	// adds element to the stack
	public void push(E data) {
		linkedList.addFirst(data);
	}

	// returns size of the stack
	public int size() {
		return linkedList.size();
	}

	// prints element in stack
	public void printList() {
		linkedList.printList();
	}
}
