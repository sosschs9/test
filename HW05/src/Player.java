// 2021111849 송혜경
import java.util.*;

public class Player {
	Vector<Card> cards = new Vector<Card>();
	Vector<Card> openCard = new Vector<Card>();
	String name;
	
	public Player(String user) {
		this.name = user;
	}
	
	public int remainCard() {
		return cards.size();
	}
	
	public void removeCard() {
		for(int i = 0; i < cards.size()-1; i++) {
			String str1 = cards.get(i).number;
			for(int j = i+1; j < cards.size(); j++) {
				String str2 = cards.get(j).number;
				if (str1.equals(str2)) {
					openCard.add(cards.remove(i));
					openCard.add(cards.remove(j-1));
					i--;
					break;
				}
			}
		}
	}
	
	public Card selectCard(Player counter) {
		System.out.printf("%-9s 선택: ", name);
		int r = (int)(Math.random()*counter.remainCard());
		System.out.printf("[%2d]" + counter.cards.get(r) + "가져옴\n", r);
		return counter.cards.remove(r); 
	}
	
	public void printCard() {
		System.out.printf("[%s]\n", name);
		System.out.printf("공개한 카드: %d장\n", openCard.size());
		for (int i = 0; i < openCard.size(); i++) {
			System.out.print(openCard.get(i));
			if (i % 10 == 9) System.out.println();
		}

		System.out.printf("\n\n가지고 있는 카드: %d장\n", cards.size());
		for (int i = 0; i < cards.size(); i++) {
			System.out.printf("[%2d]", i);
			System.out.print(cards.get(i));
			if (i % 10 == 9) System.out.println();
		}
		System.out.println("\n---------------------------------------------------------------------------------");
	}
	
}
