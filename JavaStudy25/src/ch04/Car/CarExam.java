package ch04.Car;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// �ڵ��� �� ���� ���α׷� -> �� 1��ϱ� �迭 �ʿ� ����
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		System.out.println("===���� ���� �Է�===");
		Car myCar = new Car(); // �⺻ �����ڷ� ��ü ������
		// ������ �ӵ� rpm oil���� �⺻ ������ ������ ��.-> Car Ŭ������ �����ױ� ������
		System.out.print("���� ���� ȸ�� : ");
		myCar.company = input.next();
		
		System.out.print("���� �� : ");
		myCar.model = input.next();
		
		System.out.print("���� ���� : ");
		myCar.color = input.next();
		
		
		
		while (run) {
			System.out.println("1. ���� ���� Ȯ��");
			System.out.println("2. ���� �õ� �ɱ�");
			System.out.println("3. ���� ���� ����");
			System.out.println("4. ���� ���� ����");
			System.out.print("1~4 ���ڸ� >>> ");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("���� �����Դϴ�.");
				System.out.println("������ : " + myCar.company);
				System.out.println("���� �� : " + myCar.model);
				System.out.println("���� ���� : " + myCar.color);
				break;
			
			case "2" :
				System.out.println("������ �õ��� �̴ϴ�.");
				myCar.start(); // Car Ŭ������ ������ ����
				break;
			
			
			}// ���� �޴� ����ġ�� ����
		
		
		}// ���� while�� ����
		
		
		
		
		

	}// main �޼��� ����

}// class ����
