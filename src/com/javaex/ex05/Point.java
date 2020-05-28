package com.javaex.ex05;

//해시셋이 중복데이터 저장이 불가능한데 가능한 이유와 해결책.

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
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}*/
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]" + super.hashCode();
	}
}
