package com.practise.khushal.vector;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Vector;

public class BasicVectorTest {

	/* The Vector class implements a growable array of objects. Like an array, 
	 * it contains components that can be accessed using an integer index. 
	 * However, the size of a Vector can grow or shrink as needed to 
	 * accommodate adding and removing items after the Vector has been created.
	*/
	
	/*
	 * Vector Class Signature
	 * 
	 * 	public class Vector<E>
    	extends AbstractList<E>
    	implements List<E>, RandomAccess, Cloneable, java.io.Serializable*/
	
	
	/* Below example shows how to create vector object, adding elements to it, 
	 * getting elements by specifying index, getting elements index, 
	 * getting first element, getting last element, and is vector is empty or not.
	*/
	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		
		//11
		// Add the data at the end of the vector
		vt.addElement("Khushal");
		vt.addElement("Shailendra");
		vt.addElement("Muskan");
		// Add the data at the end of the vector
		vt.add("Arpit");
		System.out.println(vt.toString());
		
		// 1st way of iteration
		/*Iterator<String> itr =	vt.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}*/
		
		// 2nd way of itera
		/*for (Iterator iterator = vt.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}*/

		// forword direction
		/*ListIterator<String> itr = vt.listIterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}*/

		//Backword direction for specified position
		ListIterator<String> itr = vt.listIterator(2);
		System.out.println("***********"+itr.hasPrevious());
		while (itr.hasPrevious()) {
			String string = (String) itr.previous();
			System.out.println(string);
		}
				
	}

}
