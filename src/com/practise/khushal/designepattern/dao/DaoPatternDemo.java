package com.practise.khushal.designepattern.dao;

public class DaoPatternDemo {

	/**
	 *  Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations from high level 
	    business services. Following are the participants in Data Access Object Pattern.

	 *  Data Access Object(DAO) Interface - This interface defines the standard operations to be performed on a model object(s).

     *  Data Access Object(DAO) concrete class - This class implements above interface. This class is responsible to get data from a 
        data source which can be database / xml or any other storage mechanism.

     *  Model Object or Value Object - This object is simple POJO containing get/set methods to store data retrieved using DAO 
        class.

       
     *  Implementation in Steps
     *  ****************************************************************************
     *  We are going to create a Student object acting as a Model or Value Object.
     *  StudentDao is Data Access Object Interface.
     *  StudentDaoImpl is concrete class implementing Data Access Object Interface. 
     *  DaoPatternDemo, our demo class, will use StudentDao to demonstrate the use of Data Access Object pattern.
	 */
	
	public static void main(String[] args) {
		 StudentDAO studentDao = new StudentDaoImpl();

	      //print all students
	      for (Student student : studentDao.getAllStudent()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }

	      System.out.println();
	      System.out.println();

	      //update student
	      Student student =studentDao.getAllStudent().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      System.out.println();
	      System.out.println();

	      
	      //get the student
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		


	}

}
