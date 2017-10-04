package com.practise.khushal.designepattern.composite;

public class CompositePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee CEO = new Employee("Khushal Singh", "IT", "30000");
		Employee headSales = new Employee("Abhay Singh","Sales","30000");
        Employee headMarketing = new Employee("Pravesh Tiwari", "Marketing", "28000");
        
        Employee salesExec1 = new Employee("Sarita", "Sales", "10000");
        Employee salesExec2 = new Employee("Neha", "Sales", "10000");
        
        Employee clerk1 = new Employee("Sanjay", "Marketing", "10000");
        Employee clerk2 = new Employee("Avinash", "Marketing", "10000");
        
        CEO.add(headSales);
        CEO.add(headMarketing);
        
        headSales.add(salesExec1);
        headSales.add(salesExec2);
        
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
        
        //Print All Employees of the organization
        System.out.println("****** "+CEO);
        
        for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println("===== "+headEmployee);
			
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println("----- "+employee);
			}
		}
        	
	}

}
