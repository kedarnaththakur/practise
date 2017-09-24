package com.practise.kedar.trickey;

public class Trickey6 {

	/**
	 * 1. finally block never user any return method it restrict all return of try and catch block. 
	 * 2. equals method of Wrapper classes always check instance of own wrapper type class
	 *    but in wrapperClassEqualsMethod  return false.
	 */
	public static void main(String[] args) {
		System.out.println("power of finally "+finallyPower());
		wrapperClassEqualsMethod();
	}
	
	public static int finallyPower(){
		try{
			System.out.println("inside of try");
			//throw new RuntimeException("Exception caught by some activity");
			return 10;
		}catch(RuntimeException e){
			return 20;
		}
		finally{
			return 50;
		}
	}
	
	public static void wrapperClassEqualsMethod(){
		Float f = new Float(0);
		System.out.println(f.equals(0));//it returns false due to check it  instanceof Float but 0 converted to int due to autoboxing
		System.out.println(f.equals(0f));//it return true; 0f become float
		
		Double d = new Double(0);
		System.out.println(d.equals(0));//it returns false
		System.out.println(d.equals(0d));//it return true; 0f become Double
		
		Long l = new Long(0);
		System.out.println(l.equals(0));//it returns false
		System.out.println(l.equals(0l));//it return true; 0l become Long
	}
}

