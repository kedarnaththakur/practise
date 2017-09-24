package com.practise.kedar.trickey;

public class Trickey7 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		ParentClass c = new ChildClass();
		p.staticDisplay();// After compiling this code this line converted in to ParentClass.staticDisplay()
		c.staticDisplay();// After compiling this code this line converted in to ParentClass.staticDisplay()
		
		p.display();
		c.display();
	}
}
class ParentClass{
	public static void staticDisplay(){
		System.out.println("Hey! I am in ParentClass :: staticDisplay method");
	}
	public void display(){
		System.out.println("Hey! I am in ParentClass :: display method");
	}
}
class ChildClass extends ParentClass{
	public static void staticDisplay(){
		System.out.println("Hey! I am in ChildClass :: staticDisplay method");
	}
	public void display(){
		System.out.println("Hey! I am in ChildClass :: display method");
	}
	
}