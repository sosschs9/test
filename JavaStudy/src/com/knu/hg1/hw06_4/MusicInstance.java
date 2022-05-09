package com.knu.hg1.hw06_4;
import com.knu.hg1.hw06_2.*;

public class MusicInstance {
	public static void main(String[] args) {
		Music m = new Music("흥부전", 1700);
		Classic c = new Classic("캐논", 1732, "파핼벨");
		Pop p = new Pop("바람이 분다", 2004, "이소라");
		
		Music[] musics = new Music[3];
		musics[0] = m;
		musics[1] = c;
		musics[2] = p;
		
	}
}
