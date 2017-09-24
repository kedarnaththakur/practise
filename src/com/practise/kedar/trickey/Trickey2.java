package com.practise.kedar.trickey;

public class Trickey2 {

	/**
	 * First call static block and then class block
	 * If classes is inheritance then first call 
	 * parent class static block->child class static block->parent class class block->child class class block
	 * 
	 * please try different combinations
	 */
	
	public static void main(String[] args) {
		//Child child = new Child();
		Parent parent = new Parent();
		//System.out.println(Child.number);
		System.out.println(Parent.number);
		
	}
}
class Parent{
	static int number = 1_0_0; //UNDERSCORE IN INTEGRAL VALUES FEATURE OF JDK1.7
	static{
		number = number-- - --number;
		System.out.println("parent static : "+number);
	}
	{
		number = number++ + ++number;
		System.out.println("parent class : "+number);
	}
	
}
class Child extends Parent{
	static{
		number = --number - number--;
		System.out.println("child static : "+number);
	}
	{
		number = ++number + number++;
		System.out.println("child class : "+number);
	}
}
