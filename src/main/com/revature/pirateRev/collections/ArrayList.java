package main.com.revature.pirateRev.collections;

import java.util.Arrays;

import main.com.revature.pirateRev.exceptions.NoSuchElementException;

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

	public void add(T data) {

		backingArray[currentLastIndex] = data;
		length++;
		currentLastIndex++;

		if (currentLastIndex == size - 1) {
			backingArray = (T[]) resize(backingArray);
		}
	}

	public T getElementAtIndex(int index) {
		if (backingArray[index] == null) {
			throw new NoSuchElementException("There are no elements at that index!");
		} else {
			return (T) backingArray[index];
		}

	}

	public Object[] getAllElements() {

		return backingArray;

	}

	public int getLength() {
		return length;
	}

	private T[] resize(T[] oldArray) {

		T[] newArray = (T[]) Arrays.copyOf(oldArray, size + size / 2);

		size = newArray.length;

		return newArray;
	}

	public void print() {
		for (int i = 0; i < backingArray.length; i++) {
			if (backingArray[i] == null)
				break;
			System.out.println("\n\n   " + (i+1) + ") " + backingArray[i]);
		}
	}
	
	public boolean isEmpty() {
		return currentLastIndex==0;
	}
}
