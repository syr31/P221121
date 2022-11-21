package In1;

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In3 in3 = new In3();		// 인터페이스는 new를 쓸 수 없다.
		ExtendsTest et = new ExtendsTest();

		et.in1Method();
		et.in2Method();

		System.out.println(In1.x);
		System.out.println(In2.x);
//		System.out.println(In3.x);	// x 값 중복 읽어오기 모호하다.
//		The field In3.x is ambiguous

	}

}
