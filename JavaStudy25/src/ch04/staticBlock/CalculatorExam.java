package ch04.staticBlock;

public class CalculatorExam {

	public static void main(String[] args) {
		// 정적필드와 정적메서드를 사용해보자.
		// Calculator myCalc = new Calculator(); // 객체를 생성하여 구현 -> 없이 써보자.
		// 되도록이면 new를 사용하자.
		// 값이 꼬일수도있다.

		System.out.println("계산기 내부의 파이값 : " + Calculator.pi);
		double result1 = 10 * 10 * Calculator.pi ;
		System.out.println("정적 필드로 파이 계산 결과 : " + result1);
		int result2 = Calculator.plus(10, 20);
		System.out.println("정적 메서드로 플러스 계산 결과 : " + result2);
		int result3 = Calculator.minus(50, 30);
		System.out.println("정적 메서드로 마이너스 계산 결과 : " + result3);
		
		System.out.println("a사용자가 계산기를 이용해서 값을 계산한다.");
		Calculator.result = 10+50;
		System.out.println("계산기 결과 값 : " + Calculator.result);
		System.out.println("b사용자가 계산기를 빌려달라고 한다.");
		Calculator.result = 100+500;
		System.out.println("a사용자가 전에 계산했던 10+50값에 100을 더했다.");
		Calculator.result = Calculator.result+100;
		System.out.println("계산기 결과값 : " + Calculator.result);
	}// main 메서드 종료

}// class 종료
