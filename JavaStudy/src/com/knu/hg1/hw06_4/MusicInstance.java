package com.knu.hg1.hw06_4;
import com.knu.hg1.hw06_2.*;

public class MusicInstance {
	public static void main(String[] args) {
		Music m = new Music("�����", 1700);
		Classic c = new Classic("ĳ��", 1732, "���ۺ�");
		Pop p = new Pop("�ٶ��� �д�", 2004, "�̼Ҷ�");
		
		Music[] musics = new Music[3];
		musics[0] = m;
		musics[1] = c;
		musics[2] = p;
		
	}
}
