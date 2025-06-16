package ch04;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {
		// 이뮴과 내장된 객체(달력)을 연결하여
		// 날짜를 출력해보자
		
		Week today = null;
	//	타입   변수  = 빈값;
		
	Calendar calendar = Calendar.getInstance();
	// 타입      변수     =	      객체.메서드
	// 캘린더 타입의 객체가 만들어지면서 calendar 변수에 연결됨
	// Instance는 객체라는뜻 getInstance는 객체를 가져와라
	// 10-1 컴퓨터의 시간을 가져온다.
	
	int year = calendar.get(Calendar.YEAR);
	// 정수타입의 year변수에 캘린더에서 가져온 연도값을 넣는다.
	System.out.println("올해 연도는 : " + year);
	
	
	int month = calendar.get(Calendar.MONTH);
	System.out.println("현재 월은 " + (month+1) + "월 입니다.");
	
	int day = calendar.get(Calendar.DATE);
	System.out.println("날짜 : " + day);
	
	int day2 = calendar.get(Calendar.DAY_OF_MONTH);
	System.out.println("오늘의 날짜 : " + day2 + "일");
	
	int week = calendar.get(Calendar.DAY_OF_WEEK);
	System.out.println("오늘은 " + week + "요일입니다");
	
	switch(week) {
	case 1 :
		today = Week.SUNDAY; break;
	case 2 :
		today = Week.MONDAY; break;
	case 3 :
		today = Week.TUESDAY; break;
	case 4 :
		today = Week.WEDNESDAY; break;
	case 5 :
		today = Week.THURSDAY; break;
	case 6 :
		today = Week.FRIDAY; break;
	case 7 :
		today = Week.SATURDAY; break;
	}// 스위치문 종료
		
	}// main 메서드

}// class 종료
