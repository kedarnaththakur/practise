package com.practise.khushal.interfaceclassrelation;

public class TestInterfaceClass implements TestInterface {

	@Override
	public void firstMethod() {
		System.out.println("Inside first implemented methods");
	}

	@Override
	public void secondMethod() {
		System.out.println("Inside second implemented methods");
	}
	
	public void thirdMethod() {
		System.out.println("Inside third implemented methods");
	}
	
	public void fourthMethod() {
		System.out.println("Inside fourth implemented methods");
	}
	
	

}
