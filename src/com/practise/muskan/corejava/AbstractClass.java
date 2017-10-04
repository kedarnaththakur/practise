package com.practise.muskan.corejava;

 class AbstractClass1 extends Class{
	
	private String Salary;

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}
	
	
}

abstract class Class{
	private String name;
	private Integer rollNo;
	
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

}

public class AbstractClass{
	public static void main(String[]args){
		 //INSTIATING AN ABSTRACT CLASS GIVES COMPILE TIME ERROR
		//Class class1= new Class();
		Class class1= new  AbstractClass1();
		class1.setName("Muskan");
		System.out.println("Name is " +class1.getName());
	}
	
}