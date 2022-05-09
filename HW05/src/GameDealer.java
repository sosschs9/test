// 2021111849 송혜경
import java.util.*;

public class GameDealer {
	String[] suit = {"♣", "♠", "◆", "♥"}; // Joker: 🃟 (Joker suit)
	String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	String joker = "Joker";
	
	public Vector<Card> deck = new Vector<Card>();
	Player P1 = new Player("Computer");
	Player P2 = new Player("Human");
	Scanner scan;
	
	public GameDealer(Scanner scan) {
		this.scan = scan;
	}
	
	public void init() {
		Card c;
		for(int i = 0; i < suit.length; i++) {
			for(int j = 0; j < number.length; j++) {
				c = new Card(suit[i], number[j]);
				deck.add(c);
			}
		}
		c = new Card("🃟", joker);
		deck.add(c);
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public void deal() {
		shuffle();
		for(int i = 0; i < 27; i++) {
			P1.cards.add(deck.remove(0));
		}
		for (int i = 0; i < 26; i++) {
			P2.cards.add(deck.remove(0));
		}
	}
	
	public void playGame() {
		System.out.println("<< 카드 생성 >>");
		init();
		for(int i = 0 ; i < deck.size(); i++) {
			System.out.print(deck.get(i));
			if (i % 13 == 12) System.out.println();
		}
		System.out.println();
		
		System.out.println("\n<< 처음 딜러가 나누어 준 카드 >>");
		deal();
		P1.printCard(); 
		P2.printCard();
		
		int i = 1;
		System.out.printf("<< %d 단계 >>\n\n", i);
		System.out.println("일치하는 숫자를 가진 카드 공개 (2장씩 허용)");
		P1.removeCard(); P1.printCard(); 
		P2.removeCard(); P2.printCard();
		i++;
		
		while(P1.remainCard() != 0 && P2.remainCard() != 0) {
			System.out.print("다음 단계 진행을 위해 Enter 키를 누르세요!");
			scan.nextLine();
			
			System.out.printf("<< %d 단계 >>\n\n", i);
			System.out.println("상대방의 카드를 선택하세요 (Random)");
			System.out.println("====================================");
			Card sel1, sel2;
			sel1 = P1.selectCard(P2);
			sel2 = P2.selectCard(P1);
			P1.cards.add(sel1);
			P2.cards.add(sel2);
			System.out.println("====================================");
			
			P1.printCard(); 
			P2.printCard();
			
			System.out.println("일치하는 숫자를 가진 카드 공개 (2장씩 허용)");
			P1.removeCard(); P1.printCard(); 
			P2.removeCard(); P2.printCard();
			i++;
		}
		System.out.print("경기 종료: ");
		if (P1.remainCard() != 0) {
			System.out.printf("%s가 Joker를 가지고 있음", P1.name);
		}
		else if (P2.remainCard() != 0) {
			System.out.printf("%s가 Joker를 가지고 있음", P2.name);
		}
		
	}
	
}
