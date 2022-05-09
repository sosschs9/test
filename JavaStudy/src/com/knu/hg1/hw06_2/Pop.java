package com.knu.hg1.hw06_2;

public class Pop extends Music{
	private String singer;
	
	public Pop(String name, int year, String sing) {
		super(name, year);
		this.singer = sing;
	}
	
	public Pop() {
		toString();
	}
	
	public String toString() {
		return "Pop [곡명 =" + name + ", 연도=" + year + ", 가수=" + singer + "]";
	}
}
