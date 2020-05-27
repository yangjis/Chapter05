package com.javaex.ex01;

public class MyList<T> {
	
	private T[] oArray;
	private int count;
	
	public MyList() {
		oArray = (T[])new Object[3];
		count = 0;
	}
	public void add(T o) {
		oArray[count] = o;
		count++;
	}
	public int size() {
		return count++;
	}
	
}
