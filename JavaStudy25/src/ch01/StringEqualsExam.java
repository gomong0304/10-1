package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// ���ݱ��� ��� ���� Ÿ���� �⺻Ÿ������ �ڹٿ��� ��ü ���� ����
		// String�� ���� ��ü�� �����ϰ� ������ ������ ���ǻ� �����ؼ� ���
		
		String strval1 = "������" ;
		String strval2 = "������" ;
		String strval3 = new String("������") ; // ��ü��������
		
		System.out.println(strval1 == strval2); // ture
		System.out.println(strval1 == strval3); // false
		// ����� ������ �̸��� ���̶� ���ڷ縦 ������ �ִ°Ͱ� ���� ����
		// ��ü Ÿ���� �ּҸ� �����ֱ� ������ ���ο� strval3�� ���� false�� ���´�
		// ��ü�� �ּҸ� �Ǵ��� ���� == �� �����
		// ��ü�� ���� ���� ������� ���� ����� �޼��带 ����ؾ���
		// String�� ��ü�̰� ��ü ���ʿ��� �޼������ ����ִ�.
		// �޼��尡 ��������� .�� ������ ���δ�.
		
		boolean eq1 = strval1.equals(strval3);
		System.out.println("1�� 3���� equals�޼��� ��� ��� : " + eq1);
		
		// ��� String�� �ϳ��� ��ü�� �ȿ� ������ ���ԵǾ��ִ�.
		// String���� �񱳸� �Ҷ��� == ���ٴ� equals �޼��带 �������
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
