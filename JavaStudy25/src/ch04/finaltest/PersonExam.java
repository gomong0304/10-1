package ch04.finaltest;

public class PersonExam {

	public static void main(String[] args) {
		// �ʵ忡 final�� ���� ��ü�� ����غ���.
		Person person = new Person("123456-1234567", "������");
		// ����� ���� �����ڸ� ���ؼ� �о����.
		
		System.out.println("������ : " + person.nation);
		System.out.println("�ֹι�ȣ : " + person.ssn);
		System.out.println("���� : " + person.name);
		
		// person.nation = "USA"; // final�� �ٿ��� �ȹٲ�
		// person.ssn = "98765-123456"; // final�� �ٿ��� �ȹٲ�
		person.name = "����";
		
	}

}
