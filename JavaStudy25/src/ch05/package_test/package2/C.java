package ch05.package_test.package2;

import ch05.package_test.package1.A;
import ch05.package_test.package1.B;

public class C {
	// A,B Ŭ������ �ٸ� Ŭ������
	
	// A a; // default�� ���� ��Ű�������� ȣ�� �ȴ�.
	B b; // public�� ��𼭳� ȣ���� �����ϴ�.
	
	A a1 = new A(true);    // public��
	// A a2 = new A(1);       // default�� -> ���� ��Ű���� �����. ��Ű���� �޶� �ȵȴ�.
	// A a3 = new A("���ڿ�");  // private�� -> A.java������ ���
}
