package com.practise.khushal.cloning.deep;

public class Student implements Cloneable{
	private String name;
	private Subject subject;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	
	public Student(String name, String sub){
		this.name=name;
		subject = new Subject(sub);
	}
	
	//Shallow copy
	/*public Object clone(){
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}*/
	
	//Deep copy
	public Object clone() {
		Student s = new Student(name, subject.getName());
		return s;
	  }
	
}
