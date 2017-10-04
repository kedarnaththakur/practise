package com.practise.muskan.corejava;

class MyOwnexception extends Exception {
	public MyOwnexception(String msg) {
		super(msg);
	}
}


class ThrowExample {

	 static void employeeAge(int Age) throws MyOwnexception{
		if(Age<0)
			throw new MyOwnexception("Age cannot be less than 0");
		else 
			System.out.println("Input is Inavalid");
		
	}
	
	public static void main(String[] args) {
		
		try{
			
		employeeAge(-2);
		
		}catch(MyOwnexception e){
			e.printStackTrace();
		}
		
	}

}
