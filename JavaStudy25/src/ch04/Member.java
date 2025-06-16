package ch04;

import java.util.Scanner;

public class Member {
	// ȸ���� ��ü�� main()�޼���� exam���� ������
	// ȸ������
	
	// Ŭ������ �⺻ �Ӽ��� 3������ �ʿ��ϴ�.
	// �ʵ�, ������, �޼���
	
	// �ʵ� :  ��ü�� ������ �־�� �� ��(����) -> �ʵ带 �����Ҷ��� public���� ����.
	// �ƹ��� ���� �ȵȴ� -> �ۺ��� �����̺����� �����ϸ� ��
	// ȸ����ȣ, id, ����, ��ȣ, �̸����ּ�, ���ּ�, ��ȭ��ȣ
	// �켱�� 3������ �Ẹ��.
	
	public int mno ;
	public String id ;
	public String pw ;
	
	
	
	// ������ : Exam Ŭ�������� main()�޼��尡 �ִµ� ���⿡�� new�� ȣ���� �� ����
	public Member() {
		// �⺻������ -> �빮�ڷ� ����, class��� ���� �޼���
		// Member member = new Member();       
	}
	
	
	// �޼��� : Member Ŭ�������� �������� ���� CRUD
	public Member memberAdd(Scanner input) { //  main���� ���޵� ��ĳ�� ��ü
		// void -> Member�� ���� ��? return ��������
		Member member = new Member(); // return�� ��ü
		
		System.out.println("ȸ�����Կ� �޼��� �Դϴ�.");
		System.out.println("ȸ����ȣ�� �Է��ϼ���");
		System.out.print("(����)>>> ");
		member.mno = input.nextInt();
		
		System.out.println("ȸ�� id�� �Է��ϼ���.");
		System.out.print(">>> ");
		member.id = input.next();
		
		System.out.println("ȸ�� pw�� �Է��ϼ���.");
		System.out.print(">>> ");
		member.pw = input.next();
		
		return member; // return �ϱ� ���ؼ� void -> Member�� ����
		
	}// memberAdd() �޼��� ����
	
	public void memberAllList(Member[] members) {
		System.out.println("��� ȸ�� ���� ����Ʈ �޼��� �Դϴ�.");
		for(int i = 0 ; i<members.length; i++) {
			System.out.print("ȸ�� ��ȣ : " + members[i].mno);
			System.out.print("ȸ�� id : " + members[i].id);
			System.out.print("ȸ�� pw : " + members[i].pw);
			System.out.println("-------------------------");
		}// ȸ�� ��ü ���� for�� ����
	}// memberAllList() �޼��� ����
	 // return ��� void�� ����
	
	public void memberLogin() {
		System.out.println("�α��� �޼��� �Դϴ�.");
	}// memberLogin() �޼��� ����
	
	public void memberUpdate() {
		System.out.println("ȸ�� ���� �޼��� �Դϴ�.");
	}// memberUpdate() �޼��� ����
	
	public void memberDelete() {
		System.out.println("ȸ�� Ż�� �޼��� �Դϴ�.");
	}// memberDelete() �޼��� ����
	
}
