package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.Service.BoardService;

public class BoardExam {
	// �ʵ�
	public static Scanner inputStr = new Scanner(System.in); // �������� ������.
	
	// ������ -> static ��
	
	// �޼���
	public static void main(String[] args) throws SQLException {
		// mbc �Խ��ǿ� jdbc �׽�Ʈ
		// dto : ��ü�� ���
		// dao : �����ͺ��̽����� ������ ���
		// service :  �θ޴��� ���񽺸� ���
		
		boolean run = true;
		while (run) {
			System.out.println("------mbc ���� �Խ���------");
			System.out.println(" 1.ȸ�� | 2.�Խ��� | 3.���� ");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" : 
				System.out.println("ȸ���� ���񽺷� �����մϴ�.");
				break;
			case "2" : 
				System.out.println("�Խ��� ���񽺷� �����մϴ�.");
				BoardService boardService = new BoardService();
				boardService.subMenu(inputStr);
				break;
			case "3" : 
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. \n 1~3������ �Է� �ٶ��ϴ�.");
				break;
			}// switch�� ����
		}// �޴� while�� ����
		

	}// main �޼��� ����

}// class ����
