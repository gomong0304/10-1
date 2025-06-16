package ch05.package_test.package2;

import ch05.package_test.package1.A;
import ch05.package_test.package1.B;

public class C {
	// A,B 클래스는 다른 클래스임
	
	// A a; // default로 같은 패키지에서만 호출 된다.
	B b; // public은 어디서나 호출이 가능하다.
	
	A a1 = new A(true);    // public용
	// A a2 = new A(1);       // default용 -> 같은 패키지만 허용함. 패키지가 달라서 안된다.
	// A a3 = new A("문자열");  // private용 -> A.java에서만 허용
}
