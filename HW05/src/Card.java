// 2021111849 송혜경
public class Card {
	String suit, number;
	
	public Card(String suit, String numString){
		this.suit = suit;
		this.number = numString;
	}
	
	public String toString() {
		return "(" + String.format("%s%5s", suit, number) + ")";	
	}
}
