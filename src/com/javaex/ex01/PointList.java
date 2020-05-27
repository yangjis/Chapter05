package com.javaex.ex01;

public class PointList {
	
	private Point[] pArray;
	private int count;
	
	public PointList() {
		pArray = new Point[3];
		count = 0;
	}
	public PointList(Point[] pArray) {
		this.pArray = pArray;
	}
	
	public void add(Point p) {
		pArray[count] = p;
		count++;
	}
	
	public int size() {
		return count;
	}
}
