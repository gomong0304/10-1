package ch03;

public class ArrayMaxMinExam {

	public static void main(String[] args) {
		// �迭�� �ִ� ������ for���� ����Ͽ� �ִ밪�� �ּҰ��� �˾� ������
		
		int[] scores = {78, 90, 40, 33, 45, 75, 60};
		//              0   1   2   3   4   5   6 �ε���
		// scores �迭�� ����� ���� 7�� �־� ���´�
		
		int max = 0; // �ִ밪�� �����ϴ� ����
		int min = 101; // �ּҰ��� �����ϴ� ����
		
		for(int i = 0; i < scores.length; i++) {
		//     0�� �ε������� �迭�� ���̱��� 1�� ������ for��
			
			// �ִ밪�� �ּҰ��� �Ǵ��ؾ��Ѵ�.
			if(scores[i] > max) {
			// �迭�� �ִ� ���� ���� max���� ū��??? true��
				max = scores[i]; // �迭�� �ִ� ���� max ������ ����
			} else if(scores[i] < min) {
				min = scores[i];
			}// if�� ����-> �ִ밪 �ּҰ� �񱳹� ����
			
		}// for�� ����
		
		System.out.println("�迭 scores���� ã�� �ִ밪 : " + max);
		System.out.println("�迭 scores���� ã�� �ּҰ� : " + min);
		

	}// main �޼��� ����

}// class ����
