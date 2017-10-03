package com.practise.shailendra;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Failsafe {
	    public static void main(String[] args) 
	    {
	    	//safe();
	    	fast();
	    }
	    	public static void fast() {
	       ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	    	/*	ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
	            map.put("ONE", 1);
	            map.put("TWO", 2);
	            map.put("THREE", 3);
	            map.put("FOUR", 4);
	        System.out.println("111 "+map.toString());
	        //Getting an Iterator from list
	        Iterator<Integer> it = map.iterator();
	        //map.remove(3);
	        Iterator<ConcurrentHashMap.Entry<String, Integer>> it = map.entrySet().iterator();*/
	        /*while (it.hasNext()) {
	        	ConcurrentHashMap.Entry<String, Integer> entry = it.next();
	        	if(entry.getKey().equals("ONE")) {
		              it.remove();
		            }
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	        }*/
	    	Iterator<Integer> it = list.iterator();
	        while (it.hasNext())  {
	            Integer integer = (Integer) it.next();
	           // list.add(3);      //This will throw ConcurrentModificationException
	            if(integer==3) {
	            it.remove();
	            }
	        }
	        System.out.println("222 "+list.toString());
	    }    
	  /*  public static void safe() {	  //Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        //Getting an Iterator from map
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(key+" : "+map.get(key));
            map.put("FIVE", 5);     //This will not be reflected in the Iterator
            System.out.println("FailSafeIterator:::::::::::::::"+map);
        }
	    }  */  

	    	public static void array(){
	            
	            String removeElem = "Perl";
	           ArrayList<String> myList = new ArrayList<>();
	            myList.add("Java");
	            myList.add("Unix");
	            myList.add("Oracle");
	            myList.add("C++");
	            myList.add("Perl");
	            System.out.println("Before remove:");
	            System.out.println(myList);
	            Iterator<String> itr = myList.iterator();
	            while(itr.hasNext()){
	                if(removeElem.equals(itr.next())){
	                    itr.remove();
	                }
	            }
	            System.out.println("After remove:");
	            System.out.println(myList);
	        }

}
