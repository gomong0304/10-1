package ch02;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// 개선된 switch문을 사용해보자 -> 람다식이 적용되어있음
		// 람다식이라는 것은 -> 화살표를 이용하여 값을 전달하는 것
		// 메서드는 동작에 해당하는 기능을 main 메서드 바깥쪽에 만듬
		
		// whoIsIt() 메서드를 호출하여 처리 할수있도록하자 
		
		Scanner inputStr = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println("파악하고 싶은 동물이름을 입력하세요.");
			System.out.print(">>>> ");
			String monster = inputStr.next();
			// 키보드로 동물을 받아 monster 변수에 넣음
			// 내가 만든 메서드를 호출하여 값을 던잘함
			whoIsIt(monster);
			// 메서드 호출 제대로 됐다.
			// 위에는 monster 밑에는 bio 둘이 변수명이 다르지만 타입은 같음.
			// 초보자는 되도록 맞추자.
			
		}

	}// main 메서드 종료(자바의 기본 메서드)
	
	// 사용자 정의 메서드 추가(내가 직접 만든 메서드)
	// whoIsIt라는 메서드 생성 (입력은 bio라는 문자열이 들어옴)
	static void whoIsIt(String bio) { //문자열이 bio 변수로 처리됨
		// void는 리턴값이 없을 때 사용함
		String kind = null; // null = 값이 없는 kind 변수에 문자열 타입을 선언
		
		switch(bio){
		case "호랑이","사자","강아지","고양이" -> kind = "포유류"; 
		case "독수리","참새","까마귀","비둘기" -> kind = "조류";
		case "고등어","연어","참치","갈치" -> kind = "어류";
		default -> kind = "알 수 없는 객체입니다." ;
		} // switch문 종료
		
		System.out.println(bio + "는 " + kind + "로 판단됩니다.");
		
	} // 사용자 정의 메서드 종료

}// class 종료
