package ch04.staticBlock;

public class Calculator {
	// ���ڰ���� ��ü
	// static�� �̿��Ͽ� �����غ���.
	// �ʵ�
	public static double pi = 3.14159;
	public static String name; // ���� �̸�
	public static String date; // ���� ����
	public static String owner; // ���� ����'
	public static int result; // ���� ���� �����Ǵ� ���
	
	
	// ������(������ �⺻������) // new ���� ����ϱ� ���� �ʱⰪ
	static {
		name = "ī�ÿ�";
		date = "2025-05-26";
		owner = "������";
	}
	
	// �޼���
	public static int plus(int x, int y) {
		return x + y;	
	}// �÷��� �޼��� ����
	
	public static int minus(int x, int y) {
		return x - y;
	}// ���̳ʽ� �޼��� ����
		
}
