// 2021111849 송혜경
import java.util.Scanner;

public class LottoGeneration {
	static boolean repeat(int arr[], int size, int num) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == num) return true;
		}
		return false;
	}
	
	static void printArr(int arr[], int n) {
		System.out.printf("Lotto [%d]:", n);
		for (int i = 0; i < 6; i++)
			System.out.printf("%3d", arr[i]);
		System.out.print("\n");
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int lotto[] = new int[6];
		int cnt[] = new int[45];
		int n;
		
		while (true) {
			System.out.print("Lotto 수행 회수를 입력하세요 (1~5): ");
			n = scan.nextInt();
			if (n < 1 || n > 5)
				System.out.println("1에서 5사이의 숫자를 다시 입력하세요.\n");
			else break;
		}			
		
		for (int i = 0; i < n; i++) 
		{
			for (int k = 0; k < 6; k++) {
				int r = (int)(Math.random() * 45 + 1);
				if (repeat(lotto, k, r)) {
					k--;
					continue;
				}
				lotto[k] = r;
				cnt[r-1]++;
			}
			printArr(lotto, i+1);
		}
		
		System.out.println("Lotto 번호별 빈도수");
		for (int i = 0; i < 45; i++) {
			if (cnt[i] != 0) {
				System.out.print(i+1 +": ");
				for (int j = 0; j < cnt[i]; j++)
					System.out.print("*");
				System.out.print("\n");
			}
		}
		
		scan.close();
	}
}
