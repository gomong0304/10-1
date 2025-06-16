package ch04.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// �̱��� ��ü ���� �׽�Ʈ
		// Singleton obj1 = new Singleton(); 
		// Singleton obj2 = new Singleton(); 
		// �ȸ������ ��? �����ڴ� ������ private�� ����Ǿ ������ ����
		// Multiple markers at this line
		// - The constructor Singleton() is not visible
		
		Singleton obj3 = Singleton.getInstance(); // �� 1���� ��ü�� ������.
		Singleton obj4 = Singleton.getInstance(); // ��ü�� �ּҰ� �����
		
		System.out.println("obj3�� obj4�� ������? " + (obj3 == obj4));
	}

}
