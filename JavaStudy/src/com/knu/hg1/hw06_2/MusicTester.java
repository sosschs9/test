package com.knu.hg1.hw06_2;

public class MusicTester {
	public static void main(String[] args) {
		Music m1 = new Music("흥부전", 1700);
		Classic m2 = new Classic("운명", 1808, "베토벤");
		Pop m3 = new Pop("보헤미안 랩소디", 1980, "퀸");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}
