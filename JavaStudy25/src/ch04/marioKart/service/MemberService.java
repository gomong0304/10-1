package ch04.marioKart.service;

import java.util.Scanner;

import ch04.marioKart.dto.MemberDTO;

public class MemberService { 
	// 회원 관리용 클래스로 CRUD@까지 제공
	// 부메뉴용
	// 필드
	
	
	// 생성자
	
	
	
	// 메서드
	
	// 부메뉴용 메서드 ->  필요한 파라미터?? (입력개체, 회원 배열, 로그인 상태)
	public MemberDTO menu(Scanner input, 
			MemberDTO[] memberDTOs, MemberDTO loginState) {
		
		System.out.println("==== 회원 관리 메뉴에 진입하셨습니다.====");
		boolean subrun = true;
		while(subrun) {
			
		System.out.println("1.가입 | 2.로그인 | 3.수정 | 4.삭제 | 5.종료");
		System.out.print(">>> ");
		String select = input.next();
		
		switch(select) {
		case "1" : 
			System.out.println("계정을 생성합니다.");
			memberDTOs = create(input, memberDTOs);
			// 계정 생성 메서드(스캐너객체, 회원배열)로 전달 (입력, 통로)
			// 리턴은 없다. 왜? 받은게 없으니까.
			break;
			
		case "2" : 
			System.out.println("로그인을 진행합니다.");
			loginState = login(input, memberDTOs, loginState);
			break;
			
		case "3" : 
			System.out.println("계정을 수정합니다.");
			break;
			
		case "4" : 
			System.out.println("계정을 삭제합니다.");
			break;
			
		case "5" : 
			System.out.println("회원 관리메뉴를 종료합니다.");
			System.out.println("메인메뉴로 복귀합니다.");
			subrun = false;
			break;
			
		case "99" : 
			System.out.println("히든 메뉴로 진입하였습니다.");
			System.out.println("캐릭터 해킹을 진행합니다.");
			break;
			
		default : 
			System.out.println("1~5사이 값만 허용합니다.");
			
		}// 선택 스위치문 종료
		}// 와일문 종료
		
		
		return loginState;
	}// 메뉴 메서드 종료

	public MemberDTO[] create(Scanner input, MemberDTO[] memberDTOs) {
		// 회원 가입용 메서드
		System.out.println("회원 가입용 메서드에 오신걸 환영합니다.");
		MemberDTO memberDTO = new MemberDTO(); // 빈 객체 생성
		
		System.out.println("사용할 id를 입력하세요");
		System.out.print(">>> ");
		memberDTO.id = input.next();
		System.out.println("사용할 pw를 입력하세요");
		System.out.print(">>> ");
		memberDTO.pw = input.next();
		System.out.println("사용할 닉네임을 입력하세요");
		System.out.print(">>> ");
		memberDTO.nickname = input.next();
		System.out.println("사용할 이메일을 입력하세요");
		System.out.print(">>> ");
		memberDTO.email = input.next();
		// 빈 MemberDTO 객체에 필드값 입력 완료
		
		
		// 배열에 0~null 값이면 삽입 (exam)
		for(int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] == null) { // null이면 값이 없는 상태
				memberDTOs[i] = memberDTO;
				break;
			}// if문 종료
		}// for문 종료
		
		System.out.println(memberDTO.nickname + "님, 회원가입을 축하드립니다.");
		return memberDTOs;
	}

	public MemberDTO login(Scanner input, 
			MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 로그인용 메서드
		System.out.println("id를 입력하세요.");
		System.out.print(">>> ");
		String id = input.next();
		System.out.println("pw를 입력하세요.");
		System.out.print(">>> ");
		String pw = input.next(); // 키보드로 입력완료 -> 빈객체 생성->삽입
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id;
		loginMember.pw = pw;
		
		for (int i = 0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id)
					&& memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 성공");
				loginState = memberDTOs[i];
			}
		}
		System.out.println(loginState.nickname + "님 로그인 성공!!");
		return loginState;
	}
	
}
