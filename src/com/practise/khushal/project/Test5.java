package com.practise.khushal.project;

public class Test5 extends Thread{

	public void run()
	{
		System.out.println("running....");
	}
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		t1.start();
		t1.start();
		

	}

}
