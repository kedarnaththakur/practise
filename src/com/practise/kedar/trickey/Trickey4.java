package com.practise.kedar.trickey;

public class Trickey4 {

	/**
	 * It will not caught NPE because when it compile in to class file
	 * object.nullTest(); code convert as StaticClass.nullTest();
	 * That's why it is not caught by NPE
	 */
	
	public static void main(String[] args) {
		StaticClass object = null;
		//Is it caught by NPE or not.
		object.nullTest();
		concatTrick();
	}
	
	public void ambiguous(){
		Integer I = new Integer(null);
		// It shows ambiguous because of constructor String(String s) String(StringBuffer s) and String(StringBuilder s)
		//String s = new String(null);
	}
	
	public static void concatTrick(){
		String s = "AA"+4/3+"BB"+5;
		int i = 10 + + 30 - - 5;
		System.out.println(s);
		System.out.println(i);
	}
}
class StaticClass{
	static void nullTest(){
		System.out.println("NPE caught or not");
	}
}
