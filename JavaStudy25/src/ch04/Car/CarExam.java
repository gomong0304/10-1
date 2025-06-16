package ch04.Car;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주 실행 프로그램 -> 차 1대니까 배열 필요 없음
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		System.out.println("===차량 정보 입력===");
		Car myCar = new Car(); // 기본 생성자로 객체 생성함
		// 생성시 속도 rpm oil량은 기본 값으로 생성이 됨.-> Car 클래스에 만들어뒀기 때문에
		System.out.print("차량 제조 회사 : ");
		myCar.company = input.next();
		
		System.out.print("차량 모델 : ");
		myCar.model = input.next();
		
		System.out.print("차량 색상 : ");
		myCar.color = input.next();
		
		
		
		while (run) {
			System.out.println("1. 차량 정보 확인");
			System.out.println("2. 차량 시동 걸기");
			System.out.println("3. 차량 주행 시작");
			System.out.println("4. 차량 주행 종료");
			System.out.print("1~4 숫자만 >>> ");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("차량 정보입니다.");
				System.out.println("차량명 : " + myCar.company);
				System.out.println("차량 모델 : " + myCar.model);
				System.out.println("차량 색상 : " + myCar.color);
				break;
			
			case "2" :
				System.out.println("차량의 시동을 겁니다.");
				myCar.start(); // Car 클래스에 만들어둔 동작
				break;
			
			
			}// 차량 메뉴 스위치문 종료
		
		
		}// 차량 while문 종료
		
		
		
		
		

	}// main 메서드 종료

}// class 종료
