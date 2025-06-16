package ch05.extended.school;

public class Person {
	// �θ� Ŭ������ �ڽ��� ��� �޴´�.
	private String name;
	private int height;
	private int weight;
	private int age;
	
	// Ŀ���� ������
	public Person(String name, int height, int weight, int age) {
		// Person person = new Person("�̸�", Ű, ������, ����)
		super(); // �θ������ -> superclass (�ڹ��� �ֻ��� �θ�ü) -> ��������
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	// �⺻������
	public Person() { // �⺻������ = new Person(); ��
		super();
	}
	
	// getter�޼���(�ʵ尡 ���������� ����Ǿ��� ������ �޼���� ���� -> ĸ��ȭ)
	public String getName() {
		// �̸� �ʵ� ���� �����Ѵ�.
		return name + "��";
	}

	public int getHeight() {
		// Ű �ʵ� ���� �����Ѵ�.
		return height;
	}

	public int getWeight() {
		// ������ �ʵ� ���� �����Ѵ�.
		return weight;
	}

	public int getAge() {
		// ���� �ʵ� ���� �����Ѵ�.
		return age;
	}
	
	// setter
	public void setName(String name) {
		// �Ķ���ͷ� ���� �̸��� �ʵ�� �����Ѵ�.
		this.name = name;
	}

	public void setHeight(int height) {
		// �Ķ���ͷ� ���� Ű�� �ʵ�� �����Ѵ�.
		this.height = height;
	}

	public void setWeight(int weight) {
		// �Ķ���ͷ� ���� �����Ը� �ʵ�� �����Ѵ�.
		this.weight = weight;
	}

	public void setAge(int age) {
		// �Ķ���ͷ� ���� ���̸� �ʵ�� �����Ѵ�.
		this.age = age;
	}

	// �θ� ������ �ִ� ���� �޼��带 ������
	
	// �߰� �޼��� -> �ڽĿ��� ���İ� �ȴ�.
		public void show() { // student�� ��������� show �޼��带 �θ�� �ű��
			// �ʿ���� ����� �ּ�ó����
			// �Էµ� �ʵ带 ����ϴ� �޼���
			System.out.println("---------------------------");
			System.out.println("�̸� : " + getName()); 	 // �θ� 
			System.out.println("���� : " + getAge());  	 // �θ�
			System.out.println("Ű : " + getHeight()); 	 // �θ�
			System.out.println("������ : " + getWeight()); // �θ�
			System.out.println("---------------------------");
			/*
			 * System.out.println("�л� �й� : " + getStudentID()); // �ڽĲ�
			 * System.out.println("�л� �г� : " + getGrade()); // �ڽĲ�
			 * System.out.println("�л� ���� : " + getGpa()); // �ڽĲ�
			 */
		}
}	
