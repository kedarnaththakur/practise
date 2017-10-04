package com.practise.khushal.designepattern.singleton;
/*
 Static block initialization
 If you have little idea about class loading sequence,
 you can connect to the fact that static blocks are 
 executed during the loading of class and even before the
 constructor is called. We can use this feature in our
 singleton pattern also like this:
*/
public class StaticBlockSingleton {
	
  private StaticBlockSingleton(){}
  
  private static final StaticBlockSingleton instance;
  
  static
  {
	  try {
		instance = new StaticBlockSingleton();
	} catch (Exception e) {
		throw new RuntimeException("Uffff, i was not expecting this!", e);
	}
  }
  
  public static StaticBlockSingleton getInstance()
  {
	  return instance;
  }
}

/* Above code has one drawback. Suppose there are 5 static fields
 * in class and application code needs to access only 2 or 3,
 * for which instance creation is not required at all. So,
 * if we use this static initialization. we will have one
 * instance created though we require it or not.*/
 