package com.practise.khushal.cloning;

public class Animal implements Cloneable{
	private String name;

	public String getName() {
		return name;
	}
	
	public Animal(String name){
		this.name=name;
	}
	
	public String bark()
	{
		return "Hey, I am barking.";
	}
	
	public Animal clone()
	{
		/*return new Animal("Jimmy2222");*/
		Animal ani = new Animal("dcsfsd");
		try {
			ani = (Animal)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  ani;
	}
	
}
