import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class Practice {
	public static void main(String argv[]) {
		Book[][] book = new Book[3][2];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			for(int j = 0; j < book[0].length; j++)
				book[i][j] = new Book("Hello", "Java");
		}
		
		for(int i = 0; i < book.length; i++) {
			for(int j = 0; j < book[0].length; j++) {
				//book[i][j] = new Book("Hello", "Java");
				System.out.print(book[i][j].title + book[i][j].author);
			}
			System.out.println();
		}
	}
}

/*
* String 관련 함수
	1. equals(): 문자열이 동일한 값을 가지고 있는지 비교
	str1.equals(str2);
	
	2. indexOf(): 문자열에서 특정 문자가 시작되는 인덱스를 리턴
	str1.indexOf("a");
	
	3. substring(): 문자열 중 특정 부분을 뽑아낼 경우 사용
	str1.substring(5,8);
	
	4. toUpperCase(), toLowerCase(): 문자열 모두를 대문자 및 소문자로 변경할 때 사용
	str1.toUpperCase();
	
	5. concat():문자열을 이어줌
	str3 = str1.concat(str2);
	
	6. startWith(): 문자열이 지정한 문자로 시작하는지 true or false
	7. endWith(): 문자열이 마지막에 지정한 문자가 있는지 true or false
	
	8. replaceAll(): 문자열중 특정 문자를 다른 문자로 바꾸고 싶을 경우
	9. replace(): 특정 문자를 원하는 문자로 변경하고 싶을 경우
	str1.replaceAll("Apple", "banana");
	str1.replace(" ", ", ");
	
	10. split(): 지정한 문자로 문자열을 나눌 수 있다. 배열로 반환
	String[] sp = str1.split(" ");
	
	11. trim(): 문자열의 시작과 끝에 있는 공백을 없애준다.
	
	12. compareTo(): 두개가 같으면 0 반환
	str1.compareTo(str2);
	
	13. contains(): 두 개의 스트링을 비교해 비교대상 String을 포함하고 있으면 true 반환
	str1.contains("abs");, str1.contains(str2);
*/