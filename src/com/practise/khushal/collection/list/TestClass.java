package com.practise.khushal.collection.list;

public class TestClass implements Cloneable{
		
	private String name;
	
	   public TestClass(String name) {
	        this.name = name;
	    }
	
	public String getName() {
		return name;
	}
	

	 public TestClass clone() {
		  try {
	            return (TestClass) super.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	            throw new RuntimeException();
	        }
	    }

	public static void main(String[] args){
		TestClass tc = new TestClass("Khushal");
		//try {
			TestClass tc1=(TestClass)tc.clone();
			System.out.println(tc1.getName());
		/*} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}*/
		
	}
}