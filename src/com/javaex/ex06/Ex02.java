package com.javaex.ex06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		Set<Integer> Lotto = new HashSet<>();
		
		while(Lotto.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
			Lotto.add(num);
		}
		
		for(int LottoNo : Lotto) {
			System.out.print(LottoNo + "\t");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
