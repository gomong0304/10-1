package ch02;

import java.util.Scanner;

public class methodExam {

	public static void main(String[] args) {
		// ����ó���� ���α׷��� �޼���� �籸��
		// ���� �޼��忡���� �� �޴��� ����
		// ����� ���� �޼��忡�� �� �޴��� ���� �غ���
		
		Scanner inputInt = new Scanner(System.in);
		boolean run = true;
		String id = "phj";
		String pw = "1234";
		boolean session = false; // �α��� ���� �����
		
		while(run) {
			System.out.println("====mbc ����ó����====");
			System.out.println("1. �α���");
			System.out.println("2. ���� ����");
			System.out.println("3. �л� ����");
			System.out.println("4. ���� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("���Ͻô� �޴��� �������ּ��� >>> ");
			int select = inputInt.nextInt();
		
			switch(select) {
			case 1 :
				System.out.println();
				System.out.println("�α��� �޴��� �̵��մϴ�.");
				session = loginOK(id,pw,session);
				
				if(session == true) {
					System.out.println();
					System.out.println(id + "��, ȯ���մϴ�.");
					System.out.println("2~4 �޴��� ����� �� �ֽ��ϴ�.");
				}// case 1 :  if�� ����
				break;
				
			case 2 :
				System.out.println("���� ���� �޴��� �̵��մϴ�.");
				break;
				
			case 3 :
				System.out.println("�л� ���� �޴��� �̵��մϴ�.");
				break;
				
			case 4 :
				System.out.println("���� ���� �޴��� �̵��մϴ�.");
				break;
				
			case 9 :
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			}// switch�� ����
						
		}// while�� ����

	}// main �޼��� ����

	static boolean loginOK(String id, String pw, boolean session) {
		// �α��� ���θ� �����ϴ� �޼���
		// id�� pw�� �Ѵ� ������ �α����� �Ǵ� �޼���� ��������
		// id pw ���� �߿���!
		Scanner inputLogIn = new Scanner(System.in);
		System.out.print("id�� �Է��ϼ��� >>> ");
		String inputId = inputLogIn.next(); // Ű����� ID�Է��ؼ� ������ ����
		System.out.print("pw�� �Է��ϼ��� >>> ");
		String inputPw = inputLogIn.next(); // Ű����� pw�Է��ؼ� ������ ����
		
		if(id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println();
			System.out.println("id�� pw�� ��ġ �մϴ�.");
			System.out.println("�α��� ����.");
			session = true;
		}else {
			System.out.println("id�� pw�� ����ġ �մϴ�.");
			System.out.println("�α��� ����.");
			session = false;
		}// id pw ��ġ �Ǵ� if�� ����
		return session; // �α��� ������ ���� ��� ���� ��  
	}// �α��� ���θ� �����ϴ� �޼��� ����

}// class ����
