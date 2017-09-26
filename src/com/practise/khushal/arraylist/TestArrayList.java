package com.practise.khushal.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		/*Appends the specified element to the end of this list (optional operation). 

		Lists that support this operation may place limitations on what elements may be added
		to this list. In particular, some lists will refuse to add null elements, and others 
		will impose restrictions on the type of elements that may be added. List classes 
		should clearly specify in their documentation any restrictions on what elements may 
		be added.

		Specified by: add(...) in Collection
		
		Parameters:e element to be appended to this list
		
		Returns:true (as specified by Collection.add)
		
		Throws:
		UnsupportedOperationException - if the add operation is not supported by this list
		ClassCastException - if the class of the specified element prevents it from being added to this list
		NullPointerException - if the specified element is null and this list does not permit null elements
		IllegalArgumentException - if some property of this element prevents it from being added to this list
		*/
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		list.add("Test6");
		
		/*
		 * 1
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}*/
		
		//2.
		//System.out.println(list.contains(null));
		
			
		 //* 3
		  /*Iterator<String> itr = list.listIterator();
			while (itr.hasNext()) {
			String string = (String) itr.next();
			if (string.equals("Test4")) {
				list.remove("Test4");
			}
		}
			System.out.println(list);*/
		/*
		 * 4
		ListIterator<String> itr = list.listIterator(5);
		while (itr.hasPrevious()) {
			String string = (String) itr.previous();
			System.out.println(string);
		}*/
		
		
		 /*
		  * 5
		Iterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}*/
		
	/*	
	 * 6
	 * list.set(2, "khushal");
		System.out.println(list.toString());
		*/
	}

}
