package com.practise.kedar.trickey;

public class Trickey1 {

	/**
	 * If directly call static variable, then static block called or not?
	 * How and when static block call?
	 * How many times static block called if I create multiple object of the same class?
	 * 
	 */
	public static void main(String[] args) {
		//If directly call static variable, then static block called or not?
		System.out.println(OneClass.myLitral);
		//How and when static block call?
		OneClass obj1 = null;
		//How many times static block called if I create multiple object of the same class?
		OneClass obj2 = new OneClass();
		OneClass obj3 = new OneClass();
	}
}
class OneClass{
	static{
		System.out.println("When my static block call");
	}
	public static final int myLitral = 10;
}
