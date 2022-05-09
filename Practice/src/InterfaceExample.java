interface PhoneInterface1{
	final int TIMEOUT =10000;
	void sendcall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface1{

	@Override
	public void sendcall() {
		System.out.println("띠리리릴ㄹ링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왓숨둥");
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졋슴ㄴ다");
	}
	
}
public class InterfaceExample {
	public static void main(String args[]) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendcall();
		phone.receiveCall();
		phone.flash();
	}
}
