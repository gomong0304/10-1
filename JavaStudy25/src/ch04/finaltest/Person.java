package ch04.finaltest;

public class Person {
	// �ʵ� ���� final�� ���̸� �ʱⰪ�� �������� �ȴ�.
	// ������� �ʴ� ������ ����Ѵ�.
	public final String nation = "Korea";
	public final String ssn; // �ʱⰪ�� �������� �����ڷ� �о����.
	public String name;
	
	// �ļ���
	public Person() {
		ssn = null;
	}
	public Person (String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
	}
}
