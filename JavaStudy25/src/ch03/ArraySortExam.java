package ch03;

public class ArraySortExam {

	public static void main(String[] args) {
		// �迭�� �ִ� ���� �����Ͽ� ����غ���
		// �������� ���� : ū���� �ڿ� (������...)
		// �������� ���� : �������� �ڿ� (����, �Խ���...)
		// �迭�� �ִ� ���� �¿�� �����ϱ� ���ؼ��� �ӽù�(temp)�� �ʿ�
		// ��������!!
		
		int[] scores = {79, 75, 26, 89, 91, 50, 100};
		//               0   1   2   3   4   5   6
		System.out.println("=======���� �� �迭 ��========");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}// for�� ����
		
		System.out.println();
		System.out.println("=======���� �� �迭 ��========");
		
		for(int j = 0 ; j < scores.length-1 ; j++) {
			// 0 ~ 7-1���� �ݺ��ϴ� �� (���ڸ� ����)
			
			for(int k = 0 ;k < scores.length-1-j ; k++) {
				// 0 ~ 7-1-0 -> 0 ~ 6
				// 0 ~ 7-1-1 -> 0 ~ 5
				// 0 ~ 7-1-2 -> 0 ~ 4
				// 0 ~ 7-1-3 -> 0 ~ 3
				// ��� : ���ڸ� �� ���� �ڵ� (ū�� �ϼ�)
				// j���� k���� ���Ͽ� j ���� ũ�� �ڸ� �ٲ���
				
				if(scores[k] > scores[k+1]) {
					// �տ� �ִ� ���� �ڿ� �ִ� ������ ũ��
					// �ڸ��� �ٲ۴�.
					int temp = scores[k]; // ū���� �ӽù濡 ����
					scores[k] = scores[k+1]; // �������� �տ� ����
					scores[k+1] = temp; // �ӽù��� ū���� �޹濡 ����
					// �ڸ� ���� �Ϸ�
				}// ū�� �񱳿� if�� ����
				
				// ������ �ڵ�
				System.out.println("���� ��.....");
				for(int i=0 ; i < scores.length; i++ ) {
					System.out.print(scores[i] + " ");
				}// ������ for�� ����
				
			}// ���ڸ��� for�� ����
		}// ���ڸ��� for�� ����
		
	}// main �޼��� ����

}// class ����
