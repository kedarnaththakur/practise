package com.practise.khushal.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("X");
		list.add("P");
		list.add("C");
		System.out.println("List without sorting "+list.toString());
		
		/*
		 * Asscending Order
		 * Collections.sort(list);
		System.out.println("List Assending "+list);*/
		
		/*Decending Order*/
		/*Collections.sort(list, Collections.reverseOrder());
		System.out.println("List Desending "+list.toString());*/
		
	}

}
