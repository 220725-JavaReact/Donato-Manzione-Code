package com.revature.pirateRev.collections;

import java.util.Arrays;
import com.revature.pirateRev.exceptions.EmptyCollectionException;
import com.revature.pirateRev.exceptions.NoSuchElementException;

public class ArrayList<T> {
	private int length;
	private int size;
	private int currentLastIndex;
	private Object[] backingArray;

	public ArrayList() {

		this.length = 0;
		this.size = 10;
		this.currentLastIndex = 0;
		this.backingArray = new Object[10];

	}

	public void add(T data) {

		backingArray[currentLastIndex] = data;
		length++;
		currentLastIndex++;

		if (currentLastIndex == size - 1) {
			backingArray = resize(backingArray);
		}
	}

	@SuppressWarnings("unchecked")
	public T getElementAtIndex(int index) {
		if (backingArray[index] == null) {
			throw new NoSuchElementException("There are no elements at that index!");
		} else {
			return (T) backingArray[index];
		}

	}

	public Object[] getAllElements() {
		if (length == 0) {
			throw new EmptyCollectionException("Your ArrayList is empty!");

		} else {

			Object[] elements = new Object[length];

			for (int i = 0; i < length; i++) {
				elements[i] = backingArray[i];
			}
			return elements;
		}

	}

	public int getLength() {
		return length;
	}
	
	

	private Object[] resize(Object[] oldArray) {

		Object[] newArray = Arrays.copyOf(oldArray, size + size / 2);

		size = newArray.length;

		return newArray;
	}

}
