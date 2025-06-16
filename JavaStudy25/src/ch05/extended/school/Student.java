package ch05.extended.school;

public class Student extends Person{
	// Person ��ü�� �ڽ� Ŭ����
	// Student ��ü�� �����ϸ� Person ��ü���� �����ϰ� Student�� ���߿� ������
	
	// �θ� Ŭ������ �������� �߰��� �ʵ�
	private String studentID; // �й�
	private int grade; 		  // �г�
	private int gpa; 		  // ����
	
	// Student student = new Student();
	public Student(String name, int height, int weight, int age, 
			String studentID, int grade, int gpa) {
		super(name, height, weight, age); // �θ� �������� ���� �ִ´�.
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	// �θ� ������ + �ڽ� �⺻ ������
	public Student(String name, int height, int weight, int age) {
		super(name, height, weight, age);
	}
	
	// �θ� �⺻ ������ + �ڽ� �⺻ �����ڿ�
	public Student() {
		super();
	}
	
	// �ڽ� class�� getter
	public String getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getGpa() {
		return gpa;
	}
	
	// �ڽ� class�� setter
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
	// ������ ( @ : �ڹ��� Ư���� ����� ���ܿ´�.)
	// ���� ���� �ڵ尡 ������ ���� �ʾ� ���� �ٽ� ����
	public void show() {
		super.show();
		// �߰� �޼���
		
		System.out.println("---- �ڽ�(�л�)���� ������ �� show ----");
		System.out.println("�л� �й� : " + getStudentID());  // �ڽĲ�
		System.out.println("�л� �г� : " + getGrade()); 	    // �ڽĲ�
		System.out.println("�л� ���� : " + getGpa());        // �ڽĲ�
	}
	
	
}
