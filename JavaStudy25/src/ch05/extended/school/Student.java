package ch05.extended.school;

public class Student extends Person{
	// Person 객체의 자식 클래스
	// Student 객체를 생성하면 Person 객체부터 생성하고 Student가 나중에 생성됨
	
	// 부모 클래스의 외적으로 추가된 필드
	private String studentID; // 학번
	private int grade; 		  // 학년
	private int gpa; 		  // 학점
	
	// Student student = new Student();
	public Student(String name, int height, int weight, int age, 
			String studentID, int grade, int gpa) {
		super(name, height, weight, age); // 부모 생성자의 값을 넣는다.
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	// 부모 생성자 + 자식 기본 생성자
	public Student(String name, int height, int weight, int age) {
		super(name, height, weight, age);
	}
	
	// 부모 기본 생성자 + 자식 기본 생성자용
	public Student() {
		super();
	}
	
	// 자식 class의 getter
	public String getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getGpa() {
		return gpa;
	}
	
	// 자식 class의 setter
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override 
	// 재정의 ( @ : 자바의 특정한 기능을 땡겨온다.)
	// 보모가 만든 코드가 마음에 들지 않아 내가 다시 만듦
	public void show() {
		super.show();
		// 추가 메서드
		
		System.out.println("---- 자식(학생)에서 재정의 한 show ----");
		System.out.println("학생 학번 : " + getStudentID());  // 자식꺼
		System.out.println("학생 학년 : " + getGrade()); 	    // 자식꺼
		System.out.println("학생 학점 : " + getGpa());        // 자식꺼
	}
	
	
}
