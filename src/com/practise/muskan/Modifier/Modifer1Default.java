package com.practise.muskan.Modifier;

import com.practise.muskan.corejava.*;

public class Modifer1Default {

	public static void main(String[] args) {
		ModifierDefault m = new ModifierDefault();
			//System.out.println("Sum is :"  +m.addTwoNumber(10, 120)); compile type error coz defaullt data member 
		//cannot be access to other claas
	}

}

/*
----------+-------+---------+--------------+--------------+--------
| Class | Package | Subclass     | Subclass     |Outside|
|       |         |(same package)|(diff package)|Class  |
————————————+———————+—————————+——————————----+—————————----—+————————
public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
————————————+———————+—————————+—————————----—+—————————----—+————————
protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
————————————+———————+—————————+————————----——+————————----——+————————
default     | Yes   |  Yes    |    Yes       |    No        |   No  |
————————————+———————+—————————+————————----——+————————----——+————————
private     | Yes   |  No     |    No        |    No        |   No  |
------------+-------+---------+--------------+------------*/