package ch01;

import java.util.Scanner;// �ܺζ��̺귯��

public class LogicalExam {

	public static void main(String[] args) {
		// ������ �����ڴ� ũ�� 5���� ������ �ִ�.
		// & : �� �� -> ~�̰� (2���� ������ ��� ���� ��쿡 ��)
		// | : �� �� -> ~�̰ų� (2���� �� �Ѱ��� ���� ��쿡 ��)
		// ! : �� ���� -> ���� ������ ������
		// ^ : ��Ÿ�� �� �� -> ������ �������� 1 + 1 = 0 ���� ����� �� 
		
		String loginid = "phj" ;
		String loginpw = "1234" ;
		
		
		Scanner input = new Scanner(System.in);
		// �ֿܼ� Ű����� ���� �о� ���� ��ü�� ������
		// sc+��Ʈ��+�����̽���
		
		System.out.print("�α����� id�� �Է��ϼ��� : ");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� id�� : " + id + " �Դϴ�.");
		
		System.out.print("�α����� ��ȣ�� �Է��ϼ��� : ");
		String pw = input.nextLine();
		System.out.println("==���� ���Դϴ�.============");
		
		if( (loginid.equals(id)) & (loginpw.equals(pw))) {
			// ������ �ִ� id�� Ű����� �Է��� id�� ������
			// �̰ų� (or)
			// ������ �ִ� pw�� Ű����� �Է��� pw�� ������
			System.out.println("id�� pw�� ��ġ�մϴ�.");
			System.out.println("�α��� ����!!");	
		}else { // if���� false ó����
			System.out.println("id�� pw�� �ٸ��ϴ�.");
			System.out.println("�α��� ����!!");
		}// if�� ����
	
	}// main �޼��� ����

}// class ����

