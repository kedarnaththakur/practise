package com.practise.kedar.trickey;

import java.util.Random;

public class Trickey8 {

	/**
	 * What is the expected output?
	 */
	
	private static Random r = new Random();
	public static void main(String[] args) {
		StringBuilder s = null;
		switch(r.nextInt(5)){
		case 1:
			s = new StringBuilder('a');
		case 2:
			s = new StringBuilder('b');
		case 3:
			s = new StringBuilder('c');
		case 4:
			s = new StringBuilder('d');
		case 5:
			s = new StringBuilder('e');
		default:
			s = new StringBuilder('f');
		}
		s.append('g');
		s.append('h');
		s.append('j');
		
		System.out.println(s);
		
	}
}

