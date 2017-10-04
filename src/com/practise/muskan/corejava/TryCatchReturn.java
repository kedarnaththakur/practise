package com.practise.muskan.corejava;

public class TryCatchReturn {
	//return statement in try block
	//error- metod must resukt a result of int int
	int calc(){
		try{
			//first scenario retun in try block error occurs
			//return 1;
			//int x=12/0;
		}catch(Exception e){
			return 10;
		}
		return 10;
		//System.out.println("End"); ///  if any statement after return type unreachable code exception
		//return 10;
	}
	
		public static void main(String[] args) {
			TryCatchReturn ob = new TryCatchReturn();
			System.out.println(ob.calc());
		}

}
