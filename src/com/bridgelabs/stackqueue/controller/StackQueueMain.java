package com.bridgelabs.stackqueue.controller;

import com.bridgelabs.stackqueue.model.MyStack;

public class StackQueueMain {

	public static void main(String[] args) {
		performStackOperation();
	}

	private static void performStackOperation() {
		MyStack<Integer> stack = new MyStack<Integer>();

		// adds element to
		stack.push(70);
		stack.push(30);
		stack.push(56);

		// prints element in stack
		stack.printList();
	}

}
