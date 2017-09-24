package com.practise.kedar.trickey;

public class Trickey3 {

	/**
	 * The first I1==I2 become true because of IntegerCache inner class code become like given below
	 * Integer I1 = Integer.valueOf(127);
	 * Integer I2 = Integer.valueOf(127);
	 * 
	 * default IntegerCache size = 127 but you can increase the size by
	 * -XX:AutoBoxCacheMax=<size>
	 * 
	 */
	
	public static void main(String[] args) {
		Integer I1 = 127;
		Integer I2 = 127;
		
		Integer I3 = 128;
		Integer I4 = 128;
		
		System.out.println(I1 == I2); // true
		System.out.println(I3 == I4);
	}
}

