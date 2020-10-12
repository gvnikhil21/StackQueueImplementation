package com.bridgelabs.stackqueue.controller;

import com.bridgelabs.stackqueue.model.MyQueue;
import com.bridgelabs.stackqueue.model.MyStack;

public class StackQueueMain {

	public static void main(String[] args) {
		performStackOperation();
		performQueueOperation();
	}

	private static void performStackOperation() {
		MyStack<Integer> stack = new MyStack<Integer>();

		// adds element to stack
		stack.push(70);
		System.out.println("----Stack----");
		stack.printList();
		stack.push(30);
		stack.printList();
		stack.push(56);

		// prints element in stack
		stack.printList();
		System.out.println("Top element in the stack is: " + stack.peek());

		// removes the top-most element in stack and returns it
		System.out.println("Popped element is: " + stack.pop());
		stack.printList();
		System.out.println("Top element in the stack is: " + stack.peek());
	}

	private static void performQueueOperation() {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		// adds element to queue
		queue.enqueue(56);
		System.out.println("---Queue-----");
		queue.printList();
		queue.enqueue(30);
		queue.printList();
		queue.enqueue(70);

		// prints element in queue
		queue.printList();
		System.out.println("Front element in the queue is: " + queue.peek());

		// removes the front-most element in queue and returns it
		System.out.println("Popped element is: " + queue.dequeue());
		queue.printList();
		System.out.println("Front element in the queue is: " + queue.peek());
	}

}
