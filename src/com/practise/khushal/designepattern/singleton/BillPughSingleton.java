package com.practise.khushal.designepattern.singleton;

/*Bill pugh solution
 Bill pugh was main force behind java memory model changes.
 His principle “Initialization-on-demand holder idiom” 
 also uses static block but in different way. It suggest
 to use static inner class.
 */

public class BillPughSingleton {
 private BillPughSingleton(){}
 private static class LazyHolder{
	 private static final BillPughSingleton instance = new BillPughSingleton();
 }
 public static BillPughSingleton getInstance()
 {
	 return LazyHolder.instance;
 }
}

/*until we need an instance, the LazyHolder
 *  class will not be initialized until required and 
 *  you can still use other static members of BillPughSingleton class.*/
