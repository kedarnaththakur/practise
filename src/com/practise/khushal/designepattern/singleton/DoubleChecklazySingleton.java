package com.practise.khushal.designepattern.singleton;

/*This principle tells us to re-check the instance variable
 *  again in synchronized block in given below way:*/
public class DoubleChecklazySingleton {
   private DoubleChecklazySingleton(){}
   private static volatile DoubleChecklazySingleton instance = null;
   public static DoubleChecklazySingleton getInstance()
   {
	   if (instance==null) {
		synchronized (DoubleChecklazySingleton.class) {
			instance= new DoubleChecklazySingleton();
			if (instance==null) {
					instance = new DoubleChecklazySingleton();
			}
		}
	}
	   return instance;
   }
}

/*  Please ensure to use “volatile” keyword with instance variable
 *  otherwise you can run into out of order write error scenario,
 *  where reference of instance is returned before actually the
 *  object is constructed i.e. JVM has only allocated the memory
 *  and constructor code is still not executed. In this case, 
 *  your other thread, which refer to uninitialized object may
 *  throw null pointer exception and can even crash the whole 
 *  application.*/
 