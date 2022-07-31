package com.revature.DS.app;

import com.revature.DS.dataStructures.ArrayList;
import com.revature.DS.dataStructures.LinkedList;
import com.revature.DS.util.EmptyCollectionException;
import com.revature.DS.util.NoSuchElementException;

public class Driver {

	public static void main(String[] args) {
		
		testArrayList();
		testLinkedList();
	}

	
	
	
	
	
	
	
	
	
	private static void testLinkedList() {
		LinkedList<Integer> linkedL = new LinkedList<Integer>();
		linkedL.addNode(1);
		linkedL.addNode(2);
		linkedL.addNode(3);
		linkedL.addNode(4);
		
		try {
			linkedL.printList();
			
			linkedL = new LinkedList<Integer>();
			//should throw exception
			linkedL.printList();
		} catch (EmptyCollectionException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	










	private static void testArrayList() {
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		for(int i = 1;i<=20;i++) {
			integerArrayList.addElement(i);
		}
		
		
		try {
			
			System.out.println(integerArrayList.getElementAtIndex(4));
			
			//should throw custom exception
			System.out.println(integerArrayList.getElementAtIndex(20));
			
		} catch (NoSuchElementException e) {
			
			e.printStackTrace();
		}
		
		Object arr[] = null;
		try {
			
			arr = integerArrayList.getAllElements();
			
			ArrayList<Integer> testEmptyArrayList = new ArrayList<>();
			//should throw custom exception
			testEmptyArrayList.getAllElements();
			
			
		} catch (EmptyCollectionException e) {
			
			e.printStackTrace();
		}
		
		if(arr!=null) {
			System.out.print("[ ");
			for(int i = 0;i<arr.length;i++) {
				System.out.print(i);
				if(i<arr.length-1)
					System.out.print(" ");
			}
			System.out.println("]");
		}
		
		
		
		
	}
}
