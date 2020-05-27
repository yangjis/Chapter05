package com.javaex.ex01;

public class CircleList {
	
	private Circle[] cArray;
	private int count = 0;
	
	public CircleList() {
		cArray = new Circle[3];
		count = 0;
	}
	
	public void add(Circle c1) {
		cArray[count] = c1;
		count++;
	}
	
	public int size() {
		return count;
	}

}
