package com.practise.khushal.designepattern.singleton;

/*  In computer programming, lazy initialization is the tactic
 *  of delaying the creation of an object, the calculation of
 *  a value, or some other expensive process until the first
 *  time it is needed. In singleton pattern, it restricts the
 *  creation of instance until requested first time. Lets see 
 *  in code:*/
public class LazySingleton {
    private LazySingleton(){}
    private static volatile LazySingleton instance = null;
    public static LazySingleton getInstance()
    {
    	if (instance==null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
    	return instance;
    }
}

/*  On first invocation, above method will check if instance
 *  is already created using instance variable. If there is
 *  no instance i.e. instance is null, it will create an 
 *  instance and will return its reference. If instance is
 *  already created, it will simply return the reference of 
 *  instance.

 *  But, this method also has its own drawbacks. Lets see how.
 *  Suppose there are two threads T1 and T2. Both comes to
 *  create instance and execute “instance==null”, now both 
 *  threads have identified instance variable to null thus
 *  assume they must create an instance. They sequentially
 *  goes to synchronized block and create the instances. 
 *  At the end, we have two instances in our application.
 *  */
 