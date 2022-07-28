package com.revature.DS.dataStructures;

import com.revature.DS.util.EmptyCollectionException;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;

	public void addNode(T data) {
		if (head == null) {
			head = new Node<T>(data);
			tail = head;
		}else {
			tail.next = new Node<T>(data);
			tail = tail.next;
		}
	}
	
	public void printList() throws EmptyCollectionException {
		if(head == null) {
			throw new EmptyCollectionException("Your linked list is empty!");
		}
		Node<T> traversalNode = head;
		
		System.out.print("Linked list: [");
		while(traversalNode!=null) {
			
			System.out.print(String.valueOf(traversalNode.data));
			
			if(traversalNode.next != null) {
				System.out.print(" -> ");
			}
			traversalNode = traversalNode.next;
		}
		System.out.println("]");
	}

	private class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}

	}

}
