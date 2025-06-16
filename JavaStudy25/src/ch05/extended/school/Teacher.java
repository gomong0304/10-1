package ch05.extended.school;

public class Teacher extends Person {
	private String teacherID; // ��������ȣ
	private int grade; 		  // ����г�
	private int room; 		  // ��米��
	private int Stcount; 	  // �л���
	
	// �⺻ ������
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

	@Override // ������ ����Ʈ�� ����ϸ� �ּҰ� �����µ� �̰��� �ʵ尪���� ���
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", grade=" + grade + ", room=" + room + ", Stcount=" + Stcount
				+ ", getTeacherID()=" + getTeacherID() + ", getGrade()=" + getGrade() + ", getRoom()=" + getRoom()
				+ ", getStcount()=" + getStcount() + "]";
	}

	@Override // ������ _ �θ𿡼� ���� �޼��尡 ���� �ȵ� �ڽĿ��� �ٽ� �ڵ带 ��ȯ
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		
		System.out.println("---- �ڽ�(����)���� ������ �� show ----");
		System.out.println("���� ������ȣ : " + getTeacherID());	// �ڽĲ�
		System.out.println("���� ����г� : " + getGrade());  		// �ڽĲ�
		System.out.println("���� ��米�� : " + getRoom()); 	    // �ڽĲ�       
		System.out.println("���� ����л��� : " + getStcount());		// �ڽĲ� 
	}
	
}
