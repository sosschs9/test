package problem1;
import java.util.Scanner;

public class MyArrayListApp {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		MyArrayList list = new MyArrayList();
		
		System.out.print("1. 원본 문자열: ");
		String msg = scan.nextLine();
		
		list.splitString(msg);
		System.out.println("2. 문자열을 공백 기준으로 분리 및 ArrayList에 추가\n" + list.toString());
		
		System.out.print("3. 문자열 변경(2개 문자열 입력 [old][new]): " );
		list.replace(scan.next(), scan.next());
		System.out.println(list.toString());
		
	}
}
