package com.practise.khushal.cloning.deep;

public class CopyTest {

	public static void main(String[] args) {
		//Original Object
		Student stud = new Student("John", "Algebra");

		System.out.println("Original Object: " + stud.getName() + " - "+ stud.getSubject().getName());

		//Clone Object
		Student clonedStud = (Student) stud.clone();

		System.out.println("Cloned Object: " + clonedStud.getName() + " - "+ clonedStud.getSubject().getName());

		stud.setName("Dan");
		stud.getSubject().setName("Physics");

		System.out.println("Original Object after it is updated: "+ stud.getName() + " - " + stud.getSubject().getName());

		System.out.println("Cloned Object after updating original object: "+ clonedStud.getName() + " - " + clonedStud.getSubject().getName());

	  }
	}

