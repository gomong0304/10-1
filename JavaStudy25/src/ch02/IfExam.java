package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// if(���ǹ�){ ���๮ }
		//    ���ǹ��� true�� ó�� �Ǹ� �߰�ȣ ������ ����ȴ�.
		//    ���ǹ��� false�� ó���Ǹ� �߰�ȣ ������ ������� �ʴ´�.
		
		Scanner input = new Scanner(System.in);
		// Ű����� �Է� ���� �� �ִ� ��ü�� �����Ͽ� input ������ ����
		
		System.out.println("�ȳ��ϼ���");
		System.out.println("������ ������ �Է��ϼ���!!");
		System.out.print(">>>> ");
		String name = input.next(); // Ű����� �Է¹��� �̸��� name ������ ����
	
		System.out.println("������ ������ �Է��ϼ���!!");
		System.out.print(">>>> ");
		int score = input.nextInt(); // Ű����� �Է¹޴� ������ score�� ����
		
		if (score > 0 && score <= 100) { // 0���� ũ�ų� 100�����̸� true
			if(score >= 90) { //score ������ �Էµ� ���� 90 �̻��̳�?
			System.out.println(name + "��, �Է��Ͻ� ������ 90�� �̻��Դϴ�.");
			System.out.println("���� : " + score + " ��� (A)");
			}	else if(score >= 80) {
				System.out.println(name + "��, �Է��Ͻ� ������ 89~80�� �̻��Դϴ�.");
				System.out.println("���� : " + score + " ��� (B)");
				}	else if(score >= 70) {
					System.out.println(name + "��, �Է��Ͻ� ������ 79~70�� �̻��Դϴ�.");
					System.out.println("���� : " + score + " ��� (C)");
					}	else if(score >= 60) {
						System.out.println(name + "��, �Է��Ͻ� ������ 69~60�� �̻��Դϴ�.");
						System.out.println("���� : " + score + " ��� (D)");
						}	else {
							System.out.println("��, �Է��Ͻ� ������ ���� ��� F�� �����Ǿ����ϴ�.");
							System.out.println("���� : " + score + " ��� (F)");
							} // ������ �ԷµǾ����� ���๮
		}else {
		 System.out.println(name + "�� �Է°��� Ȯ���� �ּ���");
		 System.out.println("���� �Է°��� " + score + "�Դϴ�.");
		}
		System.out.println("======���α׷��� ����Ǿ����ϴ�.=======");
		
	} //main �޼��� ���� -> ���� input, name, score�� �����
}// Class ���� -> �޼��尡 ����� -> ���α׷� ����
 