package ch04.staticBlock;

public class Calculator {
	// 전자계산기용 객체
	// static을 이용하여 구현해보자.
	// 필드
	public static double pi = 3.14159;
	public static String name; // 계산기 이름
	public static String date; // 계산기 구입
	public static String owner; // 계산기 주인'
	public static int result; // 계산기 값이 보관되는 장소
	
	
	// 생성자(생략시 기본생성자) // new 없이 사용하기 위한 초기값
	static {
		name = "카시오";
		date = "2025-05-26";
		owner = "박희진";
	}
	
	// 메서드
	public static int plus(int x, int y) {
		return x + y;	
	}// 플러스 메서드 종료
	
	public static int minus(int x, int y) {
		return x - y;
	}// 마이너스 메서드 종료
		
}
