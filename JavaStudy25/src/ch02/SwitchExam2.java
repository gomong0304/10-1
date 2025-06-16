package ch02;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// ������ switch���� ����غ��� -> ���ٽ��� ����Ǿ�����
		// ���ٽ��̶�� ���� -> ȭ��ǥ�� �̿��Ͽ� ���� �����ϴ� ��
		// �޼���� ���ۿ� �ش��ϴ� ����� main �޼��� �ٱ��ʿ� ����
		
		// whoIsIt() �޼��带 ȣ���Ͽ� ó�� �Ҽ��ֵ������� 
		
		Scanner inputStr = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println("�ľ��ϰ� ���� �����̸��� �Է��ϼ���.");
			System.out.print(">>>> ");
			String monster = inputStr.next();
			// Ű����� ������ �޾� monster ������ ����
			// ���� ���� �޼��带 ȣ���Ͽ� ���� ������
			whoIsIt(monster);
			// �޼��� ȣ�� ����� �ƴ�.
			// ������ monster �ؿ��� bio ���� �������� �ٸ����� Ÿ���� ����.
			// �ʺ��ڴ� �ǵ��� ������.
			
		}

	}// main �޼��� ����(�ڹ��� �⺻ �޼���)
	
	// ����� ���� �޼��� �߰�(���� ���� ���� �޼���)
	// whoIsIt��� �޼��� ���� (�Է��� bio��� ���ڿ��� ����)
	static void whoIsIt(String bio) { //���ڿ��� bio ������ ó����
		// void�� ���ϰ��� ���� �� �����
		String kind = null; // null = ���� ���� kind ������ ���ڿ� Ÿ���� ����
		
		switch(bio){
		case "ȣ����","����","������","�����" -> kind = "������"; 
		case "������","����","���","��ѱ�" -> kind = "����";
		case "����","����","��ġ","��ġ" -> kind = "���";
		default -> kind = "�� �� ���� ��ü�Դϴ�." ;
		} // switch�� ����
		
		System.out.println(bio + "�� " + kind + "�� �Ǵܵ˴ϴ�.");
		
	} // ����� ���� �޼��� ����

}// class ����
