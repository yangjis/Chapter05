package com.javaex.ex07;

//해시맵을 사용해보자

public class Point {
	
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("[점]x:" + x + " y:" + y + " 를 그렸습니다.");
	}
	@Override
	public boolean equals(Object obj) {
		Point po = (Point)obj;
		return x == po.x && y == po.y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
