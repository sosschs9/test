// 2021111849 송혜경
public class ArrayUtilApp {
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c;
		ArrayUtil A = new ArrayUtil();
		
		System.out.println("fill(a) 수행");
		System.out.println("< 배열 a 인덱스 및 내용 출력 >");
		A.fill(a);
		A.print(a);
		System.out.print("\n");
		
		System.out.println("fill(b) 수행");
		System.out.println("< 배열 b 인덱스 및 내용 출력 >");
		A.fill(b);
		A.print(b);
		System.out.print("\n");
		
		System.out.println("concat(a, b) 수행 및 배열 c 생성");
		c = A.concat(a, b);
		A.print(c);
		System.out.print("\n");
		
		System.out.println("compare(a, b) 수행");
		int res = A.compare(a, b);
		System.out.printf("a의 최대값: %d, b의 최댓값: %d\n", A.maxA, A.maxB);
		if (res == 1) System.out.println("a > b");
		else if(res ==  0) System.out.println("a == b");
		else System.out.println("a < b");
	}
	
}
