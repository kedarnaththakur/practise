package com.practise.muskan.corejava;

public class PrivateModifer {

	public static void main(String[] args) {
		TEst ts = new TEst();
		//System.out.println(ts.num); --compiler tym error coz private class data member access within the classpublic 

	}

}


class TEst{
	private double num = 100;
	private int square(int a){
		return a*a;
		
	}
}
