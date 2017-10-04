package com.practise.khushal.designepattern.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO{

	List<Student> students;
	
	public StudentDaoImpl()
	{
		System.out.println("Inside implementation class");
		students = new ArrayList<Student>();
		Student student1 = new Student("Khushal Singh", 0);
		Student student2 = new Student("Avinash Singh", 1);
		students.add(student1);
		students.add(student2);
		
	}
	
	
	@Override
	public List<Student> getAllStudent() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
         students.get(student.getRollNo()).setName(student.getName());		
	     System.out.println("Student Roll No "+student.getRollNo()+" updated in database");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student);
		System.out.println("Student Roll No "+student.getRollNo()+" deleted from database");
	}

}
