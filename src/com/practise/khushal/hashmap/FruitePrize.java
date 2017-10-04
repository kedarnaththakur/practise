package com.practise.khushal.hashmap;

public class FruitePrize {
	private String item;
	private int prize;
	
	public FruitePrize(String item, int prize){
		this.item = item;
		this.prize = prize;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + prize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FruitePrize other = (FruitePrize) obj;
		if (prize != other.prize)
			return false;
		return true;
	}
	
	
}
