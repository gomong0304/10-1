package ch03;

public class ArrayExam {

	public static void main(String[] args) {
		// �ڹ��� �迭 �����غ���
		// �迭�� ���� Ÿ�Կ� ǥ�� ����� ����
		// String[] str1 = new String[30]; 30���� ���ڿ��� ���� ǥ�� ������
		// ȸ���� ���Ѱ� 3�� ������ ���Ѱ� 3��
		// int[] int1 = new int[30]; 30���� ������ ���� ǥ�� ������
		// �迭�� ���ȣ�� �ε������ �θ��� 0������ �����Ѵ�.
		
		int[] scores = {83,90,87,100}; // s�ٿ��� �������ΰ� ǥ������!, ��ü�� �����Ǹ鼭 ���� ��
		/*System.out.println("ù��° ���� ��¿� : " + scores[0]);
		System.out.println("�ι�° ���� ��¿� : " + scores[1]);
		System.out.println("����° ���� ��¿� : " + scores[2]);
		System.out.println("�׹�° ���� ��¿� : " + scores[3]);*/
		
		
		for(int i=0; i<scores.length; i++) {// 
			System.out.println("for���� ����� ���� ��� " + i + "��° " + scores[i] + "��");
		}// for�� ����
		
		
		// ������ ����غ���
		int total=0; // �ʱⰪ ����
		double avg=0.0; // �ʱⰪ ����
		for(int i=0; i<scores.length; i++) {
			total=total+scores[i];		
		}// for�� ����
		System.out.println("���� : " + total );
		System.out.println("�л��� : " + scores.length + " ��");
		System.out.println("��� : " + (avg=(double)total/scores.length));
				
	}// mian �޼��� ����

}// class ����
