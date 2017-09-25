package com.practise.khushal.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Testlist {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		list.add("d");
		System.out.println(Collections.frequency(list,"a"));
		
		

	}

}
