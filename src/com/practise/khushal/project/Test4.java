package com.practise.khushal.project;

public class Test4 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void run()
	{
		//Thread t = new Thread(Test4);
		//Thread t = new Thread(Test4);t.start();
		
		Test4 run = new Test4();
		Thread t =new Thread(run);
		t.start();
		
		/*Thread t =new Thread();
		Test4.run();*/
	}

}
