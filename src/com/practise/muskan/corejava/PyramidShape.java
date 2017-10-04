package com.practise.muskan.corejava;

public class PyramidShape {

	public static void main(String[] args) {
		int num=10;
		for(int i=1;i<num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print("");
			}
			for(int k =1;k<=i;k++){
				System.out.print(""+k+"");
			}
			for(int v =i-1;v>0;v--){
				System.out.print(""+v+""); 
			}
			System.out.println("");
		}
	}
}
