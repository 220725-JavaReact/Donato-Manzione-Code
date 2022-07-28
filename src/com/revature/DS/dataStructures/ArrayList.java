package com.revature.DS.dataStructures;

public class ArrayList<T> {
	int length;
	int size;
	int currentLastIndex;
	T[] backingArray;
	
	public ArrayList() {
		
		this.length = 0;
		this.size = 10;
		this.currentLastIndex = 0;
		this.backingArray = (T[]) new Object[10];
		
	}
	
	void addElement(T data) {
		
		backingArray[currentLastIndex++] = data;
		length++;
		currentLastIndex++;
		
		if(currentLastIndex==size-1) {
			backingArray = resize(backingArray);
		}
	}

	private T[] resize(T[] backingArray) {
		
		T[] newArray = (T[]) new Object[size + (size/2)];
		
		return newArray;
	}
	
	
	
}
