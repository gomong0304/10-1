package mbcboard.Service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.DAO.BoardDAO;
import mbcboard.DTO.BoardDTO;

public class BoardService {
	// dao�� dto�� ����Ͽ� �θ޴��� crud�� ó���Ѵ�.
	// �ʵ�
	public BoardDAO boardDAO = new BoardDAO(); // ��� ���� dao ��ü�� ȣ���� �Ǹ鼭 ������ �ȴ�. 1,2�ܰ� ����
	
	// ������
	
	// �޼��� (�θ޴�, ����, ��κ���, �Ѱ�����, �����ϱ�, �����ϱ�)
	public void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true;
		while(subRun) {
			System.out.println("----mbc ��ī���� �Խ��� ����----");
			System.out.println("1.��� ���� | 2.�Խñ� �ۼ� | 3.�Խñ� �ڼ��� ���� | 4.�Խñ� ���� | 5.�Խñ� ���� | 6.������");
			System.out.print(">>> ");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1" :
				System.out.println("��� �Խñ� ����");
				selectAll(boardDAO);
				break;
			case "2" :
				System.out.println("�Խñ� �ۼ��޼���");
				insertBoard(boardDAO, inputStr);
				break;
			case "3" :
				System.out.println("�Խñ� �ڼ��� ����");
				readOne(inputStr);
				break;
			case "4" :
				System.out.println("�Խñ� ����");
				modify(inputStr);
				break;
			case "5" :
				System.out.println("�Խñ� ����");
				deleteone();
				break;
			case "6" :
				System.out.println("�Խñ� ���� ����");
				boardDAO.connection.close(); // �Խ��� ����� connection ����
				subRun = false;
				break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. \n 1~6�� �Է����ּ���");
				break;
			}// switch�� ����
		}// while�� ����
	}// �޼��� ����

	private void deleteone() throws SQLException {
		// �Խù��� ��ȣ�� �޾� �����Ѵ�.
		System.out.println("�����Ͻ� �Խñ��� ��ȣ�� �Է��ϼ���.");
		System.out.print(">>> ");
		Scanner inputInt = new Scanner(System.in);
		int selectBno = inputInt.nextInt();
		boardDAO.deleteone(selectBno);
		System.out.println("---------------------��---------------------");
		
	}// �Խñ� ���� �޼��� ����

	private void modify(Scanner inputStr) throws SQLException {
		// ������ ã�Ƽ� ������ �����Ѵ�.
		System.out.println("�����Ϸ��� �Խñ��� ������ �Է��ϼ���");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.modify(title, inputStr);
		System.out.println("---------------------��---------------------");
		
	}// �Խñ� ���� �޼��� ����

	private void readOne(Scanner inputStr) throws SQLException {
		// ������ �Է��ϸ� ������ ���̵��� select ó��
		System.out.println("������� �Խñ��� ������ �Է��ϼ���");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("---------------------��---------------------");	
	}// readOne �޼��� ����

	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		// Ű����� �Է��� �����͸� dto�� ����Ͽ� �����ͺ��̽��� insert����
		BoardDTO boardDTO = new BoardDTO(); // ��ü ����
		System.out.print("�ۼ��� : ");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("���� : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("���� : ");
		boardDTO.setBcontent(inputLine.nextLine()); // ���Ⱑ �ִ� �����϶��� nextLine()
		
		boardDAO.insertBoard(boardDTO); // ������ ���� ��ü�� DAO���� �����Ѵ�.
		System.out.println("------------insertBoard �޼��� ����------------");
	}// insertBoard �޼��� ����

	private void selectAll(BoardDAO boardDAO) throws SQLException {
		// DAO���� ��ü���� �ϴ� ���񽺸� �����Ѵ�.
		System.out.println("--------------------------------------------");
		System.out.println("----------------mbc �Խ��� ���----------------");
		boardDAO.selectAll();
		System.out.println("--------------------------------------------");	
	}// selectAll �޼��� ����
}
