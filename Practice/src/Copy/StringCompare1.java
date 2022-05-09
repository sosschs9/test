package Copy;

public class StringCompare1 {
	public static void compareString(String s1, String s2) {
		if (s1.equals(s2))
			System.out.printf("s1(%s) 과 s2(%s)는 동일한 문자열\n", s1, s2);
		else
			System.out.printf("s1(%s) 과 s2(%s)는 다른 문자열\n", s1, s2);
		System.out.printf("s1 객체 주소: 0x%x\n", System.identityHashCode(s1));
		System.out.printf("s2 객체 주소: 0x%x\n", System.identityHashCode(s2));
		
		if(s1 == s2)
			System.out.printf("s1과 s2는 객체 주소가 동일\n");
		else 			
			System.out.printf("s1과 s2는 객체 주소가 다름\n");
		System.out.println("----------------------------------------------");
	}
	
	public static void main(String[] args) {
		String s1 = "Apple";
		String s2 = "Apple";
		String s3 = new String("Apple");
		String s4 = "apple";
		
		compareString(s1, s2);
		compareString(s1, s3);
		compareString(s1, s4);
	}
}
