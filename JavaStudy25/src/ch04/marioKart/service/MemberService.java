package ch04.marioKart.service;

import java.util.Scanner;

import ch04.marioKart.dto.MemberDTO;

public class MemberService { 
	// ȸ�� ������ Ŭ������ CRUD@���� ����
	// �θ޴���
	// �ʵ�
	
	
	// ������
	
	
	
	// �޼���
	
	// �θ޴��� �޼��� ->  �ʿ��� �Ķ����?? (�Է°�ü, ȸ�� �迭, �α��� ����)
	public MemberDTO menu(Scanner input, 
			MemberDTO[] memberDTOs, MemberDTO loginState) {
		
		System.out.println("==== ȸ�� ���� �޴��� �����ϼ̽��ϴ�.====");
		boolean subrun = true;
		while(subrun) {
			
		System.out.println("1.���� | 2.�α��� | 3.���� | 4.���� | 5.����");
		System.out.print(">>> ");
		String select = input.next();
		
		switch(select) {
		case "1" : 
			System.out.println("������ �����մϴ�.");
			memberDTOs = create(input, memberDTOs);
			// ���� ���� �޼���(��ĳ�ʰ�ü, ȸ���迭)�� ���� (�Է�, ���)
			// ������ ����. ��? ������ �����ϱ�.
			break;
			
		case "2" : 
			System.out.println("�α����� �����մϴ�.");
			loginState = login(input, memberDTOs, loginState);
			break;
			
		case "3" : 
			System.out.println("������ �����մϴ�.");
			break;
			
		case "4" : 
			System.out.println("������ �����մϴ�.");
			break;
			
		case "5" : 
			System.out.println("ȸ�� �����޴��� �����մϴ�.");
			System.out.println("���θ޴��� �����մϴ�.");
			subrun = false;
			break;
			
		case "99" : 
			System.out.println("���� �޴��� �����Ͽ����ϴ�.");
			System.out.println("ĳ���� ��ŷ�� �����մϴ�.");
			break;
			
		default : 
			System.out.println("1~5���� ���� ����մϴ�.");
			
		}// ���� ����ġ�� ����
		}// ���Ϲ� ����
		
		
		return loginState;
	}// �޴� �޼��� ����

	public MemberDTO[] create(Scanner input, MemberDTO[] memberDTOs) {
		// ȸ�� ���Կ� �޼���
		System.out.println("ȸ�� ���Կ� �޼��忡 ���Ű� ȯ���մϴ�.");
		MemberDTO memberDTO = new MemberDTO(); // �� ��ü ����
		
		System.out.println("����� id�� �Է��ϼ���");
		System.out.print(">>> ");
		memberDTO.id = input.next();
		System.out.println("����� pw�� �Է��ϼ���");
		System.out.print(">>> ");
		memberDTO.pw = input.next();
		System.out.println("����� �г����� �Է��ϼ���");
		System.out.print(">>> ");
		memberDTO.nickname = input.next();
		System.out.println("����� �̸����� �Է��ϼ���");
		System.out.print(">>> ");
		memberDTO.email = input.next();
		// �� MemberDTO ��ü�� �ʵ尪 �Է� �Ϸ�
		
		
		// �迭�� 0~null ���̸� ���� (exam)
		for(int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] == null) { // null�̸� ���� ���� ����
				memberDTOs[i] = memberDTO;
				break;
			}// if�� ����
		}// for�� ����
		
		System.out.println(memberDTO.nickname + "��, ȸ�������� ���ϵ帳�ϴ�.");
		return memberDTOs;
	}

	public MemberDTO login(Scanner input, 
			MemberDTO[] memberDTOs, MemberDTO loginState) {
		// �α��ο� �޼���
		System.out.println("id�� �Է��ϼ���.");
		System.out.print(">>> ");
		String id = input.next();
		System.out.println("pw�� �Է��ϼ���.");
		System.out.print(">>> ");
		String pw = input.next(); // Ű����� �Է¿Ϸ� -> ��ü ����->����
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id;
		loginMember.pw = pw;
		
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id)
					&& memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("�α��� ����");
				loginState = memberDTOs[i];
			}
		}
		System.out.println(loginState.nickname + "�� �α��� ����!!");
		return loginState;
	}
	
}
