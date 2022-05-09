package problem2;
import java.util.Scanner;

public class RollingDiceApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, r1, r2;
		RollingDice dice = new RollingDice();
		
		while (true) {
			System.out.println("==============================");
			System.out.println("1. 주사위 던지기");
			System.out.println("2. 통계치 초기화");
			System.out.println("0. 종료");
			System.out.print("메뉴를 선택하세요. => ");

			switch(scan.nextInt()){
			case 0:
				System.out.println("Quit");
				System.exit(1);
				break;
				
			case 1:
				System.out.print("주사위를 던질 회수를 입력하세요: ");
				num = scan.nextInt();
				if (num < 0) {
					System.out.println("\n[Error]입력 에러. 1이상 입력하세요");
					break;
				}
				RollingDice.count += num;
				for(int i = 0; i < num; i++) {
					r1 = (int)(Math.random() * 6 + 1);
					r2 = (int)(Math.random() * 6 + 1);
					
					System.out.printf("(%d+%d)=%2d", r1,r2,r1+r2);
					if(i%5 == 4 || i == num-1) System.out.print("\n");
					else System.out.print(", ");
						
					dice.updateArr2D(r1, r2);
					dice.updateArr1D(r1+r2);	
				}
				dice.updateMap();
				
				System.out.println("\n[주사위 숫자별 빈도수]");
				dice.printArr2D();
				System.out.printf("총 누적 반복 회수: %d\n", RollingDice.count);
				System.out.println("--------------------------------------");
				
				System.out.println("[주사위 합의 빈도수]");
				dice.printArr1D();
				System.out.println("--------------------------------------");
				
				System.out.println("[HashMap(합, 빈도수) 출력]");
				dice.printMap();
				System.out.printf("\nHashMap 전체 빈도수의 합: %d\n", dice.count);
				break;
				
			case 2:
				System.out.println("Clear HashMap's data and Matrix");
				dice.re_init();
				
				System.out.println("\n[주사위 숫자별 빈도수]");
				dice.printArr2D();
				System.out.printf("총 누적 반복 회수: %d\n", RollingDice.count);
				System.out.println("--------------------------------------");
				
				System.out.println("[주사위 합의 빈도수]");
				dice.printArr1D();
				System.out.println("--------------------------------------");
				
				System.out.println("[HashMap(합, 빈도수) 출력]");
				System.out.printf("\nHashMap 전체 빈도수의 합: %d\n", RollingDice.count);
				break;
				
			default:
				System.out.println("\n[Error]입력 에러, 다시 입력하세요.");
			}
		}
	}
}
