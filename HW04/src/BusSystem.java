// 2021111940 송혜경
import java.util.Scanner;
import java.util.InputMismatchException;

public class BusSystem extends ReservationSystem {
	Scanner scan;
	int res;
	public BusSystem(Scanner scan){
		this.scan = scan;
	}
	
	public void implement() {
		while(true) {
			System.out.println("-------------------------");
			System.out.println(" 버스 예약 시스템");
			System.out.println(" 1. 좌석 예약");
			System.out.println(" 2. 예약 취소");
			System.out.println(" 3. 예역 현황 조회");
			System.out.println(" 4. 메인 메뉴로 돌아가기");
			System.out.println("-------------------------");
			System.out.print("번호를 선택해수제요: ");
			
			try {
				switch(scan.nextInt()) {
				case 4:
					System.out.println("버스 예약 시스템을 종료하고 메인 메뉴로 돌아갑니다.");
					return;
				case 1:
					System.out.print("예약할 좌석 이름을 입력하세요: ");
					res = reserveSeat(scan.next());
					if (res == 0)
						displaySeat("버스 예약 시스템");
					else if (res == 1)
						System.out.println("[예약 실패]: 잘못된 좌석 이름입니다.");
					break;
				case 2:
					System.out.print("취소할 좌석 이름을 입력하세요: ");
					res = cancelSeat(scan.next());
					if (res == 0)
						displaySeat("버스 예약 시스템");
					else if (res == 1)
						System.out.println("[예약 취소 실패]: 잘못된 좌석 이름입니다.");
					break;
				case 3:
					displaySeat("버스 예약 시스템");
					break;
				default:
					System.out.println("잘못된 메뉴 선택입니다. 다시 입력하세요(1~4).");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴 선택입니다. 숫자를 다시 입력해주세요 (1~4)");
				scan.next();
				continue;
			}		
		}
	}
}
