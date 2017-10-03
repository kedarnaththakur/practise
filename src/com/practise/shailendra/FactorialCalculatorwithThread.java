package com.practise.shailendra;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class FactorialCalculatorwithThread implements Callable<Integer>{
	private Integer number;
    public FactorialCalculatorwithThread(Integer number) {
        this.number = number;
    }
    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(2000);
            }
        }
        System.out.println("Result for number " + number + " -> " + result);
        return result;
    }
    public static void main(String[] args)
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        System.out.println("::::::"+executor);
        ArrayList<Future<Integer>> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<4; i++)        {
            Integer number = random.nextInt(10);
            FactorialCalculatorwithThread calculator  = new FactorialCalculatorwithThread(number);
            Future<Integer> result = executor.submit(calculator);
            resultList.add(result);
        }
        for(Future<Integer> future : resultList) {
              try{
                  System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
              }catch (InterruptedException | ExecutionException e){
                  e.printStackTrace();
              }
          }
          //shut down the executor service now
          executor.shutdown();
    }

}
