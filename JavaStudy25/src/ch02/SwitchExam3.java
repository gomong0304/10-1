package ch02;

import java.util.Scanner;

public class SwitchExam3 {

	public static void main(String[] args) {
		// ����� ���� �޼��带 void ���� ���� �޾� ó���ϴ� �ڵ�
		
		Scanner inputStr = new Scanner(System.in);
		System.out.println();
		System.out.println("������ �̸��� �Է��ϼ���");
		System.out.print(">>> ");
		String monster = inputStr.next();
		String kind = whoIsIt(monster);
		// whoIsIt(�����̸�) ó���Ŀ� kind ���� �޾� String�� ����
		// The method whoIsIt(String) is undefined for the type SwitchExam3
		System.out.println(monster + "�� " + kind + "�� �Ǵܵ˴ϴ�.");

	}// main �޼��� ����

	static String whoIsIt(String monster) {
		
		String kind = null; // null = ���� ���� kind ������ ���ڿ� Ÿ���� ����
		switch(monster){
		case "ȣ����","����","������","�����" -> kind = "������"; 
		case "������","����","���","��ѱ�" -> kind = "����";
		case "����","����","��ġ","��ġ" -> kind = "���";
		default -> kind = "�� �� ���� ��ü�Դϴ�." ;
		} // switch�� ����
		
		return kind;
	}

}// class ����
