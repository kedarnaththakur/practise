package com.practise.shailendra;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int[] arr = {10, 20, 30, 40};
		final Test2 a = new Test2();
		//System.out.println("PPPPPPPP"+(a.arr(list1)));
	   /*final ArrayList<String> list1=new ArrayList<String>();
		list1.add("Vijay222"); 
		 //a.arr(list1);
		 
		  Iterator<String> itr=list1.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(":::::::::111::"+itr.next());  
		  }
		  System.out.println("PPPPPPPP"+(a.arr(list1)));*/
		/*for(int x : arr)
			{
				System.out.println(x);
			}*/
	}

	public static ArrayList<String> arr(ArrayList<String> list1) {
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  list.add("Ajay111");
		  //Traversing list through Iterator  
		  Iterator<String> itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(":::::::::::"+itr.next());  
		  } 
		  return list;
	}
}
