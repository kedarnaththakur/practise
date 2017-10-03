package com.practise.shailendra;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
public class ComparableandCompator implements Comparable<ComparableandCompator> {
	    private int id;
	    private String name;
	    private int age;
	    private long salary;
	    public int getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public long getSalary() {
	        return salary;
	    }
	    public ComparableandCompator(int id, String name, int age, int salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }
	    @Override
	    public int compareTo(ComparableandCompator emp) {
	        return (this.id - emp.id);
	    }
	    @Override
	    //this is required to print the user friendly information about the Employee
	    public String toString() {
	        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
	                this.salary + "]";
	    }
	    public static Comparator<ComparableandCompator>SalaryComparator = new Comparator<ComparableandCompator>() {
	        @Override
	        public int compare(ComparableandCompator e1, ComparableandCompator e2) {
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    };
	    public static Comparator<ComparableandCompator> AgeComparator = new Comparator<ComparableandCompator>() {
	        @Override
	        public int compare(ComparableandCompator e1, ComparableandCompator e2) {
	            return e1.getAge() - e2.getAge();
	        }
	    };
	    public static Comparator<ComparableandCompator>NameComparator = new Comparator<ComparableandCompator>() {
	        @Override
	        public int compare(ComparableandCompator e1, ComparableandCompator e2) {
	            return e1.getName().compareTo(e2.getName());
	        }
	    };
	    public static void main(String[] args) {
	    	ComparableandCompator[] emp1 = new ComparableandCompator[3];
	    	emp1[0] = new ComparableandCompator(10, "Mikey", 25, 10000);
	    	emp1[1] = new ComparableandCompator(20, "Arun", 29, 20000);
	    	emp1[2] = new ComparableandCompator(5, "Lisa", 35, 5000);
	    	Arrays.sort(emp1);
	    	//Arrays.sort(emp1, ComparableandCompator.AgeComparator);
	    	System.out.println("Employees list sorted by Age:\n"+Arrays.toString(emp1));
	    	}
	    }
	    
	

