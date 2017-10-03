package com.practise.shailendra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		int[] arr = new int[] {2,5,3,8,6,5,0};
		//int a = 5;
		//a= fact(5);
	    // fact1();
		//System.out.println("result::::"  +a);
		//int arr[]= arraySort(arr);
		// printDistinctElements(arr);
		//removeDuplicates(arr);
		String str = "ramhskjhjsgaa";
		//reverse(str);
		//countString(str);
		//findDuplicateChars(str);
		//System.out.println("sstring::::::::::::" + str);
		/*for(int i=0;i<arr.length;i++)
        {
            System.out.println("sort array is" + arr[i]);
        }*/
		int a = 15; 
		//fab(15);
		//arrminmax(arr);
		//check(str);
		Character result= firstNonRepeatedCharacter(str);
		System.out.println("::::::::::::" + result);
	}
	//collection 
	
	public static Character firstNonRepeatedCharacter(String str){
        HashMap<Character,Integer>  cha=  new HashMap<Character ,Integer>();
        Character c ;
        int length= str.length();  // Scan string and build hash table
        for (int i=0;i < length;i++) {
            c=str.charAt(i);
            if(cha.containsKey(c)) {
                cha.put(  c ,  cha.get(c) +1 );
            } else{
                cha.put( c , 1 ) ;
            }
        }
        for (int i =0 ; i < length ; i++ ) {
            c= str.charAt(i);
            if( cha.get(c)  == 1 )
            return c;
        }
        return null ;
    }
	//string 
	public static String check(String str) {
		String s1 = "ABC";
		String s2 = s1.substring(2);
		s1.toLowerCase();
		s2.toUpperCase();
		System.out.println( s1+s2);
		return str;
	}
	
	// array max or min 
	
	public static void arrminmax(int[] a) { 
		int min = a[0]; //  assume first elements as smallest number
		int max = a[0]; //  assume first elements as largest number

		for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}
// fabnonical series
	
	public static int fab(int a) {
		int febCount = 15;
        int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< febCount; i++){
                System.out.print(feb[i] + " ");
        }
		return a;
	}
	
	// map
	public static void findDuplicateChars(String str){
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }

	// reverse string
	public static String reverse(String str) {
		char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        System.out.print(":::::"+ch[i]);
	    }  
	    return rev;  
		
	}
	// Repated character count 
	
	public static void countString (String str) {
		int count=0,len=0;
		String ch = "sdgdhfgdsfagdsgsdgsd";
        do
        {  
          try
          {
          char name[]=ch.toCharArray();
              len=name.length;
              count=0;
              for(int j=0;j<len;j++)
               {
                  if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
                      count++;
               }
              if(count!=0)
                System.out.println(name[0]+" "+count+" Times");
              ch=ch.replace(""+name[0],"");          
          }
          catch(Exception ex){}
        }
        while(len!=1);
	}
	
	
	
	// with recussion
	public static int fact(int a) {
		if (a<=1) {
			return 1;
		}else
			return a*fact(a-1);
			
		//public static void arraysort(int[] arr) {
			
		}
	
	// without recussion
	
	public static void fact1() {
		int fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 } 
		
	// array sorting
	public static int[] arraySort(int[] arr) {
         
		int temp =0;
	    if (arr == null || arr.length <= 1) {
	        return arr;
	    }

	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 1; j < arr.length - i; j++) {
	            if (arr[j - 1] > arr[j]) {
	                temp = arr[j] ;
	                arr[j] = arr[j - 1] ;
	                arr[j-1] = temp ;
	            }
	        }
	    }

	    return arr;
	}

// Unique element 
	
	public static void printDistinctElements(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                   break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }
 public static void removeDuplicates(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        int UniqueElements = arr.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < UniqueElements; i++) 
        {
            for (int j = i+1; j < UniqueElements; j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[j] = arr[UniqueElements-1];
                    UniqueElements--;
                    j--;
                }
            }
        }
        int[] arrayWithoutDuplicates = Arrays.copyOf(arr, UniqueElements);
                for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i]+"\t");
        }
         
    }
}
