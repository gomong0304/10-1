package ch01;

import java.util.Scanner; // 외부 라이브러리

public class LogicalAndExam {

	public static void main(String[] args) {
		// 논리곱 테스트용
		// & 연산은 대부분 조건이 2개이상일 경우 판단하는 용도로 사용한다.
		// 예를 들어 id와 pw가 둘다 맞아야 로그인이 성공하는 경우!!
		// (가지고 있던 id ==키보드로 입력한 id) & (가지고 있던 pw == 키보드로 입력한 pw)
		//            false                           false               = false
		//            true                            false               = false   
		//            false                           false               = false 
		//            true                            true                = true
		
		
		Scanner input = new Scanner(System.in) ; 
		// 컨트롤+Scanner 클릭하면 코드를 볼수있다.
		// 키보드로 입력할 수 있는 객체를 생성함
		System.out.println("정수를 입력하시면 대소문자나 숫자를 판단해드릴께요!!");
		System.out.println("유니코드표를 참고하여 프로그램을 제작하였습니다.");
		System.out.print("숫자 입력 >>> ");
		int charCode = input.nextInt(); // 키보드로 정수값이 입력되서 변수에 들어감.
		
		
		// if(비교판단문){ 비교 판단문이 true값일 때 수행되는 문 }
		// else { 비교판단문이 false값일 때 수행되는 문 }
		if( (charCode >= 65 ) & ( charCode <= 90 ) ) {
		// 입력된 숫자 값이 65 이상이고 90 이하이면 대문자로 출력
		System.out.println( "현재 입력된 숫자는 대문자 입니다. : " + (char)charCode );
		} else if ( (charCode >= 97) && (charCode <= 122) ) { 
		  // 위에서 실행된 if 값이 false일 경우 또 비교를 하게 됨.
		  // 입력된 숫자 값이 97 이상이고 122 이하면 소문자
		  // &를 두번 사용하면 (&&) 빠른 처리를 한다. -> 코드튜닝
		  System.out.println( "현재 입력된 숫자는 소문자 입니다. : " + (char)charCode );
		  }	else if ( !(charCode < 48 ) && !(charCode > 57 ) ) {
			// NAND 개념이다. 드모르간의법칙을 파악하면 NOR가 된다.
			// 48보다 작지 않고 57보다 크지 않은 비교문
			System.out.println( "현재 입력된 숫자는 유니코드의 문자형숫자 입니다. : " + (char)charCode);
		  	} else {
		  	  System.out.println("대문자, 소문자, 숫자의 유니코드 표 없는 숫자 입니다.");
		  	  System.out.println("프로그램을 다시 실행해 주세요!!!");
		  	  } // 다중 if문 종료
	} // main 메서드 종료
} // Class 종료
