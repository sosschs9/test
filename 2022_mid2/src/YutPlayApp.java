// 2021111849 송혜경
public class YutPlayApp {
	public static void main(String[] args) {
		YutPlayer a = new YutPlayer("흥부");
		YutPlayer b = new YutPlayer("놀부");
		int value = 0;
		
		while (true) {
			while (true) {
				value = a.castYut();
				System.out.print(a.toString());
				System.out.print(" --->\n");
				if (value == 1 || value == 2 || value == 3) break;
				if (a.getTotalScore() >= 20) break;
			}
			if (a.getTotalScore() >= 20) break;
			
			while(true) {
				value = b.castYut();
				System.out.print("                               <--- ");
				System.out.println(b.toString());
				if (value == 1 || value == 2 || value == 3) break;
				if (b.getTotalScore() >= 20) break;
			}	
			if (b.getTotalScore() >= 20) break;
		}
		
		System.out.printf("\n흥부: %d, 놀부: %d", a.getTotalScore(), b.getTotalScore());
		int res = a.compareTo(b);
		if (res == 1) System.out.println(" ===> 흥부 승리");
		if (res == -1) System.out.println(" ===> 놀부 승리");
		if (res == 0) System.out.println(" ===> 무승부");
			
		a.displayResult();
		b.displayResult();
		System.out.println("------------------------------------------");
	}
}
