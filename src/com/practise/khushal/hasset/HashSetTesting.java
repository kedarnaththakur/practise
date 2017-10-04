package com.practise.khushal.hasset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTesting {

	public static void main(String[] args) {
		//Set<String> hashSet = new HashSet<String>();
		Set<String> hashSet = new LinkedHashSet<String>();
		//Set<String> hashSet = new TreeSet<String>();
		
		/*hashSet.add("Testing");
		hashSet.add("Testing");*/
		hashSet.add(null);
		hashSet.add(null);
		
		System.out.println("hashSet  "+hashSet);
	}

}
