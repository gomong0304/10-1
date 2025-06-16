package ch04;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		// Member Ŭ������ ȣ���Ͽ� ó���غ���.
		
		/*
		 * Member member = new Member(); // Ÿ�� ���� ��ü ���� // Member() = Member.java ���Ͽ� �ִ�
		 * public Member()�� Member()�� ���� // �����ڸ� ���ؼ� ��ü�� �����Ѵٴ� �ǹ� // �̰� ��������� member ��
		 * ������ �̿��ؼ� ��Ծ���Ѵ�.
		 * 
		 * member.mno = 1; member.id = "phj"; member.pw = "1234";
		 * 
		 * member.memberAdd(); member.memberAllList(); member.memberDelete();
		 */
		
		Scanner input = new Scanner(System.in);
		
		Member[] members = null; // ��� �迭�� �������
		System.out.println("������ ȸ������ �Է��ϼ���");
		System.out.print(">>> ");
		
		int count = input.nextInt(); // Ű����� ������ ȸ������ �Է���
		members = new Member[count]; // Ű����� �Է��� ���ڸ�ŭ �迭�� ������
									 //	Member Ÿ���� �޼��� Ŭ���� �� ������ �ִ�.
		
		System.out.println("ȸ�� ���� ���α׷��� �����մϴ�.");
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.ȸ�� ����");
			System.out.println("2.ȸ�� ��ü ����");
			System.out.println("3.�α���");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� Ż��");
			System.out.println("1~5������ �Է��ϼ���.(�� �� Ű�� ���α׷��� ����˴ϴ�.)");
			System.out.print(">>> ");
			int select = input.nextInt(); // Ű����� ���� ��ȣ �Է�
			
			switch(select) {
			case 1 :
				Member member1 = new Member(); // ��ü ����
				for(int i = 0; i<members.length; i++) {
				member1 = member1.memberAdd(input); // ������ ��ü �޼��� ȣ�� �� ����, ȸ������ �޼���
				members[i] = member1;
				}// member 0~2�������� for�� ����
				break;
				
			case 2 :
				Member member2 = new Member(); // ��ü ����
				member2.memberAllList(members); // ������ ��ü �޼��� ȣ�� �� ����, ȸ�� ��ü ���� �޼���
				break;
				
			case 3 :
				Member member3 = new Member(); // ��ü ����
				member3.memberLogin(); // ������ ��ü �޼��� ȣ�� �� ����, �α��� �޼���
				break;
				
			case 4 :
				Member member4 = new Member(); // ��ü ����
				member4.memberUpdate(); // ������ ��ü �޼��� ȣ�� �� ����, ���� ���� �޼���
				break;
				
			case 5 :
				Member member5 = new Member(); // ��ü ����
				member5.memberDelete(); // ������ ��ü �޼��� ȣ�� �� ����, ȸ�� Ż�� �޼���
				break;
				
			default : 
				System.out.println("ȸ�� ���� ���α׷��� ����˴ϴ�.");	
				run = false;
				
			}// ȸ�� ���� switch�� ����
			
		}// ȸ������ while �ݺ��� ����
		
		
		
		
		
	}

}
