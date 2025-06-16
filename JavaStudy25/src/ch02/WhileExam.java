package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// While문은 조건식이 true일 때만 반복한다.
		// While문을 종료하고 싶으면 false 처리를 한다.
		// 무한반복용 코드를 작성할때 사용한다.
		
		Scanner inputInt = new Scanner(System.in); // 정수용
		Scanner inputChar = new Scanner(System.in); // 문자용
		
		boolean run = true ; // 무한반복용 변수

		while(run) {
			System.out.println();
			System.out.println("=====MBC성적처리=====");
			System.out.println("1. 교직원관리");
			System.out.println("2. 학생관리");
			System.out.println("3. 성적관리");
			System.out.println("9. 프로그램 종료");
			System.out.print("항목을 입력하세요 >>> ");
			int selectInt = inputInt.nextInt(); // 숫자입력
			
			switch(selectInt) { // 키보드로 입력된 숫자를 판단하여 분기
			
			case 1 : //C,R,U,D 기법에 맞춰서 만들것.
				boolean subRun = true ;
				
				while (subRun) {
					System.out.println();
					System.out.println("==교직원 관리 메뉴로 진입==");
					System.out.println();
					System.out.println("a. 교직원등록");
					System.out.println("b. 교직원보기");
					System.out.println("c. 교직원수정");
					System.out.println("d. 교직원삭제");
					System.out.println("z. 교직원관리메뉴종료");
					System.out.println();
					System.out.print("항목을 입력하세요 >>> "); // 문자입력
					char subSelect = inputChar.next().charAt(0); 
					// 문자열로 입력된 값중에 맨앞 문자만 subSelect 변수에 넣음
					// 위에서 입력받은 알파벳을 처리
					switch(subSelect) {
					
					case 'a' : 
					case 'A' :
						System.out.println();
						System.out.println("교직원 등록메뉴로 진입");
						//교직원 등록 코드 작성
						break;
						
					case 'b' : 
					case 'B' :
						System.out.println();
						System.out.println("교직원 보기메뉴로 진입");
						//교직원 보기 코드 작성
						break;
						
					case 'c' : 
					case 'C' :
						System.out.println();
						System.out.println("교직원 수정메뉴로 진입");
						//교직원 수정 코드 작성
						break;
						
					case 'd' : 
					case 'D' :
						System.out.println();
						System.out.println("교직원 삭제메뉴로 진입");
						//교직원 삭제 코드 작성
						break;
						
					case 'z' : 
					case 'Z' :
						System.out.println();
						System.out.println("교직원 메뉴를 종료합니다.");
						//교직원 메뉴 종료 코드 작성
						subRun = false;
						break;
						
					default : 
						System.out.println();
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						//교직원 삭제 코드 작성
						break;
					
					}// 교직원관리 switch문 종료
					
					
				}// 교직원관리 while문 종료
				// 교직원관리용 코드 입력
				break;
				
			case 2 : 
				System.out.println();
				System.out.println("==학생 관리 메뉴로 진입==");
				// 학생관리용 코드 입력
				break;
				
			case 3 : 
				System.out.println();
				System.out.println("=성적 관리 메뉴로 진입==");
				// 성적관리용 코드 입력
				break;
				
			case 9 : 
				System.out.println();
				System.out.println("==프로그램 종료==");
				// 프로그램 종료코드입력
				run = false ;
				break;
				
			default : // 위조건에 해당하지 않는 값이 입력되었을 때
				System.out.println();
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				break;
				
			}// switch문 종료
			
			
		}// while문 종료
		
	}// main 메소드 종료
	
}// class종료
