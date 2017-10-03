package com.practise.shailendra;
class Thread1 extends Thread
{
  @Override
  public void run()
  {
      for(int i = 0; i <= 10; i++)
      {
          System.out.println(i);
      }
  }
}
class Thread2 extends Thread
{
  @Override
  public void run()
  {
      for(int i = 1990; i<= 2000; i++)
      {
          System.out.println(i);
      }
  }
}
class MyThread implements Runnable
{
    @Override
    public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 1000; i++)
        {
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
    }
}

public class ThreadsInJava
{
  //Main Thread
  public static void main(String[] args)
  {
      Thread1 t1 = new Thread1();
      t1.start();
      Thread2 t2 = new Thread2();
      t2.start();
  }
}
