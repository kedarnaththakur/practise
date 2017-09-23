package com.practise.khushal.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		
		// Creating class object from the object using
        // getclass method
		Class cls = obj.getClass();
		System.out.println("The name of class is " +cls.getName());
		System.out.println("");
		try {
			// Getting the constructor of the class through the
	        // object of the class
			Constructor constructor =cls.getConstructor();
			 System.out.println("The name of constructor is " +constructor.getName());
			System.out.println("");
			
			// Getting methods of the class through the object
	        // of the class by using getMethods
			Method[] methods =	 cls.getMethods();
			
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			System.out.println("");
			
			// creates object of the desired field by providing
	        // the name of field as argument to the 
	        // getDeclaredField method
			Field field = cls.getDeclaredField("s");
			// allows the object to access the field irrespective
	        // of the access specifier used with the field
			field.setAccessible(true);
			// takes object and the new value to be assigned
	        // to the field as arguments
	        field.set(obj, "JAVA");
			System.out.println("");
			
			// Creates object of desired method by providing the
	        // method name as argument to the getDeclaredMethod
			Method methodCall1 = cls.getDeclaredMethod("method1");
			// invokes the method at runtime
			methodCall1.invoke(obj);
			
			// creates object of desired method by providing the
	        // method name and parameter class as arguments to
	        // the getDeclaredMethod
			Method methodCall2 = cls.getDeclaredMethod("method2", int.class);
			// invokes the method at runtime
			methodCall2.invoke(obj, 19);
			 
			// Creates object of the desired method by providing
	        // the name of method as argument to the 
	        // getDeclaredMethod method
			Method methodCall3 = cls.getDeclaredMethod("method3");
			// allows the object to access the method irrespective 
	        // of the access specifier used with the method
			methodCall3.setAccessible(true);
			// invokes the method at runtime
			methodCall3.invoke(obj);
		} catch (Exception e) {}
	}
}
