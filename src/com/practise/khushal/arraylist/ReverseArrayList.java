package com.practise.khushal.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
/*		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		System.out.println("List Before Reverse "+list.toString());
		Collections.reverse(list);
		System.out.println("List  After Reverse "+list.toString());
		*/
		
		/*=================================================================*/
		//Collection readOnlyCollection = Collections.unmodifiableCollection(new ArrayList<String>());
		
		/*readOnlyCollection.add("Sydney Sheldon"); //raises UnSupportedOperation exception
		System.out.println(readOnlyCollection.toString());*/
		/*=================================================================*/
		
		/*=================================================================*/
		// making existing ArrayList readonly in Java
       /*  ArrayList readableList = new ArrayList();
        readableList.add("Jeffrey Archer");
        readableList.add("Khalid Hussain");
      
        List unmodifiableList = Collections.unmodifiableList(readableList);
        System.out.println("Unmodifibale List "+unmodifiableList.toString());*/
      
        // add will throw Exception because List is readonly
        // unmodifiableList.add("R.K. Narayan");
      
        // remove is not allowed in unmodifiable list
        // unmodifiableList.remove(0);
      
        //set is not allowed in unmodifiable List
        //unmodifiableList.set(0, "Anurag Kashyap");
		/*=================================================================*/
      
        /*======================================================*/
        //creating Fixed Length List from Array in Java
        //List fixedLengthList = Arrays.asList("Mark" , "Twen");
          
        //fixedLengthList.add("J.K. Rowling1"); //raises Exception
      
        //fixedLengthList.set(0, "J.K. Rowling"); //allowed that's why not read only list
        //System.out.println(fixedLengthList.get(0));
        //System.out.println(fixedLengthList.toString());
        /*======================================================*/
		
		List<String> list  = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list.toString());
		
	Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			//System.out.println(string);
			if (string.equals("A")) {
				list.remove("A");
			}
		}
		System.out.println(list.toString());
    }
}
