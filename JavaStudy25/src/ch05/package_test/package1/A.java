package ch05.package_test.package1;

public class A { // ���� �����ڸ� �����ϸ� default �������Ѵ�
	// public �⺻ ���� �����ڸ� �����ϸ� ����Ʈ�� ����ȴ�.
	// ���� ��Ű���϶��� ������ �ȴ�.
	B b; // BŬ������ ���� �����ڴ� public���� ����
	
	A a1 = new A(true);    // public��
	A a2 = new A(1);       // default��
	A a3 = new A("���ڿ�");  // private��
	
	// ������ �����ε� 3������ ��������
	public A(boolean b) { // public ���� ������
		// new A(true)
	}
	
	A(int b){			 // ���������� ���� -> ����Ʈ ���� ������
		// new A(int)
	}
	
	private A(String s) { // private -> �������� ������
		// new A(String)
	}
	
	
	
}
