package com.practise.muskan.corejava;

public class YieldClass implements Runnable{
	
	Thread t;
	YieldClass(String str){
		t = new Thread(this,str);
		t.start();
	}
	
	public void run(){
		for(int i=0;i<5; i++){
			if(i % 5 == 0){
				System.out.println(Thread.currentThread().getName() + "  yielding controls.. ");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + "  second controls.. ");
	}
	public static void main(String aa[]){
		new YieldClass("Thread1");
		new YieldClass("Thread2");
		new YieldClass("Thread3");
		
	}
}
    	
	
