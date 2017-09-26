package com.practise.khushal.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrToListAndListToArr {

	public static void main(String[] args) {
		String[] strArr1 = new String[]{"A","B","C","D"};
		
		List<String> list1 = new ArrayList<String>();
		list1.add("O");
		list1.add("P");
		list1.add("Q");
		list1.add("R");
		list1.add("S");
		
		List<String> list2 = new ArrayList<String>();
		list2 = Arrays.asList(strArr1);
		System.out.println("Arrays as List "+list2);
		
		String[] strArr2= list1.toArray(new String[list1.size()]);
		System.out.println("List to array "+strArr2.toString());
		
		for (String string : strArr2) {
			System.out.println(string);
		}
		
	}

}
