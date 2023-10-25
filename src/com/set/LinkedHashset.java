package com.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashset {
	public static void main(String[] args) {

		Set<Integer> s=new LinkedHashSet();
		Set<Integer> s1=new TreeSet<>();

		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		System.out.println(s);
		Set<Integer> s2=new TreeSet<>();
		s2.add(100);
		s2.add(200);
		s2.add(300);
		s2.add(400);
		s2.add(500);
		s2.add(600);
		s2.add(700);
		System.out.println(s1);
		s1.addAll(s);
		System.out.println(s1);
		for (Integer integer : s1) {
			System.out.println(integer);
		}
	}
}
