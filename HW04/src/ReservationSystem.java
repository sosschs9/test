// 2021111849 송혜경

public class ReservationSystem implements ReservationInterface {
	int[][] arr;
	private String row, col;
	private int int_row, int_col;
	
	@Override
	public void makeSeats(int row, int col) {
		this.arr = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++)
				arr[i][j] = 0;
		}
	}

	@Override
	public int reserveSeat(String seatName) {
		row = seatName.substring(seatName.length()-1, seatName.length());
		col = seatName.substring(0, seatName.length()-1);
		
		// String.charAt(index) -> index번째 문자 리턴
		
		char[] rows = row.toCharArray();
		int_row = arr.length - (rows[0]-'A') - 1;
		// row[0]-'A'만 하면 그냥 0이 나옴
		try {
			int_col = Integer.parseInt(col) - 1;
			// 정수로 된 문자열을 정수형으로 바꿔줌.
		}
		catch(NumberFormatException e) {
			System.out.println(seatName + "숫자가 아닌 잘못된 좌석 이름입니다.");
			return 1;
		}
		
		try {
			if(arr[int_row][int_col] == 0) {
				arr[int_row][int_col] = 1;
				System.out.printf("[예약 성공] %s\n", seatName);
				return 0;
			}
			else {
				System.out.printf("[예약 실패] %s: 이미 예약된 좌석입니다.\n", seatName);
				return -1;
			}
		}
		catch (Exception e) {
			//System.out.println(seatName + ": 좌석의 범위를 넘은 잘못된 좌석 이름입니다.");
		}
		
		return 1;
	}

	@Override
	public int cancelSeat(String seatName) {
		row = seatName.substring(seatName.length()-1, seatName.length());
		col = seatName.substring(0, seatName.length()-1);
		
		char[] rows = row.toCharArray();
		int_row = arr.length - (rows[0]-'A') -1;
		try {
			int_col = Integer.parseInt(col) - 1;
		}
		catch(NumberFormatException e) {
			System.out.println(seatName + "숫자가 아닌 잘못된 좌석 이름입니다.");
			return 1;
		}
		
		try {
			if(arr[int_row][int_col] == 0) {
				System.out.printf("[예약 취소 실패] %s: 예약 되지 않은 좌석입니다.\n", seatName);
				return -1;
			}
			else if (arr[int_row][int_col] == 1) {
				System.out.printf("[예약 취소 성공] %s\n", seatName);
				arr[int_row][int_col] = 0;
				return 0;
			}
		}
		catch (Exception e) {
			//System.out.println(seatName + ": 좌석의 범위를 넘은 잘못된 좌석 이름입니다.");
		}	
		
		return 1;
	}

	@Override
	public void displaySeat(String systemTitle) {
		int totalSeat = arr.length * arr[0].length;
		int reserved = 0;
		
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[0].length; j++)
				if (arr[i][j] == 1) reserved++;
			
		System.out.printf("[%s 예약 현황] 예약 좌석: %d/ 총 좌석: %d\n\n", 
				systemTitle, reserved, totalSeat);
		
		for(int i = 0; i < arr.length; i++) {
			if (i == arr.length/2) {
				System.out.println("--------------------------------------------------");
				System.out.println("  앞                    통로                       뒤");
				System.out.println("--------------------------------------------------");
			}
			
			for(int j = 0; j < arr[0].length; j++)
				System.out.printf("[%2d%c]", j+1, arr.length+'A'-i-1);
			System.out.print("\n");
			for(int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0)
					System.out.print("   O ");
				else if (arr[i][j] == 1)
					System.out.print("   X ");
			}
			System.out.print("\n");
		}
	}

}
