package com.practise.kedar.trickey;

import java.util.HashSet;
import java.util.Set;

public class Trickey5 {

	/**
	 * double curly bracket create anonymous inner class that why it is legal and no compilation error
	 */
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		set.remove("a");
		
		Set set1 = new HashSet(){
			{
				add("a");
			}
			{
				add("b");
				add("c");
			}
			{
				remove("a");
			}
		};
		
		System.out.println(set);
		System.out.println(set1);
	}
}

