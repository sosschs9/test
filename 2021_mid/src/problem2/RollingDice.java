package problem2;
import java.util.HashMap;

public class RollingDice {
	int[][] arr_2D = new int[6][6];
	int[] arr_1D = new int[12];
	static int count;
	HashMap<Integer, Integer> map;

	RollingDice(){
		map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 12; i++) {
			map.put(i, 0);
		}
	}
	
	public void updateArr1D(int random) {
		arr_1D[random - 1]++;
	}
	public void updateArr2D(int random1, int random2) {
		arr_2D[random1-1][random2-1]++;
		
	}
	public void updateMap() {
		for(int i = 0; i < 12; i++) {
			map.put(i, arr_1D[i]);
		}
	}
	
	public void printMap() {
		for(int i = 1; i < 12; i++) {
			System.out.printf("(%2d:%3d)", i+1, map.get(i));
			if (i != 11) System.out.print(", ");
		}
	}
	
	public void printArr1D() {
		for (int i = 1; i < 12; i++) {
			System.out.printf("%3d", i+1);
		}
		System.out.print("\n");
		for (int i = 1; i < 12; i++) {
			System.out.printf("%3d", arr_1D[i]);
		}
		System.out.print("\n");
	}
	
	public void printArr2D() {
		System.out.print("  ");
		for(int i = 0; i < 6; i++) {
			System.out.printf("%3d", i+1);
		}
		System.out.print("\n");
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("%2d", i+1);
			for(int j = 0; j < 6; j++)
				System.out.printf("%3d", arr_2D[i][j]);
			System.out.print("\n");
		}
	}
	
	public void re_init() {
		count = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++)
				arr_2D[i][j] = 0;	
		}
		for (int i = 0; i < 12; i++) {
			map.put(i, 0);
			arr_1D[i] = 0;
		}
	}
}
