package com.javaex.ex03;

//컬렉션 프레임중 HashSet에 대해 배워보자

import java.util.HashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(5);
		Integer i03 = new Integer(7);
		Integer i04 = new Integer(10);
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		
		for(Integer i: iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("===============중복데이터 추가 후=================");
		
		Integer i05 = new Integer(10);
		
		iSet.add(i05);

		for(Integer i: iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("===============삭제=================");
		
		iSet.remove(i01);
		
		for(Integer i: iSet) {
			System.out.println(i.toString());
		}
	}
}
