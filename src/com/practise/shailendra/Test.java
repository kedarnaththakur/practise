package com.practise.shailendra;
import java.io.IOException;
public class Test {

	public static void main(String args[]) throws Exception {
		/*String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
		*/
		//int firstNum =19;
		//int secondNum=34;
	//	swap(19,35);
		try {
		int result = power(5,2);
		System.out.println(":::::"+result);
		}catch(Exception e) {
			System.out.println(e.getMessage());	
		}
	}
	public static int power(int n, int p) throws Exception {
		 if (n < 0 || p < 0) {
	            throw new Exception("n and p should be non-negative");
	        }else if (n == 0 || p == 0) {
	        	throw new Exception("n and p should be non-zero");
	        }else {
	        int power =   n*p;
	        
	        return power;
	    }
	}
	public static void swap(int firstNum, int secondNum) {
		/*firstNum = firstNum + secondNum; // 1n=1200, 2n=700
        secondNum = firstNum - secondNum; // 1n=1200, 2n=500
        firstNum = firstNum - secondNum; // 1n=700, 2n=500
*/ 
		int iTempVar = firstNum; // 1n=33, 2n=66, tn=33
	        firstNum = secondNum; // 1n=66, 2n=66, tn=33
	        secondNum = iTempVar; // 1n=66, 2n=33, tn=33
        // original values before swap
        System.out.println("\nAfter swap of 2 numbers :");
        System.out.println("First Number  : " + firstNum);
        System.out.println("Second Number : " + secondNum);
    }
}
			
	
	
	
	
