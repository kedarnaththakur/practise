package com.practise.khushal.designepattern.mvc;

public class MVCPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student model  = retriveStudentFromDashboard();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		
		/*System.out.println();
		System.out.println();
		controller.setStudentName("Neeraj Pathak");
		controller.updateView();*/
	}

	
	private static Student retriveStudentFromDashboard()
	{
		Student student  = new Student();
		student.setName("Khushal Singh");
		student.setRollNo("121");
		return student;
	}
}

