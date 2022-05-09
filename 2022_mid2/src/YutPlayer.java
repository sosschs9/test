// 2021111849 송혜경
public class YutPlayer implements YutInterface {
	String name;
	int[] random = new int[4];
	int totalPrice = 0;
	int one = 0, doo = 0, gae = 0, gul = 0, yut = 0, mo = 0;
	
	public YutPlayer(String name){
		this.name = name;
	}
	
	@Override
	public int castYut() {
		int price = 0;
		
		for(int i = 0; i < random.length; i++) {
			int n = (int)(Math.random() * 2);
			random[i] = n;
			if (n == 1) one++;
		}
		
		switch(one) {
		case 0: // 윷
			price = 4; yut++;
			break;
		case 1: // 걸
			price = 3; gul++;
			break;
		case 2: // 개
			price = 2; gae++;
			break;
		case 3: // 도
			price = 1; doo++;
			break;
		case 4: // 모
			price = 5; mo++;
			break;
		}
		
		totalPrice += price;
		return price;
	}

	@Override
	public int getTotalScore() {
		return this.totalPrice;
	}

	@Override
	public int compareTo(Object obj) {
		YutPlayer o;
		o = (YutPlayer)obj;	//다운 캐스팅
		
		if (this.totalPrice > o.getTotalScore()) return 1;
		else if (this.totalPrice == o.getTotalScore()) return 0;
		else return -1;
	}

	@Override
	public void displayResult() {
		double sum = doo + gae + gul + yut + mo;
		
		System.out.println("------------------------------------------");
		System.out.println("     도     개     걸     윷     모  단위(%)");
		System.out.println("------------------------------------------");
		System.out.printf("%s %5.1f %5.1f %5.1f %5.1f %5.1f", 
				name, doo/sum * 100, gae/sum * 100, gul/sum *100, yut/sum * 100, mo/sum * 100);
		System.out.print("\n");
	}
	
	public String toString() {
		String res = name + " ";
		res += "[";
		for(int i = 0; i < random.length; i++) {
			res += random[i];
			if (i != random.length-1) res += " ";
		}
		res += "]";
		
		switch(one) {
		case 0:
			res += " 윷 (4점/총 " + totalPrice + "점)";
			break;
		case 1:
			res += " 걸 (3점/총 " + totalPrice + "점)";
			break;
		case 2:
			res += " 개 (2점/총 " + totalPrice + "점)";
			break;
		case 3:
			res += " 도 (1점/총 " + totalPrice + "점)";
			break;
		case 4:
			res += " 모 (5점/총 " + totalPrice + "점)";
			break;
		}
		one = 0;
		return res;
	}

}
