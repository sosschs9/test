package com.knu.hg1.hw06_3;

abstract class Mypoint {
	private int x;
	private int y;
	
	public Mypoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected abstract void move(int x, int y); //���ο� x, y ��ġ�� �̵�
	protected abstract void reverse(); //(x, y)���� (y, x)�� ��ġ ����
	protected void show() {
		System.out.println(x + "," + y);
	}
}
