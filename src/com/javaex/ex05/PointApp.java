package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 3);
		Point p3 = new Point(4, 4);
		
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		
		for(Point p : pSet)
			p.draw();
		
		System.out.println("===========================");
		
	//해시셋은 중복으로 데이터를 저장 하지 않지만 중복체크를 해시코드를 비교하여 저장하기 때문에
	//데이터가 같더라도 해시코드가 다르면 다른 데이터로 인식한다.
	//그러므로 해시코드를 재정의하여 사용한다.
		
		Point p4 = new Point(4,4);
		pSet.add(p4);
		
		for(Point p : pSet)
			System.out.println(p.toString());
		
		
		
	}
}
