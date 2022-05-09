package com.knu.hg1.hw06_2;

public class Classic extends Music{
	private String composer;
	
	public Classic(String name, int year, String compose) {
		super(name, year);
		this.composer = compose;
	}
	public Classic() {
		toString();
	}
	public String toString() {
		return "Classic [∞Ó∏Ì =" + name + ", ø¨µµ=" + year + ", ¿€∞Ó∞°=" + composer + "]";
	}
}
