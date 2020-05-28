package com.javaex.ex07;

import java.util.HashMap;
import java.util.Map;

public class PointApp {

	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(10,10);
		Point p3 = new Point(20,20);
		
		pMap.put("정우성", p1);
		pMap.put("이효리", p2);
		pMap.put("강동원", p3);
		
		
		Point p = pMap.get("정우성");
		System.out.println(p.getY());
		
		System.out.println(pMap.get("정우성").getY()); //굳이 변수 만들 필요 없이 바로 사용할 수 있다.
		
		System.out.println(pMap.toString());
	}
}
