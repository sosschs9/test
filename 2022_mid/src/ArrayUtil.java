// 2021111849 송혜경
public class ArrayUtil {
	int maxA = 0, maxB = 0;
	
	public void fill(int[] a) {
		for(int i = 0; i < 10; i++) {
			int r = (int)(Math.random() * 99 + 1); // 1~99
			a[i] = r;
		}
	}
	
	public int[] concat(int[] a, int[] b) {
		int[] c = new int[20];
		
		for(int i = 0; i < a.length; i++)
			c[i] = a[i];
		for(int i = 0; i < b.length; i++)
			c[i + a.length] = b[i];
		
		return c;
	}
	
	public int compare(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if (a[i] > maxA)
				maxA = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			if (b[i] > maxB)
				maxB = b[i];
		}
		
		if (maxA > maxB) return 1;
		else if (maxA < maxB) return -1;
		else return 0;
	}
	
	public void print(int[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.printf("%4d", i);
		System.out.print("\n[");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
			if (i != a.length-1) System.out.print(",");
		}
		System.out.print("]\n");
	}
}
