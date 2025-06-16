package ch03;

import java.util.Scanner;

public class ArrayInputExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 값을 배열에 저장 후 crud 테스트
		// c : 성적을 입력
		// r : 성적을 보기 (전체 보기, 1개 보기)
		// u : 성적을 수정
		// d : 성적을 삭제
		// 개선사항 -> 성적 입력시 null 값을 보고 넣어보기
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("=======mbc 성적처리=======");
		System.out.println("학생수를 입력해 주세요");
		System.out.print(">>> ");
		int count = inputInt.nextInt();
		System.out.println(count + "명의 학생 성적을 입력하겠습니다.");
		
		String[] names = new String[count]; // 이름 배열
		int[] kors = new int[count]; 		// 국어점수 배열
		int[] mats = new int[count];		// 수학점수 배열
		int[] engs = new int[count];		// 영어점수 배열
		// 국어 수학 영어 점수의 배열을 학생명 수 만큼 만듬
		// 위에 10을 입력하면 10개의 방을 만듦
		
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println("=======mbc 성적처리=======");
			System.out.println("1. 성적입력");
			System.out.println("2. 전체성적보기");
			System.out.println("3. 개인성적보기");
			System.out.println("4. 성적수정");
			System.out.println("5. 성적삭제");
			System.out.println("9. 성적 프로그램 종료");
			System.out.print(">>> ");
			int select = inputInt.nextInt();
			
			switch(select) {
			case 1 : 
				System.out.println();
				System.out.println("성적 입력 화면입니다.");
				// 메서드 생성할 때는 입력값과 출력값을 먼저 생각해야한다.
				scoreAdd(names,kors,mats,engs);
				break;
				
			case 2 : 
				System.out.println("전체 성적 보기 화면입니다.");
				break;	
				
			case 3 : 
				System.out.println("개인 성적 보기 화면입니다.");
				break;
				
			case 4 : 
				System.out.println("성적 수정 화면입니다.");
				scoreMod(names,kors,mats,engs);
				
				break;
				
			case 5 : 
				System.out.println("성적 삭제 화면입니다.");
				break;
				
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
				
			default : 
				System.out.println("잘못입력하셨습니다.");
				break;
				
			}// 성적처리 메뉴 스위치문 종료
		
		}//while문 종료
	
	}// main 메소드 종료

	static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {
		// main에서 만든 배열 4개를 가져와 성적 수정을 한다.
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		System.out.println();
		System.out.print("수정할 학생의 이름을 입력하세요 >>> ");
		String name = inputStr.nextLine();
		
		for(int i =0; i<names.length; i++) {
			if(names[i].equals(name)) { 
				// 키보드로 입력한 값이 이름 배열에 같은 값이 있는지 파악
				System.out.println();
				System.out.println(names[i] + "학생 점수");
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				System.out.println("==================");
				System.out.println();
				System.out.println("수정할 점수를 입력하세요");
				System.out.print("국어 수정 점수 : ");
				kors[i]=inputInt.nextInt();
				System.out.print("수학 수정 점수 : ");
				mats[i]=inputInt.nextInt();
				System.out.print("영어 수정 점수 : ");
				engs[i]=inputInt.nextInt();
				System.out.println("수정이 완료되었습니다.");
				
				System.out.println();
				System.out.println("==================");
				System.out.println(names[i] + "학생 수정된 점수");
				System.out.println("국어 : " + kors[i]);
				System.out.println("수학 : " + mats[i]);
				System.out.println("영어 : " + engs[i]);
				System.out.println("==================");
				break;
				
			}// if문 종료
		}// for문 종료
			
	}// 성적 수정 메서드 종료

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {
		// main에서 만든 배열 4개를 키보드로 값을 넣는다.
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
		System.out.println();
		System.out.print("이름을 입력하세요. : ");
		names[i]=inputStr.next(); // 키보드로 입력받은 이름을 name 0번방에 넣음
		
		System.out.print("국어 점수 : ");
		kors[i]=inputInt.nextInt();

		System.out.print("수학 점수 : ");
		mats[i]=inputInt.nextInt();

		System.out.print("영어 점수 : ");
		engs[i]=inputInt.nextInt();
		System.out.println();
		
		}// for문, 반복성적입력 종료
		
		System.out.println();
		System.out.println("성적입력이 완료되었습니다.");
		
	}// 성적입력 사용자 메서드 종료

}// class 종료
