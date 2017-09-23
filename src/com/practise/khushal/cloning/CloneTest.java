package com.practise.khushal.cloning;

public class CloneTest {

	public static void main(String[] args) {
		Dog dog = new Dog("Jimmy");
		Dog dogClone = dog.clone();
		System.out.println(dogClone.getName());

	}

}
