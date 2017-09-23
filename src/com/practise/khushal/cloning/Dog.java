package com.practise.khushal.cloning;

public class Dog extends Animal{

	public Dog(String name){
		super(name);
	}
	
	public String bark()
	{
		return "Heyyyyyyyyyyyyyyyyyy.";
	}
	
	public Dog clone(){
		return (Dog)super.clone();
	}
}
