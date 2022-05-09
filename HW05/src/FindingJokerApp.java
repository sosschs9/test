// 2021111849 송혜경
import java.util.Scanner;

public class FindingJokerApp {
	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameDealer dealer = new GameDealer(scan);
		
		dealer.playGame();
	}
}
