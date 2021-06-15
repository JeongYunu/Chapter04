package com.javaex.ex05;

import java.util.ArrayList;
import java.util.List;

public class PointApp {

	public static void main(String[] args) {
	
		List<Point> pList = new ArrayList<>();
		
		Point p01 = new Point(2,3);
		Point p02 = new Point(4,5);
		Point p03 = new Point(6,7);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for(Point p : pList) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
	}

}
