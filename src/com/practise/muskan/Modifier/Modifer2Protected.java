package com.practise.muskan.Modifier;

import com.practise.muskan.corejava.ModifierProtected;

public class Modifer2Protected {

	public static void main(String[] args) {
		
		ModifierProtected mp = new ModifierProtected();
			//System.out.println(mp.addTwoNo(10,20));  --compile type error coz protected data member 
			//cannot be access to other claas
	}

}
