package com.bridgelabs.stackqueue.model;

public class MyQueue<E> {

	private MyLinkedList<E> linkedList;

	public MyQueue() {
		linkedList = new MyLinkedList<E>();
	}

	// adds element to the rear of queue
	public void enqueue(E data) {
		linkedList.addLast(data);
	}

	// returns size of the queue
	public int size() {
		return linkedList.size();
	}

	// prints the element in the queue
	public void printList() {
		linkedList.printList();
	}
}
