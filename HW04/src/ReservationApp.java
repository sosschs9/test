// 2021111940 송혜경
import java.util.Scanner;
import java.util.InputMismatchException;

public class ReservationApp {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		AirlineSystem A = new AirlineSystem(scan);
		BusSystem B = new BusSystem(scan);
		
		A.makeSeats(4, 10);
		B.makeSeats(3, 10);
		
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println(" K-Startup의 통합 예약 시스템을 방문해 주셔서 감사합니다. ");
			System.out.println("   1. 항공사 예약 시스템");
			System.out.println("   2. 버스 예약 시스템");
			System.out.println("   0. 통합 예약 시스템 종료");
			System.out.println("----------------------------------------------");
			System.out.print(" 메뉴를 선책해주세요: ");
			
			try {
				switch(scan.nextInt()) {
				case 0:
					System.out.println("K-Startup 통합 예약 시스템을 종료합니다.");
					System.exit(1);
					break;
				case 1:
					A.implement();
					break;
				case 2:
					B.implement();
					break;
				default:
					System.out.println("잘못된 메뉴 선택입니다. 다시 입력하세요(0~2)");
				break;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴 선택입니다. 숫자를 다시 입력해주세요 (0~2)");
				scan.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다. 이거 중요!!
				continue;
			}	
		}
	}
}
