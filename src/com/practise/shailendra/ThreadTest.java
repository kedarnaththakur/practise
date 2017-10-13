package com.practise.shailendra;

public class ThreadTest {
	    public static void main(String[] args){
	    	//ThreadB b = new ThreadB();
	       // b.start();
	        /*synchronized(b){
	            try{
	                System.out.println("Waiting for b to complete...");
	                b.wait(100);
	            }catch(InterruptedException e){
	                e.printStackTrace();
	            }
	            System.out.println("Total is: " + b.total);
	        }*/
	       // System.out.println("Total is: " + b.total);
	    	 
	    	        System.out.println("Starting Main Thread...");
	    	        MyRunnableThread mrt = new MyRunnableThread();
	    	        Thread t = new Thread(mrt);
	    	       // t.start();
	    	        while(MyRunnableThread.myCount <= 10){
	    	            try{
	    	                System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
	    	                Thread.sleep(100);
	    	            } catch (InterruptedException iex){
	    	                System.out.println("Exception in main thread: "+iex.getMessage());
	    	            }
	    	        }
	    	        System.out.println("End of Main Thread...");
	    	
	    }
	}
class MyRunnableThread implements Runnable{
	 
    public static int myCount = 0;
    public MyRunnableThread(){
    }
    public void run() {
        while(MyRunnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
}	



/*class ThreadB extends Thread{
	    int total;
	    @Override
	    public void run(){
	        //synchronized(this){
	            for(int i=0; i<100 ; i++){
	                total += i;
	            }
	            notify();
	       // }
	    }
	}*/
	

