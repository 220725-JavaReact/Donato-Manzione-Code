package com.revature.DS.util;

public class ArrayUtil {
	
	
	public static void printArray(Object[] arr) {
		if(arr!=null) {
			System.out.print("[");
			for(int i = 0;i<arr.length;i++) {
				System.out.print(i);
				if(i<arr.length-1)
					System.out.print(", ");
			}
			System.out.println("]");
		}
	}
}
