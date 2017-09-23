package com.practise.khushal.collection.list;

public class Test1  implements Cloneable{
	String xxx = "abc";
	String yyy = "abc";
	
	public Test1 clone() {
        try {
            return (Test1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((xxx == null) ? 0 : xxx.hashCode());
		result = prime * result + ((yyy == null) ? 0 : yyy.hashCode());
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
		Test1 other = (Test1) obj;
		if (xxx == null) {
			if (other.xxx != null)
				return false;
		} else if (!xxx.equals(other.xxx))
			return false;
		if (yyy == null) {
			if (other.yyy != null)
				return false;
		} else if (!yyy.equals(other.yyy))
			return false;
		return true;
	}
	
}
