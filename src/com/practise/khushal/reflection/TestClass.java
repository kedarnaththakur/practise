package com.practise.khushal.reflection;

public class TestClass {
	private String s;
	
	public TestClass()
	{
		s="Headfirst";
	}
	
	public void method1(){
		System.out.println("Inside public method ::: "+s);
	}
	
	public void method2(int i){
		System.out.println("Inside parametrized method with value "+i);
	}
	
	private void method3()
	{
		System.out.println("Inside private method");
	}
	
}
