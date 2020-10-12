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

	// returns the top element of the stack
	public E peek() {
		return linkedList.peek();
	}

	// removes the top element form the stack and returns it
	public E pop() {
		return linkedList.remove();
	}

	// returns size of the stack
	public int size() {
		return linkedList.size();
	}

	// checks for empty stack
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	// prints element in stack
	public void printList() {
		linkedList.printList();
	}
}
