package com.practise.khushal.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveFunction {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//What is difference between two remove() methods of ArrayList class?

        //www.java67.com/2015/03/how-to-remove-duplicates-from-arraylist.html#ixzz4tlhSzdoi
		// If u don't specify the  parameter type then it follows the ( int index ) function.
		//So if u want to remove any object then u should define the  parameter as object
		//list.remove(3);
		
		/*list.remove(new Integer(3));
		
		System.out.println(list.toString());*/
		
		
		/*Start of 2nd task*/
		
       /*	How to Remove Objects from Collection or ArrayList in Java while Traversing - Iterator 
         *  remove() method 
         *  
         *  Answer of this question is as simple as that, you should be using Iterator's 
         *  remove() method to delete any object from Collection you are iterating, but this 
         *  is not the end of this question.
         *  
         *  
         *  Most likely you will be asked to explain, what is difference in removing object 
         *  using remove() method of Collection over remove() method of Iterator and why one 
         *  should use over other?

			Reason is ConcurrentModificationException, if you use remove() method of List, 
			Set or basically from any Collection to delete object while iterating, it will 
			throw ConcurrentModificationException. 

			Though remove() method of java.util.Collection works fine to remove individual 
			object, they don't work well, when you are iterating over collection.  
			Let's see a code example to clear doubts
       */
		//Iterator<Integer> itr = list.iterator();
		/*while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			list.remove(2);
		}*/
		
		/*for (Integer integer : list) {
			list.remove(3);
		}*/
		
		/*while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if (integer==2) {
				itr.remove();
			}
		}*/
		//System.out.println(list.toString());
		
		/*End of 2nd task*/
		
		
		
		
		
		
		
		
		
		
	}

}
