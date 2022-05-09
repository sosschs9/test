package com.knu.hg1.hw06_2;

public class Music {
	protected String name;
	protected int year;
	
	public Music(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public Music() {
		toString();
	}
	
	public String toString() {
		return "Music [°î¸í =]" + name + ", ¿¬µµ=" + year + "]";
	}
}

