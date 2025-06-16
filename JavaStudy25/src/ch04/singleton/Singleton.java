package ch04.singleton;

public class Singleton {
	// �̱����� �� 1���� ��ü�� ���� �� �ֵ��� �����ϴ� ���.
	// ������ �̱����� �������� �ʴ´�.
	// ��, �����Ҷ� private static�� �����Ѵ�.
		
	// ���� �ʵ� (�̱����� �ڽ� ��ü�� �̸� 1�� ����� ���� ���� �޼��忡�� ȣ����)
	private static Singleton singleton = new Singleton();
		
		
		
	// ���� ������
	private Singleton() {
		// private�̶� �ڽ� Ŭ������ ��ü�� ������ִ�.
	}
		
	// ���� �޼���
	public static Singleton getInstance() { // �̱��� ��ü�� ����� �޼���
		return singleton;
	}
}
