package ch05.extended.school;

import java.util.Scanner;

public class MBCSchoolExam {
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputint = new Scanner(System.in);
	
	// �ʵ�
	public static Teacher[] teachers = null;
	public static Student[] students = null;
	
	static {
		// ���� �޼��� ����� �ʱⰪ ������
		teachers = new Teacher[10]; // 10���� ������ �迭
		students = new Student[10]; // 10���� �л� �迭
	}
	
	// ������
	
	// �޼���
	public static void main(String[] args) {
		// ��ü�� �����Ͽ� ��� �׽�Ʈ��

		// ������ �׽�Ʈ��
		/*
		 * Person person0 = new Person(); // �θ�ü ���� 
		 * Person person = new Teacher(); //
		 * �ڽİ�ü ���� Person student = new Student(); // �ڽİ�ü ����
		 */		
		
		boolean run = true;
		while(run) {
			Person person = null;
			System.out.println("MBC ��ī���� LMS ���α׷��Դϴ�.");
			System.out.println("1.���� ��� | 2.�л� ��� | 3.���α׷� ����");
			System.out.print(">>> ");
			String select = inputStr.next(); // Ű����� ���� ��
			switch(select) {
			case "1" :
				person = new Teacher(); // Person person = new Teacher(); �ڵ�Ÿ�Ժ�ȯ
				person = baseInput(person); // ��ӿ� �⺻ �޼��� (�ݺ��ڵ��)
				Teacher child = (Teacher)person; // Teacher child = new Teacher(); ����Ÿ�Ժ�ȯ
				System.out.print("������ ��ȣ : ");
				child.setTeacherID(inputStr.next());
				
				System.out.print("������ ��� �г� : ");
				child.setGrade(inputint.nextInt());
				
				System.out.print("������ ��� ���� : ");
				child.setRoom(inputint.nextInt());
				
				System.out.print("������ ��� �л� �� : ");
				child.setStcount(inputint.nextInt());
				
				System.out.println("���� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
				System.out.println(child);
				System.out.println("===========================");
				break;
				// �ڽİ�ü �Է¿Ϸ�
				// for���� �̿��ؼ� �迭�� �������ְ� �غ���
				
			case "2" :
				person = new Student(); // Person person = new Teacher(); �ڵ�Ÿ�Ժ�ȯ
				person = baseInput(person);
				
				Student child2 = (Student) person; // �⺻ ������ �̿�
				System.out.print("�л� ��ȣ : ");
				child2.setStudentID(inputStr.next());
				
				System.out.print("�л� �г� : ");
				child2.setGrade(inputint.nextInt());
				
				System.out.print("�л� ���� : ");
				child2.setGpa(inputint.nextInt());
				child2.show();
				System.out.println("�л� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
				System.out.println("========================");
				break;
				
			}// switch�� ����
		}// while�� ����
		
		
		// �������� ���� ���� �ڵ�
		Teacher teacher = new Teacher(); // ���� ���͸� ����Ϸ��� �����ڸ� ����� �ִ°� ����
		// ������ �ڽİ�ü
		System.out.print("������ ��ȣ : ");
		teacher.setTeacherID(inputStr.next());
		
		System.out.print("��� �г� : ");
		teacher.setGrade(inputint.nextInt());
		
		System.out.print("��� ���� : ");
		teacher.setRoom(inputint.nextInt());
		
		System.out.print("��� �л��� : ");
		teacher.setStcount(inputint.nextInt());
		
		// ��ü �θ� ��ü
		System.out.print("������ �̸� : ");
		teacher.setName(inputStr.next());
		
		System.out.print("������ ���� : ");
		teacher.setAge(inputint.nextInt());
		
		System.out.print("������ Ű : ");
		teacher.setHeight(inputint.nextInt());
		
		System.out.print("������ ������ : ");
		teacher.setWeight(inputint.nextInt());
		
		System.out.println("�Էµ� �������� ���� : " + teacher);
		teacher.show(); // �θ� �޼���.
		System.out.println("==================================");
		
		// �л�
		// ��ü �θ� ��ü
		System.out.println("�л��� �̸� : ");
		System.out.print(">>> ");
		String name = inputStr.next();
		
		System.out.println("�л��� ���� : ");
		System.out.print(">>> ");
		int age = inputint.nextInt();
		
		System.out.println("�л��� Ű : ");
		System.out.print(">>> ");
		int height = inputint.nextInt();
		
		System.out.println("�л��� ������ : ");
		System.out.print(">>> ");
		int weight = inputint.nextInt();
		
		// �л� �ڽ� ��ü
		System.out.println("�л��� �й� : ");
		System.out.print(">>> ");
		String sid= inputStr.next();
		
		System.out.println("�л��� �г� : ");
		System.out.print(">>> ");
		int grade = inputint.nextInt();
		
		System.out.println("�л��� ���� : ");
		System.out.print(">>> ");
		int gpa = inputint.nextInt();
		
		Student student = new Student(name, height, weight, age, sid, grade, gpa);
		//�����ڸ� ���ؼ� ���� ����.
		
		student.show(); // Student��ü �ȿ� �޼���
	
	}// main �޼��� ����

	public static Person baseInput(Person person) {// ��θ� �վ�����Ѵ�
		System.out.print("�̸� :");
		person.setName(inputStr.next());
		
		System.out.print("Ű : ");
		person.setHeight(inputint.nextInt());
		
		System.out.print("������ : ");
		person.setWeight(inputint.nextInt());
		
		System.out.print("���� : ");
		person.setAge(inputint.nextInt());
		System.out.println("========================");
		// �θ� ��ü ����Ͽ� �Է¿Ϸ�
		return person;
	}// �θ� ��ü �Է¿� ���� �޼���
	
	
	
	
	
	
	
}// class ����
