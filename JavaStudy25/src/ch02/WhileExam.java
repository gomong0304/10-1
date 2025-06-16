package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// While���� ���ǽ��� true�� ���� �ݺ��Ѵ�.
		// While���� �����ϰ� ������ false ó���� �Ѵ�.
		// ���ѹݺ��� �ڵ带 �ۼ��Ҷ� ����Ѵ�.
		
		Scanner inputInt = new Scanner(System.in); // ������
		Scanner inputChar = new Scanner(System.in); // ���ڿ�
		
		boolean run = true ; // ���ѹݺ��� ����

		while(run) {
			System.out.println();
			System.out.println("=====MBC����ó��=====");
			System.out.println("1. ����������");
			System.out.println("2. �л�����");
			System.out.println("3. ��������");
			System.out.println("9. ���α׷� ����");
			System.out.print("�׸��� �Է��ϼ��� >>> ");
			int selectInt = inputInt.nextInt(); // �����Է�
			
			switch(selectInt) { // Ű����� �Էµ� ���ڸ� �Ǵ��Ͽ� �б�
			
			case 1 : //C,R,U,D ����� ���缭 �����.
				boolean subRun = true ;
				
				while (subRun) {
					System.out.println();
					System.out.println("==������ ���� �޴��� ����==");
					System.out.println();
					System.out.println("a. ���������");
					System.out.println("b. ����������");
					System.out.println("c. ����������");
					System.out.println("d. ����������");
					System.out.println("z. �����������޴�����");
					System.out.println();
					System.out.print("�׸��� �Է��ϼ��� >>> "); // �����Է�
					char subSelect = inputChar.next().charAt(0); 
					// ���ڿ��� �Էµ� ���߿� �Ǿ� ���ڸ� subSelect ������ ����
					// ������ �Է¹��� ���ĺ��� ó��
					switch(subSelect) {
					
					case 'a' : 
					case 'A' :
						System.out.println();
						System.out.println("������ ��ϸ޴��� ����");
						//������ ��� �ڵ� �ۼ�
						break;
						
					case 'b' : 
					case 'B' :
						System.out.println();
						System.out.println("������ ����޴��� ����");
						//������ ���� �ڵ� �ۼ�
						break;
						
					case 'c' : 
					case 'C' :
						System.out.println();
						System.out.println("������ �����޴��� ����");
						//������ ���� �ڵ� �ۼ�
						break;
						
					case 'd' : 
					case 'D' :
						System.out.println();
						System.out.println("������ �����޴��� ����");
						//������ ���� �ڵ� �ۼ�
						break;
						
					case 'z' : 
					case 'Z' :
						System.out.println();
						System.out.println("������ �޴��� �����մϴ�.");
						//������ �޴� ���� �ڵ� �ۼ�
						subRun = false;
						break;
						
					default : 
						System.out.println();
						System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						//������ ���� �ڵ� �ۼ�
						break;
					
					}// ���������� switch�� ����
					
					
				}// ���������� while�� ����
				// ������������ �ڵ� �Է�
				break;
				
			case 2 : 
				System.out.println();
				System.out.println("==�л� ���� �޴��� ����==");
				// �л������� �ڵ� �Է�
				break;
				
			case 3 : 
				System.out.println();
				System.out.println("=���� ���� �޴��� ����==");
				// ���������� �ڵ� �Է�
				break;
				
			case 9 : 
				System.out.println();
				System.out.println("==���α׷� ����==");
				// ���α׷� �����ڵ��Է�
				run = false ;
				break;
				
			default : // �����ǿ� �ش����� �ʴ� ���� �ԷµǾ��� ��
				System.out.println();
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				break;
				
			}// switch�� ����
			
			
		}// while�� ����
		
	}// main �޼ҵ� ����
	
}// class����
