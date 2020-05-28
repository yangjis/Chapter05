package com.javaex.ex04;

//HashSet을 사용해보자

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoApp {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			int rNum = (int)((Math.random())*45) +1;
			lotto.add(rNum);
			
			if(lotto.size() == 6) break;
		}
		
		for(Integer i : lotto) 
			System.out.print(i.toString() + "      ");
		
	}
}
