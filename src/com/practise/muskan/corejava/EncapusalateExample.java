package com.practise.muskan.corejava;

public class EncapusalateExample {

	Integer Id;
	String Name;
	
	
	
	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public static void main(String[] args) {
		EncapusalateExample encap = new EncapusalateExample();
		encap.setId(1);
		encap.setName("Muskan");
		System.out.println("Id is " + encap.getId());
		System.out.println("Name is "+ encap.getName());
		System.out.println("class is " +encap.getClass());
	}

}
