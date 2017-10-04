package com.practise.muskan.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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
		//System.out.println("Remove Element: " + tmap.remove("3"));
		//System.out.println(tmap);
		System.out.println("Size of map:" +tmap.size());
		
		//The method keySet() returns all key entries as a set object. 
		//Iterating through each key, we can get corresponding value object.
		
		Set<String> keys = tmap.keySet();
		for(String key :keys){
			System.out.println("Value of " +keys+ "is: " +tmap.get(key));
		}
		//copy Map content to another HashMap
		
		Map<String, String> hmap1 = new HashMap<>();
		hmap1.put("1", "u");
		hmap1.put("2", "n");
		hmap1.put("3", "n");
		hmap1.put("4", "a");
		hmap1.put("5", "t");
		hmap1.put("6", "i");
		hmap1.put("7", "v");
		hmap1.put("8", "e");
		tmap.putAll(hmap1);
		System.out.println(tmap);
		
		 //how to find whether specified key exists or not. 
		 //By using containsKey() method you can find out the key existance.
		System.out.println(tmap);
		if(hmap1.containsKey("9")){
			System.out.println("contains key");
		}else{
			System.out.println("doen not contains key");
		}
		//whether specified value exists or not.
		//By using containsValue() method you can find out the value existance.
		if(hmap1.containsValue("f")){
			System.out.println("value contains");
		}else{
			System.out.println("does not contian value");
		}
		
		/*Set<Entry<String, String>> enteries = tmap.keySet();
		for(Entry<String,String> enteres1:enteries){
			 System.out.println(enteres1.getKey()+" ==> "+enteres1.getValue());
		}*/
		
		hmap1.clear();
		System.out.println(hmap1);
	}
}
