package ch02;

public class MultiForExam {

	public static void main(String[] args) {
		// for�� ���ʿ� �Ǵٸ� for���� �־� �׽�Ʈ �غ���.
		
		// 9x9���� ����� ����.
		// ó�� 2x1=2 ~ 2x9=18
		// �� 9x1=9 ~9x9=81
		
		// �մܿ� for�� ����
		for(int m=2; m<= 9; m++) { // 2~9���� 1�� �����Ѵ�
			System.out.println(); // ���� ȿ���� ����
			System.out.println("==========="+ m + "��==========");
			
			//�޴��� for�� ����
				for(int n=1; n<=9; n++) { // 1~9���� 1�� ����
					System.out.print(" " +  m + "X" + n + "=" + (m*n) + " ");
				}			
		}
	}// main�޼ҵ� ����
}// class����
