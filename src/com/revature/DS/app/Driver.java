package com.revature.DS.app;

import com.revature.DS.dataStructures.ArrayList;
import com.revature.DS.dataStructures.LinkedList;
import com.revature.DS.util.EmptyCollectionException;
import com.revature.DS.util.NoSuchElementException;

public class Driver {

	public static void main(String[] args) {
		
//		testArrayList();
		testLinkedList();
	}

	
	
	
	
	
	
	
	
	
	private static void testLinkedList() {
		LinkedList<Integer> linkedL = new LinkedList<Integer>();
		linkedL.addNode(1);
		linkedL.addNode(2);
		linkedL.addNode(3);
		linkedL.addNode(4);
		
		linkedL.printList();
		
	}
	
	
	










	private static void testArrayList() {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			integerArrayList.addElement(i);
		}
		
		
		try {
			
			System.out.println(integerArrayList.getElementAtIndex(4));
			
		} catch (NoSuchElementException e) {
			
			e.printStackTrace();
		}
		
		Object arr[] = null;
		try {
			arr = integerArrayList.getAllElements();
			
			
		} catch (EmptyCollectionException e) {
			
			e.printStackTrace();
		}
		
		if(arr!=null) {
			System.out.print("[ ");
			for(Object i : arr) {
				System.out.print(i + " ");
			}
			System.out.println("]");
		}
		
		
		
		
	}
}
