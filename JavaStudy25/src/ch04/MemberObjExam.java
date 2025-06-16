package ch04;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		// Member 클래스를 호출하여 처리해보자.
		
		/*
		 * Member member = new Member(); // 타입 변수 객체 생성 // Member() = Member.java 파일에 있는
		 * public Member()의 Member()와 동일 // 생성자를 통해서 객체를 생성한다는 의미 // 이걸 써먹으려면 member 즉
		 * 변수를 이용해서 써먹어야한다.
		 * 
		 * member.mno = 1; member.id = "phj"; member.pw = "1234";
		 * 
		 * member.memberAdd(); member.memberAllList(); member.memberDelete();
		 */
		
		Scanner input = new Scanner(System.in);
		
		Member[] members = null; // 멤버 배열이 만들어짐
		System.out.println("가입할 회원수를 입력하세요");
		System.out.print(">>> ");
		
		int count = input.nextInt(); // 키보드로 가입할 회원수를 입력함
		members = new Member[count]; // 키보드로 입력한 숫자만큼 배열을 생성함
									 //	Member 타입은 메서드 클래스 다 가지고 있다.
		
		System.out.println("회원 가입 프로그램을 시작합니다.");
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.회원 가입");
			System.out.println("2.회원 전체 보기");
			System.out.println("3.로그인");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 탈퇴");
			System.out.println("1~5까지만 입력하세요.(그 외 키는 프로그램이 종료됩니다.)");
			System.out.print(">>> ");
			int select = input.nextInt(); // 키보드로 위에 번호 입력
			
			switch(select) {
			case 1 :
				Member member1 = new Member(); // 객체 생성
				for(int i = 0; i<members.length; i++) {
				member1 = member1.memberAdd(input); // 생성된 객체 메서드 호출 및 실행, 회원가입 메서드
				members[i] = member1;
				}// member 0~2번지까지 for문 종료
				break;
				
			case 2 :
				Member member2 = new Member(); // 객체 생성
				member2.memberAllList(members); // 생성된 객체 메서드 호출 및 실행, 회원 전체 보기 메서드
				break;
				
			case 3 :
				Member member3 = new Member(); // 객체 생성
				member3.memberLogin(); // 생성된 객체 메서드 호출 및 실행, 로그인 메서드
				break;
				
			case 4 :
				Member member4 = new Member(); // 객체 생성
				member4.memberUpdate(); // 생성된 객체 메서드 호출 및 실행, 정보 수정 메서드
				break;
				
			case 5 :
				Member member5 = new Member(); // 객체 생성
				member5.memberDelete(); // 생성된 객체 메서드 호출 및 실행, 회원 탈퇴 메서드
				break;
				
			default : 
				System.out.println("회원 가입 프로그램이 종료됩니다.");	
				run = false;
				
			}// 회원 가입 switch문 종료
			
		}// 회원가입 while 반복문 종료
		
		
		
		
		
	}

}
