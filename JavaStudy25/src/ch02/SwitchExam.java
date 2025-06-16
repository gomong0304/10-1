package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch는 조건 제어문이다.
		// 조건이 맞으면 case : 에 있는 실행문이 실행된다.
		// if문은 true나 false의 조건이 2개 있지만
		// Switch문은 여러개의 조건 결과를 받는다.
		// break를 넣어서 멈출수있게 해주자.
		
		// 성적 처리 프로그램을 만들어보자.
		// keypoint : c(생성) r(읽기) u(수정) d(삭제)
		// 교직원     : 
		// 학 생     :
		// 성 적     :
		// 프로그램 종료
		
		
		// 메뉴 구현(알파벳을 눌러서 메뉴로 진입)
		
		Scanner input = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("============mbc아카데미============");
		System.out.println("===========성적처리프로그램===========");
		System.out.println("=================================");
		System.out.println("a. 교직원관리");
		System.out.println("b. 학생관리");
		System.out.println("c. 성적관리");
		System.out.println("z. 프로그램 종료");
		System.out.print("(a~z)>>> ");
		char select = input.next().charAt(0); // 문자열로 받아서 한글자를 빼는데 맨앞글자를 뺀다.
		// System.out.println("선택한 문자 : " + select); 테스트 해보고 필요없으면 주석처리
		
		switch(select) {
		case 'A' :
		case 'a' : 
			System.out.println("교직원관리메뉴로 진입하셨습니다.");
			System.out.println("1. 교직원 등록");
			System.out.println("2. 교직원 보기");
			System.out.println("3. 교직원 수정");
			System.out.println("4. 교직원 삭제");
			System.out.print("(1~4)>>> ");
			int subSelect = input.nextInt();
			switch(subSelect) {
			case 1 :
				System.out.println("교직원 등록 메뉴입니다.");
				break;
				
			case 2 :
				System.out.println("교직원 보기 메뉴입니다.");
				break;
				
			case 3 :
				System.out.println("교직원 수정 메뉴입니다.");
				break;
				
			case 4 :
				System.out.println("교직원 삭제 메뉴입니다.");
				break;	
				
			default : 
				System.out.println("1~4만 입력하세요.");
				System.out.println("프로그램을 다시 실행하세요.");
				break;
			}// 교직원 스위치문 종료
			break; //멈춰주세요!
		
		case 'B' :
		case 'b' :
			System.out.println("학생관리메뉴로 진입하셨습니다.");
			break;
		
		case 'C' :
		case 'c' :
			System.out.println("성적관리메뉴로 진입하셨습니다.");
			break;
			
		case 'Z' :	
		case 'z' :
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default :
			System.out.println("메뉴에 없는 문자를 넣었습니다.");
			System.out.println("프로그램을 다시 실행해주세요.");
			break;
			
		} // switch()문 종료 -> 비교안함 

	} // main 메소드 종료

} // Class 종료
