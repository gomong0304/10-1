package ch05.getter_setter;

import java.util.Scanner;

public class MemberService {
	// �θ޴��� DTO�� ������ CRUD�ϴ� �뵵
	// �ʵ�
	MemberDTO memberDTO = new MemberDTO();
	
	
	// ������
	
	// �޼���
	public void menu() {
		/*
		 * memberDTO.name = "������"; memberDTO.age = 90; memberDTO.admin = true;
		 */
		// ������ �ʵ������� ���Ϳ� ���͸� �̿��Ѵ�.
	} // menu �޼��� ����
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		System.out.print(">>> ");
		String name = input.next();
		
		System.out.println("���̸� �Է��ϼ���.");
		System.out.print(">>> ");
		int age = input.nextInt();
		
		System.out.println("������ ������ �Է��ϼ���.");
		System.out.print(">>> ");
		boolean admin = input.nextBoolean();
		
		MemberDTO memberDTO = new MemberDTO();
		// ���� ��Ű���� ��쿡�� import�� ����.
		memberDTO.setName(name);
		memberDTO.setAge(age);
		memberDTO.setAdmin(admin);
		
		System.out.println("��ü�� ����� �̸� : " + memberDTO.getName());
		System.out.println("��ü�� ����� ���� : " + memberDTO.getAge());
		System.out.println("��ü�� ����� ������ : " + memberDTO.isAdmin());
	}



}
