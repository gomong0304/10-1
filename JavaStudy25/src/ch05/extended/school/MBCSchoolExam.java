package ch05.extended.school;

import java.util.Scanner;

public class MBCSchoolExam {
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputint = new Scanner(System.in);
	
	// 필드
	public static Teacher[] teachers = null;
	public static Student[] students = null;
	
	static {
		// 메인 메서드 실행시 초기값 지정용
		teachers = new Teacher[10]; // 10명의 선생님 배열
		students = new Student[10]; // 10명의 학생 배열
	}
	
	// 생성자
	
	// 메서드
	public static void main(String[] args) {
		// 객체를 생성하여 상속 테스트용

		// 다형성 테스트용
		/*
		 * Person person0 = new Person(); // 부모객체 생성 
		 * Person person = new Teacher(); //
		 * 자식객체 생성 Person student = new Student(); // 자식객체 생성
		 */		
		
		boolean run = true;
		while(run) {
			Person person = null;
			System.out.println("MBC 아카데미 LMS 프로그램입니다.");
			System.out.println("1.교사 등록 | 2.학생 등록 | 3.프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next(); // 키보드로 받은 값
			switch(select) {
			case "1" :
				person = new Teacher(); // Person person = new Teacher(); 자동타입변환
				person = baseInput(person); // 상속용 기본 메서드 (반복코드용)
				Teacher child = (Teacher)person; // Teacher child = new Teacher(); 강제타입변환
				System.out.print("교직원 번호 : ");
				child.setTeacherID(inputStr.next());
				
				System.out.print("교직원 담당 학년 : ");
				child.setGrade(inputint.nextInt());
				
				System.out.print("교직원 담당 교실 : ");
				child.setRoom(inputint.nextInt());
				
				System.out.print("교직원 담당 학생 수 : ");
				child.setStcount(inputint.nextInt());
				
				System.out.println("교사 정보 입력이 완료되었습니다.");
				System.out.println(child);
				System.out.println("===========================");
				break;
				// 자식객체 입력완료
				// for문을 이용해서 배열에 넣을수있게 해보자
				
			case "2" :
				person = new Student(); // Person person = new Teacher(); 자동타입변환
				person = baseInput(person);
				
				Student child2 = (Student) person; // 기본 생성자 이용
				System.out.print("학생 번호 : ");
				child2.setStudentID(inputStr.next());
				
				System.out.print("학생 학년 : ");
				child2.setGrade(inputint.nextInt());
				
				System.out.print("학생 학점 : ");
				child2.setGpa(inputint.nextInt());
				child2.show();
				System.out.println("학생 정보 입력이 완료되었습니다.");
				System.out.println("========================");
				break;
				
			}// switch문 종료
		}// while문 종료
		
		
		// 다형성을 배우기 전의 코드
		Teacher teacher = new Teacher(); // 게터 세터를 사용하려면 생성자를 만들어 주는게 좋음
		// 선생님 자식객체
		System.out.print("교직원 번호 : ");
		teacher.setTeacherID(inputStr.next());
		
		System.out.print("담당 학년 : ");
		teacher.setGrade(inputint.nextInt());
		
		System.out.print("담당 교실 : ");
		teacher.setRoom(inputint.nextInt());
		
		System.out.print("담당 학생수 : ");
		teacher.setStcount(inputint.nextInt());
		
		// 전체 부모 객체
		System.out.print("선생님 이름 : ");
		teacher.setName(inputStr.next());
		
		System.out.print("선생님 나이 : ");
		teacher.setAge(inputint.nextInt());
		
		System.out.print("선생님 키 : ");
		teacher.setHeight(inputint.nextInt());
		
		System.out.print("선생님 몸무게 : ");
		teacher.setWeight(inputint.nextInt());
		
		System.out.println("입력된 선생님의 정보 : " + teacher);
		teacher.show(); // 부모 메서드.
		System.out.println("==================================");
		
		// 학생
		// 전체 부모 객체
		System.out.println("학생의 이름 : ");
		System.out.print(">>> ");
		String name = inputStr.next();
		
		System.out.println("학생의 나이 : ");
		System.out.print(">>> ");
		int age = inputint.nextInt();
		
		System.out.println("학생의 키 : ");
		System.out.print(">>> ");
		int height = inputint.nextInt();
		
		System.out.println("학생의 몸무게 : ");
		System.out.print(">>> ");
		int weight = inputint.nextInt();
		
		// 학생 자식 객체
		System.out.println("학생의 학번 : ");
		System.out.print(">>> ");
		String sid= inputStr.next();
		
		System.out.println("학생의 학년 : ");
		System.out.print(">>> ");
		int grade = inputint.nextInt();
		
		System.out.println("학생의 학점 : ");
		System.out.print(">>> ");
		int gpa = inputint.nextInt();
		
		Student student = new Student(name, height, weight, age, sid, grade, gpa);
		//생성자를 통해서 값을 넣음.
		
		student.show(); // Student객체 안에 메서드
	
	}// main 메서드 종료

	public static Person baseInput(Person person) {// 통로를 뚫어줘야한다
		System.out.print("이름 :");
		person.setName(inputStr.next());
		
		System.out.print("키 : ");
		person.setHeight(inputint.nextInt());
		
		System.out.print("몸무게 : ");
		person.setWeight(inputint.nextInt());
		
		System.out.print("나이 : ");
		person.setAge(inputint.nextInt());
		System.out.println("========================");
		// 부모 객체 사용하여 입력완료
		return person;
	}// 부모 객체 입력용 공통 메서드
	
	
	
	
	
	
	
}// class 종료
