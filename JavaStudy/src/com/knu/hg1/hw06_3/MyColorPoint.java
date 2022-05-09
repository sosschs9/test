package com.knu.hg1.hw06_3;

public class MyColorPoint extends Mypoint{
	private String Color;
	private int x;
	private int y;
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.Color = color;
	}

	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	@Override
	protected void reverse() {
		int tmp;
		
		tmp = this.x;
		this.x = this.y;
		this.y = tmp;
	}
	
	protected void show() {
		System.out.println(x + "," + y + "," + Color);
	}
	
	public static void main(String[] args) {
		Mypoint p = new MyColorPoint(2,3,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}
}
