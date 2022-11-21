package Phone;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone p2 = new Phone(); 추상클래스는 인스턴스화 할 수 없는 클래스
		
		 Phone phone = new SmartPhone("홍길동");
		 phone.turnOn();
		 phone.turnOff();
//		 phone.internetSearch();		// 다형성 부모클래스는 상속된 자식클래스에 메서드를 못 가져온다.
		

		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
