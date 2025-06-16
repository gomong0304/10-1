package mbcjdbc;

import java.sql.SQLException;
import java.util.Scanner;

import mbcjdbc.DAO.EmpDAO;

public class JDBCExam {

	public static void main(String[] args) throws SQLException {
		// ����Ŭ�� �ڹٸ� �����ϴ� JDVC �׽�Ʈ
		// ������Ʈ ��Ŭ�� -> �����н� -> ���Ǳ� �����н� -> �ܺζ��̺귯�� �߰��ʼ�! -> ojdbc6.jar �߰�
		// References Libraries�� �߰��� -> ojdbc6.jar�� import �Ҽ��ִ�.
		// ���� ó�� : ���� �����߿� ��Ÿ���� �ߴ� �Ǵ°��� �������� ���
		// throws SQLException -> sql ��Ÿ�� �߿� ������ ���׷� �ߴܵǴ°��� ó���Ѵ�.
		// ������ import java.sql.SQLException; �ɸ��� Ȯ��
		
		// ��Ű���� 3���� ������ �����Ѵ�.
		// DTO : ��ü��, GETTERT,SETTERT
		// DAO :  ������ ���̽��� �����Ͽ� CRUD ���� ó����
		// SERVICE : �ڹٿ��� CRUD �θ޴���
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("��� �̸� : ");
		String name = input.next();
		
		System.out.print("�μ��� : ");
		String dept = input.next();
		
		System.out.print("�Ի� ���� : ");
		double score = input.nextDouble();
		// Ű����� �Է� �Ϸ� -> num�� db���� ������ ��ü�� �ڵ� ����
		
		// ��ü�� �����Ͽ� DAO���� �����ؾ���.
		EmpDAO empDAO = new EmpDAO(); // DAO ��ü ������ ->  �޼��� ȣ���Ͽ� �� ����
		empDAO.insertEMP(name, dept, score); // ȣ���� -> ����
		
		System.out.println("��� ������ Ȯ���غ���");
		empDAO.selectEMPALL();
		
		System.out.println("�˻��ϰ���� �̸��� �Է��ϼ���");
		System.out.print(">>> ");
		String searchName = input.next();
		empDAO.searchEMP(searchName);

	}// MAIN �޼��� ����

}// CLASS ����
