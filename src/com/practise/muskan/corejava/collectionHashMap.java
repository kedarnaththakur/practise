package com.practise.muskan.corejava;

import java.util.HashMap;
import java.util.Map;
//Basic operation on Hash Map
public class collectionHashMap {
	
		
	public static void main(String[] args) {
		Map<String,String> tmap = new HashMap<String,String>();
		 //add key-value pair to hashmap
		
		tmap.put("1", "m");
		tmap.put("2", "u");
		tmap.put("3", "s");
		tmap.put("4", "k");
		tmap.put("5", "a");
		tmap.put("6", "n");
		System.out.println(tmap);
		//getting value for the given key from hashmap
		
		System.out.println("value is:" + tmap.get("4"));
		System.out.println("Is hashmap Empty? " + tmap.isEmpty());
		System.out.println("Remove Element: " + tmap.remove("3"));
		System.out.println(tmap);
		System.out.println("Size of map:" +tmap.size());
		
	}

}
