package com.practise.shailendra;
	public class Singleton {
			private static  volatile Singleton  uniqueInstance;
					private Singleton(){}
	    public static   Singleton  getInstance() {
	        if (uniqueInstance ==null )
	        {
	            synchronized(Singleton.class){
	                if (uniqueInstance ==null ){
	                    uniqueInstance=new Singleton();
	                }
	            }
	        }
	        return uniqueInstance ;
	    }
	    
	    public static  synchronized  Singleton  getInstance1()
	    {
	        if (uniqueInstance ==null ) {
	            uniqueInstance=new Singleton();
	        }
	        return uniqueInstance ;
	    }
	    public static void main(String[] args){
	    	Singleton result = getInstance1();	
	    	System.out.println("111 "+result.toString());
	    }
}
