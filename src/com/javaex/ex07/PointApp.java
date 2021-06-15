package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<>();

		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 4);
		Point p03 = new Point(5, 6);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);

		/*
		for (Point p : pSet) {
			System.out.println(p.toString());
		}
		*/

		System.out.println(pSet.toString());
		
		
		//중복체크 안됨. 중복의 정의가 필요하다
		Point p04 = new Point(3, 4);
		pSet.add(p04);
		System.out.println(pSet.toString());
		
		
		
		
		
		
		
		
		
		
		
	}

}
