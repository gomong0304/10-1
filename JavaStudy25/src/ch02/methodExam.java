package ch02;

import java.util.Scanner;

public class methodExam {

	public static void main(String[] args) {
		// 성적처리용 프로그램을 메서드로 재구현
		// 메인 메서드에서는 주 메뉴를 구현
		// 사용자 지정 메서드에는 부 메뉴를 구현 해보자
		
		Scanner inputInt = new Scanner(System.in);
		boolean run = true;
		String id = "phj";
		String pw = "1234";
		boolean session = false; // 로그인 상태 저장용
		
		while(run) {
			System.out.println("====mbc 성적처리용====");
			System.out.println("1. 로그인");
			System.out.println("2. 교사 관리");
			System.out.println("3. 학생 관리");
			System.out.println("4. 성적 관리");
			System.out.println("9. 프로그램 종료");
			System.out.print("원하시는 메뉴를 선택해주세요 >>> ");
			int select = inputInt.nextInt();
		
			switch(select) {
			case 1 :
				System.out.println();
				System.out.println("로그인 메뉴로 이동합니다.");
				session = loginOK(id,pw,session);
				
				if(session == true) {
					System.out.println();
					System.out.println(id + "님, 환영합니다.");
					System.out.println("2~4 메뉴를 사용할 수 있습니다.");
				}// case 1 :  if문 종료
				break;
				
			case 2 :
				System.out.println("교사 관리 메뉴로 이동합니다.");
				break;
				
			case 3 :
				System.out.println("학생 관리 메뉴로 이동합니다.");
				break;
				
			case 4 :
				System.out.println("성적 관리 메뉴로 이동합니다.");
				break;
				
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}// switch문 종료
						
		}// while문 종료

	}// main 메서드 종료

	static boolean loginOK(String id, String pw, boolean session) {
		// 로그인 여부를 결정하는 메서드
		// id와 pw가 둘다 맞으면 로그인이 되는 메서드로 만들어야함
		// id pw 순서 중요함!
		Scanner inputLogIn = new Scanner(System.in);
		System.out.print("id를 입력하세요 >>> ");
		String inputId = inputLogIn.next(); // 키보드로 ID입력해서 변수에 넣음
		System.out.print("pw를 입력하세요 >>> ");
		String inputPw = inputLogIn.next(); // 키보드로 pw입력해서 변수에 넣음
		
		if(id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println();
			System.out.println("id와 pw가 일치 합니다.");
			System.out.println("로그인 성공.");
			session = true;
		}else {
			System.out.println("id와 pw가 불일치 합니다.");
			System.out.println("로그인 실패.");
			session = false;
		}// id pw 일치 판단 if문 종료
		return session; // 로그인 성공과 실패 결과 리턴 함  
	}// 로그인 여부를 결정하는 메서드 종료

}// class 종료
