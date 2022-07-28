package com.revature.DS.dataStructures;

import com.revature.DS.util.EmptyCollectionException;
import com.revature.DS.util.NoSuchElementException;

public class ArrayList<T> {
	private int length;
	private int size;
	private int currentLastIndex;
	private T[] backingArray;

	@SuppressWarnings("unchecked")
	public ArrayList() {

		this.length = 0;
		this.size = 10;
		this.currentLastIndex = 0;
		this.backingArray = (T[]) new Object[10];

	}

	public void addElement(T data) {

		backingArray[currentLastIndex] = (T)data;
		length++;
		currentLastIndex++;

		if (currentLastIndex == size - 1) {
			backingArray = resize(backingArray);
		}
	}

	public T getElementAtIndex(int index) throws NoSuchElementException {
		if (backingArray[index] == null) {
			throw new NoSuchElementException("There are no elements at that index!");
		} else {
			return backingArray[index];
		}

	}

	public T[] getAllElements() throws EmptyCollectionException {
		if (length == 0) {
			throw new EmptyCollectionException("Your ArrayList is empty!");

		} else {
			@SuppressWarnings("unchecked")
			T[] elements = (T[]) new Object[length];

			for (int i = 0; i < length; i++) {
				elements[i] = (T)backingArray[i];
			}
			return elements;
		}

	}

	public int getLength() {
		return length;
	}

	private T[] resize(T[] oldArray) {

		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[size + (size / 2)];

		for (int i = 0; i < size; i++) {
			newArray[i] = oldArray[i];
		}

		size = newArray.length;

		return newArray;
	}

}
