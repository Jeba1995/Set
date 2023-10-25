package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		System.out.println(s);
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(100);
		s1.add(200);
		s1.add(300);
		s1.add(400);
		s1.add(500);
		s1.add(600);
		s1.add(700);
		System.out.println(s1);
		s1.addAll(s);
		System.out.println(s1);
		for (Integer integer : s1) {
			System.out.println(integer);
		}
	}
}
