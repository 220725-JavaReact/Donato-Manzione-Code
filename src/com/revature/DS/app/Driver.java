package com.revature.DS.app;

import com.revature.DS.dataStructures.ArrayList;
import com.revature.DS.util.EmptyCollectionException;
import com.revature.DS.util.NoSuchElementException;

public class Driver {

	public static void main(String[] args) {
		
		testArrayList();
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
