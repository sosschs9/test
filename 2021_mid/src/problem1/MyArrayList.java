package problem1;
import java.util.ArrayList;

public class MyArrayList {
	ArrayList<String> list = new ArrayList<String>();
	
	public void splitString(String msg) {
		String[] msgs = msg.split(" ");
		
		for(int i = 0; i < msgs.length; i++)
			list.add(msgs[i]);
	}
	
	public void replace(String old, String newString) {
		int index = -1;
		index =	list.indexOf(old);
		if (index == -1)
			System.out.println("해당 문자열이 ArrayList에 존재하지 않습니다.");
		else {
			list.set(index, newString);
			System.out.println("문자열 교체: " + old + "->" + newString);
		
		}
	}
	
	public String toString() {
		String res = "";
		for(int i = 0; i < list.size(); i++) {
			res += list.get(i);
			if (i != list.size()-1)
				res += ", ";
		}
		
		return "[" + res + "]";
	}
}
