package com.practise.khushal.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListRemoveduplicateDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("K");
		list.add("D");
		list.add("Z");
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("C");
		list.add("D");
		list.add("O");
		list.add("C");
		list.add("A");
		list.add("F");
		list.add("C");
		list.add("D");
		list.add("D");
		list.add("L");
		list.add("A");
		list.add("E");
		System.out.println(list.toString());
		
		
		/*  If we use HashSet then we will get back the natural order*/
		  /* Set<String> set = new HashSet<String>(list);
			System.out.println(set);
			list.clear();
			list.addAll(set);
			System.out.println(list.toString());*/
		
		
		/*
		 *  If we use HashSet then we will get back the insertion order
		 *  Set<String> set = new LinkedHashSet<String>(list);
			System.out.println(set);
			list.clear();
			list.addAll(set);
			System.out.println(list.toString());
		*/
		
		
		 /*Set<String> set = new TreeSet<String>(list);
			System.out.println(set);
			list.clear();
			list.addAll(set);
			System.out.println(list.toString());*/
		
	}

}
