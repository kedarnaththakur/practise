package com.practise.khushal.designepattern.dao;

import java.util.List;

public interface StudentDAO {

	public List<Student> getAllStudent();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
