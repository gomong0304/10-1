package ch05.extended.school;

public class Teacher extends Person {
	private String teacherID; // 교직원번호
	private int grade; 		  // 담당학년
	private int room; 		  // 담당교실
	private int Stcount; 	  // 학생수
	
	// 기본 생성자
	public Teacher() {
		super();
	}

	// getter
	public String getTeacherID() {
		return teacherID;
	}

	public int getGrade() {
		return grade;
	}

	public int getRoom() {
		return room;
	}

	public int getStcount() {
		return Stcount;
	}
	
	// setter
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setStcount(int stcount) {
		Stcount = stcount;
	}

	@Override // 재정의 프린트로 출력하면 주소가 나오는데 이것을 필드값으로 출력
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", grade=" + grade + ", room=" + room + ", Stcount=" + Stcount
				+ ", getTeacherID()=" + getTeacherID() + ", getGrade()=" + getGrade() + ", getRoom()=" + getRoom()
				+ ", getStcount()=" + getStcount() + "]";
	}

	@Override // 재정의 _ 부모에서 만든 메서드가 맘에 안들어서 자식에서 다시 코드를 변환
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		
		System.out.println("---- 자식(교사)에서 재정의 한 show ----");
		System.out.println("교사 직원번호 : " + getTeacherID());	// 자식꺼
		System.out.println("교사 담당학년 : " + getGrade());  		// 자식꺼
		System.out.println("교사 담당교실 : " + getRoom()); 	    // 자식꺼       
		System.out.println("교사 담당학생수 : " + getStcount());		// 자식꺼 
	}
	
}
