package com.javaex.ex01;

//제네릭을 배워보자

public class PointListApp {

	public static void main(String[] args) {
		/*
		 //----------------------------파라미터를 각 객체 타입으로 보낼 때
		//포인트 관리
		PointList pList = new PointList();
		
		Point p1 = new Point(3,3);
		Point p2 = new Point(4,4);
		
		pList.add(p1);
		pList.add(p2);
		
		System.out.println(pList.size());
		
		//원 관리
		CircleList cList = new CircleList();
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		
		cList.add(c1);
		System.out.println(cList.size());
		*/

		
		//------------------------------파라미터를 object타입으로 보낼 때(제네릭)
		//포인트 관리
		MyList<Point> pList = new MyList<Point>();
		
		Point p1 = new Point(3,3);
		Point p2 = new Point(4,4);
		
		pList.add(p1);
		pList.add(p2);
		
		System.out.println(pList.size());
		
		//원 관리
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		
		
		cList.add(c1);
		System.out.println(cList.size());
		
	}
}
