package ch03;

import java.util.Scanner;

public class ArrayInputExam {

	public static void main(String[] args) {
		// Ű����� �Է¹��� ���� �迭�� ���� �� crud �׽�Ʈ
		// c : ������ �Է�
		// r : ������ ���� (��ü ����, 1�� ����)
		// u : ������ ����
		// d : ������ ����
		// �������� -> ���� �Է½� null ���� ���� �־��
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("=======mbc ����ó��=======");
		System.out.println("�л����� �Է��� �ּ���");
		System.out.print(">>> ");
		int count = inputInt.nextInt();
		System.out.println(count + "���� �л� ������ �Է��ϰڽ��ϴ�.");
		
		String[] names = new String[count]; // �̸� �迭
		int[] kors = new int[count]; 		// �������� �迭
		int[] mats = new int[count];		// �������� �迭
		int[] engs = new int[count];		// �������� �迭
		// ���� ���� ���� ������ �迭�� �л��� �� ��ŭ ����
		// ���� 10�� �Է��ϸ� 10���� ���� ����
		
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println("=======mbc ����ó��=======");
			System.out.println("1. �����Է�");
			System.out.println("2. ��ü��������");
			System.out.println("3. ���μ�������");
			System.out.println("4. ��������");
			System.out.println("5. ��������");
			System.out.println("9. ���� ���α׷� ����");
			System.out.print(">>> ");
			int select = inputInt.nextInt();
			
			switch(select) {
			case 1 : 
				System.out.println();
				System.out.println("���� �Է� ȭ���Դϴ�.");
				// �޼��� ������ ���� �Է°��� ��°��� ���� �����ؾ��Ѵ�.
				scoreAdd(names,kors,mats,engs);
				break;
				
			case 2 : 
				System.out.println("��ü ���� ���� ȭ���Դϴ�.");
				break;	
				
			case 3 : 
				System.out.println("���� ���� ���� ȭ���Դϴ�.");
				break;
				
			case 4 : 
				System.out.println("���� ���� ȭ���Դϴ�.");
				scoreMod(names,kors,mats,engs);
				
				break;
				
			case 5 : 
				System.out.println("���� ���� ȭ���Դϴ�.");
				break;
				
			case 9 : 
				System.out.println("���α׷��� �����մϴ�.");
				run=false;
				break;
				
			default : 
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
				
			}// ����ó�� �޴� ����ġ�� ����
		
		}//while�� ����
	
	}// main �޼ҵ� ����

	static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {
		// main���� ���� �迭 4���� ������ ���� ������ �Ѵ�.
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		System.out.println();
		System.out.print("������ �л��� �̸��� �Է��ϼ��� >>> ");
		String name = inputStr.nextLine();
		
		for(int i =0; i<names.length; i++) {
			if(names[i].equals(name)) { 
				// Ű����� �Է��� ���� �̸� �迭�� ���� ���� �ִ��� �ľ�
				System.out.println();
				System.out.println(names[i] + "�л� ����");
				System.out.println("���� : " + kors[i]);
				System.out.println("���� : " + mats[i]);
				System.out.println("���� : " + engs[i]);
				System.out.println("==================");
				System.out.println();
				System.out.println("������ ������ �Է��ϼ���");
				System.out.print("���� ���� ���� : ");
				kors[i]=inputInt.nextInt();
				System.out.print("���� ���� ���� : ");
				mats[i]=inputInt.nextInt();
				System.out.print("���� ���� ���� : ");
				engs[i]=inputInt.nextInt();
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				
				System.out.println();
				System.out.println("==================");
				System.out.println(names[i] + "�л� ������ ����");
				System.out.println("���� : " + kors[i]);
				System.out.println("���� : " + mats[i]);
				System.out.println("���� : " + engs[i]);
				System.out.println("==================");
				break;
				
			}// if�� ����
		}// for�� ����
			
	}// ���� ���� �޼��� ����

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {
		// main���� ���� �迭 4���� Ű����� ���� �ִ´�.
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
		System.out.println();
		System.out.print("�̸��� �Է��ϼ���. : ");
		names[i]=inputStr.next(); // Ű����� �Է¹��� �̸��� name 0���濡 ����
		
		System.out.print("���� ���� : ");
		kors[i]=inputInt.nextInt();

		System.out.print("���� ���� : ");
		mats[i]=inputInt.nextInt();

		System.out.print("���� ���� : ");
		engs[i]=inputInt.nextInt();
		System.out.println();
		
		}// for��, �ݺ������Է� ����
		
		System.out.println();
		System.out.println("�����Է��� �Ϸ�Ǿ����ϴ�.");
		
	}// �����Է� ����� �޼��� ����

}// class ����
