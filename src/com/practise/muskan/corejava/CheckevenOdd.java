package com.practise.muskan.corejava;

import java.util.Scanner;
//by manual entry
//by loop 
public class CheckevenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no: ");
		 int i=scan.nextInt();
		/*for(int i=1;i<=10;i++){*/
			if(i%2==0){
				System.out.println(i+ " :no is even");
			}else{
				System.out.println(i+ " :no is odd");
			}
		/*}*/
			

	}

}
