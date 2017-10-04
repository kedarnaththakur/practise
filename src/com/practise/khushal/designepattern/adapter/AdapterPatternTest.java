package com.practise.khushal.designepattern.adapter;

public class AdapterPatternTest {

	/**
	 * Adapter design pattern is one of the structural design pattern and it is used so 
	 * that two unrelated interfaces can work together. The object that joins these 
	 * unrelated interface is called an Adapter. As a real life example, we can think 
	 * of a mobile charger as an adapter because mobile battery needs 3 volts to charge 
	 * but the normal socket produces either 120V (US) or 240V (India). So the mobile 
	 * charger works as an adapter between mobile charging socket and the wall socket.

       We will try to implement multi-adapter using adapter design pattern in this tutorial.

       So first of all we will have two classes – Volt (to measure volts) and Socket (producing constant volts of 120V).
	 */
	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testClassAdapter()
	{
		SocketAdapter sc = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sc, 3);
		Volt v12 = getVolt(sc, 12);
		Volt v120 = getVolt(sc, 120);
		
		System.out.println("V3 volts using Class adapter  "+v3.getVolts());
		System.out.println("V12 volts using Class adapter  "+v12.getVolts());
		System.out.println("V120 volts using Class adapter  "+v120.getVolts());
    
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	

	private static void testObjectAdapter()
	{
		SocketAdapter sc = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sc, 3);
		Volt v12 = getVolt(sc, 12);
		Volt v120 = getVolt(sc, 120);
		
		System.out.println("V3 volts using object adapter  "+v3.getVolts());
		System.out.println("V12 volts using object adapter  "+v12.getVolts());
		System.out.println("V120 volts using object adapter  "+v120.getVolts());
	}
	
	
	
	private static Volt getVolt(SocketAdapter sa ,  int i)
	{
		switch (i) {
		case 3: return sa.get3Volt();
		case 12: return sa.get12Volt();
		case 120: return sa.get120Volt();
		default: return sa.get120Volt();
		}
	}

}
