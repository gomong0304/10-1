package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch�� ���� ����̴�.
		// ������ ������ case : �� �ִ� ���๮�� ����ȴ�.
		// if���� true�� false�� ������ 2�� ������
		// Switch���� �������� ���� ����� �޴´�.
		// break�� �־ ������ְ� ������.
		
		// ���� ó�� ���α׷��� ������.
		// keypoint : c(����) r(�б�) u(����) d(����)
		// ������     : 
		// �� ��     :
		// �� ��     :
		// ���α׷� ����
		
		
		// �޴� ����(���ĺ��� ������ �޴��� ����)
		
		Scanner input = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("============mbc��ī����============");
		System.out.println("===========����ó�����α׷�===========");
		System.out.println("=================================");
		System.out.println("a. ����������");
		System.out.println("b. �л�����");
		System.out.println("c. ��������");
		System.out.println("z. ���α׷� ����");
		System.out.print("(a~z)>>> ");
		char select = input.next().charAt(0); // ���ڿ��� �޾Ƽ� �ѱ��ڸ� ���µ� �Ǿձ��ڸ� ����.
		// System.out.println("������ ���� : " + select); �׽�Ʈ �غ��� �ʿ������ �ּ�ó��
		
		switch(select) {
		case 'A' :
		case 'a' : 
			System.out.println("�����������޴��� �����ϼ̽��ϴ�.");
			System.out.println("1. ������ ���");
			System.out.println("2. ������ ����");
			System.out.println("3. ������ ����");
			System.out.println("4. ������ ����");
			System.out.print("(1~4)>>> ");
			int subSelect = input.nextInt();
			switch(subSelect) {
			case 1 :
				System.out.println("������ ��� �޴��Դϴ�.");
				break;
				
			case 2 :
				System.out.println("������ ���� �޴��Դϴ�.");
				break;
				
			case 3 :
				System.out.println("������ ���� �޴��Դϴ�.");
				break;
				
			case 4 :
				System.out.println("������ ���� �޴��Դϴ�.");
				break;	
				
			default : 
				System.out.println("1~4�� �Է��ϼ���.");
				System.out.println("���α׷��� �ٽ� �����ϼ���.");
				break;
			}// ������ ����ġ�� ����
			break; //�����ּ���!
		
		case 'B' :
		case 'b' :
			System.out.println("�л������޴��� �����ϼ̽��ϴ�.");
			break;
		
		case 'C' :
		case 'c' :
			System.out.println("���������޴��� �����ϼ̽��ϴ�.");
			break;
			
		case 'Z' :	
		case 'z' :
			System.out.println("���α׷��� �����մϴ�.");
			break;
			
		default :
			System.out.println("�޴��� ���� ���ڸ� �־����ϴ�.");
			System.out.println("���α׷��� �ٽ� �������ּ���.");
			break;
			
		} // switch()�� ���� -> �񱳾��� 

	} // main �޼ҵ� ����

} // Class ����
