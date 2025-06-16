package ch05.package_test.package1;

public class A { // 접근 제한자를 생략하면 default 접근제한다
	// public 기본 접근 제한자를 삭제하면 디폴트로 적용된다.
	// 같은 패키지일때는 적용이 된다.
	B b; // B클래스의 접근 제한자는 public으로 가능
	
	A a1 = new A(true);    // public용
	A a2 = new A(1);       // default용
	A a3 = new A("문자열");  // private용
	
	// 생성자 오버로딩 3가지로 구현했음
	public A(boolean b) { // public 공용 생성자
		// new A(true)
	}
	
	A(int b){			 // 접근제한자 생략 -> 디폴트 접근 제한자
		// new A(int)
	}
	
	private A(String s) { // private -> 개인전직 생성자
		// new A(String)
	}
	
	
	
}
