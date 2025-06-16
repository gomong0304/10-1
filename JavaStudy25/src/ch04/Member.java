package ch04;

import java.util.Scanner;

public class Member {
	// 회원용 객체로 main()메서드는 exam에서 진행함
	// 회원가입
	
	// 클래스의 기본 속성이 3가지가 필요하다.
	// 필드, 생성자, 메서드
	
	// 필드 :  객체가 가지고 있어야 할 값(변수) -> 필드를 선언할때는 public부터 쓴다.
	// 아무나 쓰면 안된다 -> 퍼블릭을 프라이빗으로 변경하면 됨
	// 회원번호, id, 성명, 암호, 이메일주소, 집주소, 전화번호
	// 우선은 3가지만 써보자.
	
	public int mno ;
	public String id ;
	public String pw ;
	
	
	
	// 생성자 : Exam 클래스에서 main()메서드가 있는데 여기에서 new로 호출할 때 동작
	public Member() {
		// 기본생성자 -> 대문자로 시작, class명과 같은 메서드
		// Member member = new Member();       
	}
	
	
	// 메서드 : Member 클래스에서 행해지는 동작 CRUD
	public Member memberAdd(Scanner input) { //  main에서 전달된 스캐너 객체
		// void -> Member로 변경 왜? return 받으려고
		Member member = new Member(); // return용 객체
		
		System.out.println("회원가입용 메서드 입니다.");
		System.out.println("회원번호를 입력하세요");
		System.out.print("(숫자)>>> ");
		member.mno = input.nextInt();
		
		System.out.println("회원 id를 입력하세요.");
		System.out.print(">>> ");
		member.id = input.next();
		
		System.out.println("회원 pw를 입력하세요.");
		System.out.print(">>> ");
		member.pw = input.next();
		
		return member; // return 하기 위해서 void -> Member로 변경
		
	}// memberAdd() 메서드 종료
	
	public void memberAllList(Member[] members) {
		System.out.println("모든 회원 보기 리스트 메서드 입니다.");
		for(int i = 0 ; i<members.length; i++) {
			System.out.print("회원 번호 : " + members[i].mno);
			System.out.print("회원 id : " + members[i].id);
			System.out.print("회원 pw : " + members[i].pw);
			System.out.println("-------------------------");
		}// 회원 전체 보기 for문 종료
	}// memberAllList() 메서드 종료
	 // return 없어서 void로 저장
	
	public void memberLogin() {
		System.out.println("로그인 메서드 입니다.");
	}// memberLogin() 메서드 종료
	
	public void memberUpdate() {
		System.out.println("회원 수정 메서드 입니다.");
	}// memberUpdate() 메서드 종료
	
	public void memberDelete() {
		System.out.println("회원 탈퇴 메서드 입니다.");
	}// memberDelete() 메서드 종료
	
}
