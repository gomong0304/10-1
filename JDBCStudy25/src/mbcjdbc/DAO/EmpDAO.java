package mbcjdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {
	// jdbc�� ����ϴ� Ŭ����
	// ����Ŭ�� ������ �ۼ��Ͽ� crud�� ��������
	
	// jdbc�� �̹� ������� �ܺ� ���̺귯���� 5�ܰ��� ������ �ʼ��̴�. (jdbc ��ġ å p14�ʿ� ����)
	// 1�ܰ� : �����ϴ� ��ü�� �־���Ѵ�. Connection �̶�� ��ü ���
	// 2�ܰ� : �������� �����ϴ� ��ü�� ����. Statement(����, ����)/ PrepareStatement (����, ����)
	// 3�ܰ� : �������� �����ϰ� (2����)
	// 4�ܰ� : ������ ���� ����� �޴´�. -> select�� resultset���� �ް� �������� int�� ����
	// 5�ܰ� : ������ �����Ѵ�.
	
	// �ʵ� -> DTO ���� �ϴ°Ű�
	
	// ������ -> �����ϸ� �⺻���� ����
	
	// �޼���
	public void insertEMP(String name, String dept, double score) throws SQLException {
		// 3���� ���� �Ű������� ���� �޾� emp ���̺�� ������ �ؾ���.
		
		Connection conn = null; // db�� �����ϴ� ��ü
		Statement stmt = null; // ������ ���� ��ü (������)
		PreparedStatement pstmt = null; // ������ ���� ��ü (����)
		ResultSet resultSet = null; // ���� ���� ����� ǥ�� ��� -> select ���� ǥ�� ���´�.
		int result = 0; 			// ���� ���� ����� ������ ��� c,u,d�� ������� 1(����), 0(����)�� ���
		// ������ -> 1���� ���� ���� ���� | ���� | ���� �Ǿ����ϴ�.
		// ���н� -> 0���� ���� ���� ���� | ���� | ���� �Ǿ����ϴ�.
		
		try { // ���ܰ� �߻� ���ɼ��� �ִ� ���๮���� Ȱ���Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1�ܰ�� ojdbd6.jar ȣ��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.159:1521:xe", 
					"jdbctest", "jdbctest");
			
			stmt = conn.createStatement(); // ���� ó���� ��ü ����
			// insert into emp(num, name, dept, score)
			// values (emp_seq.nextval,'name','dept','score');
			
			String sql = "insert into emp(num, name, dept, score) "
						+ " values(emp_seq.nextval, '" 
					+ name + "','" + dept + "','" + score + "')"; //  ������ �ϼ�
			
			result = stmt.executeUpdate(sql); // int Ÿ������ ����� ���� ��ɾ�
			
			if(result>0) {
				System.out.println(result + "���� �����͸� �߰��߽��ϴ�. \n");
				conn.commit(); // ���� ����
			}else {
				System.out.println("��� : " + result + " �Դϴ�.");
				System.out.println("�Է� ���� �ѹ� �˴ϴ�.");
				conn.rollback();
			}
			
		}catch(ClassNotFoundException e) { // ClassNotFoundException : ojdbc6.jar�� ã�� �� ���ų� forName �̸��� �߸��� ���
			System.out.println("ojdbc6.jar�� ���ų� forName�� ���ڿ��� �߸��Ǿ����ϴ�.");
			e.printStackTrace(); // �ڹٿ��� �����ϴ� ���� �޼����� �����(���� ���ڵ�)
		}catch(SQLException e) { // url�̳� id,pw�� ���� ���� ó����
			System.out.println("URL�̳� ID,PW�� �߸��Ǿ����ϴ�. Ȯ�����ּ���");
			e.printStackTrace(); // �ڹٿ��� �����ϴ� ���� �޼����� �����(���� ���ڵ�)
		}finally { // �����̵� ���е� �������� ������ ����
			// ������ �ݴ�� �ݾ��ش�.
			stmt.close();
			System.out.println("������Ʈ�� ����");
			conn.close();
			System.out.println("conn�� ����");
		}
	}// insertEMP �޼��� ����

	
	public void selectEMPALL() throws SQLException {
		// TODO Auto-generated method stub
		
		// EMP ���̺� ��� ������ ��ȣ�������� �������� ���
		Connection conn = null; // db�� �����ϴ� ��ü
		Statement stmt = null; // ������ ���� ��ü (������)
		PreparedStatement pstmt = null; // ������ ���� ��ü (����)
		ResultSet resultSet = null; // select�� ����� ǥ�������� ������ü
		int result = 0; 			// update, delete, create ����� ������ ���� (1�� ó�� �Ϸ�)
		
		try {
			// ������ �߻� ���ɼ��ִ� ���๮
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1�ܰ�� ojdbd6.jar ȣ��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.159:1521:xe", 
					"jdbctest", "jdbctest");
			stmt = conn.createStatement(); // ���� ó���� ��ü ����
			
			String sql = "SELECT * FROM EMP ORDER BY NUM ASC"; // NUM ��������
			resultSet = stmt.executeQuery(sql); // ����� ǥ�� ����
			
			System.out.println("--------------------------------------------");
			System.out.println("��� ��ȣ\t �̸�\t �μ�\t �Ի�����");
			System.out.println("--------------------------------------------");
			
			while(resultSet.next()) { // ����� ���� ǥ������ ����Ѵ�.
				// resultSet.next() ǥ�� ���� ������ true, ������ false ó�� ��
				// �츮�� �ε��� ��ȣ ���� �ʵ���� ����!
				 System.out.print(resultSet.getInt("num") + "\t"); // �ʵ���� num�ΰ� ã�Ƽ� ���
				 System.out.print(resultSet.getString("name") + "\t");
				 System.out.print(resultSet.getString("dept") + "\t");
				 System.out.println(resultSet.getDouble("score") + "\t");
				/*
				 * System.out.print(resultSet.getInt(1) + "\t"); // �ʵ���� num�ΰ� ã�Ƽ� ���
				 * System.out.print(resultSet.getString(2) + "\t");
				 * System.out.print(resultSet.getString(3) + "\t");
				 * System.out.println(resultSet.getDouble(4) + "\t");
				 */
			}
			
		}catch(ClassNotFoundException e) { // ClassNotFoundException : ojdbc6.jar�� ã�� �� ���ų� forName �̸��� �߸��� ���
			System.out.println("ojdbc6.jar�� ���ų� forName�� ���ڿ��� �߸��Ǿ����ϴ�.");
			e.printStackTrace(); // �ڹٿ��� �����ϴ� ���� �޼����� �����(���� ���ڵ�)
		}catch(SQLException e) { // URL�̳� ID,PW�� ���� ���� ó����
			System.out.println("URL�̳� ID,PW�� �߸��Ǿ����ϴ�. Ȯ�����ּ���");
			e.printStackTrace(); // �ڹٿ��� �����ϴ� ���� �޼����� �����(���� ���ڵ�)
		}finally { // �����̵� ���е� �������� ������ ����
			// ������ �ݴ�� �ݾ��ش�.
			resultSet.close();
			System.out.println("resultSet ����");
			stmt.close();
			System.out.println("������Ʈ�� ����");
			conn.close();
			System.out.println("conn�� ����");
		}
		
	}// selectEMPALL�޼��� ����


	public void searchEMP(String searchName) throws SQLException {
		// Ű����� �Է¹��� ��ü�� db���� ã�� ����Ѵ�.
		
		Connection conn = null; // db�� �����ϴ� ��ü
		Statement stmt = null; // ������ ���� ��ü (������)
		PreparedStatement pstmt = null; // ������ ���� ��ü (����)
		ResultSet resultSet = null; // select�� ����� ǥ�������� ������ü
		int result = 0; 			// update, delete, create ����� ������ ���� (1�� ó�� �Ϸ�)
		
		try {
			// ������ �߻� ���ɼ��ִ� ���๮
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1�ܰ�� ojdbd6.jar ȣ��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.159:1521:xe", 
					"jdbctest", "jdbctest");
			stmt = conn.createStatement(); // ���� ó���� ��ü ����
			
			String sql = "SELECT * FROM EMP where name = '"+ searchName + "'"; // NUM ��������
			System.out.println("�Էµ� ������ : " + sql);
			resultSet = stmt.executeQuery(sql); // ����� ǥ�� ����
			
			System.out.println("--------------------------------------------");
			System.out.println("��� ��ȣ\t �̸�\t �μ�\t �Ի�����");
			System.out.println("--------------------------------------------");
			
			while(resultSet.next()) { // ����� ���� ǥ������ ����Ѵ�.
				// resultSet.next() ǥ�� ���� ������ true, ������ false ó�� ��
				// �츮�� �ε��� ��ȣ ���� �ʵ���� ����!
				 System.out.print(resultSet.getInt("num") + "\t"); // �ʵ���� num�ΰ� ã�Ƽ� ���
				 System.out.print(resultSet.getString("name") + "\t");
				 System.out.print(resultSet.getString("dept") + "\t");
				 System.out.println(resultSet.getDouble("score") + "\t");
			}
			
		}catch(ClassNotFoundException e) { // ClassNotFoundException : ojdbc6.jar�� ã�� �� ���ų� forName �̸��� �߸��� ���
			System.out.println("ojdbc6.jar�� ���ų� forName�� ���ڿ��� �߸��Ǿ����ϴ�.");
			e.printStackTrace(); // �ڹٿ��� �����ϴ� ���� �޼����� �����(���� ���ڵ�)
		}catch(SQLException e) { // URL�̳� ID,PW�� ���� ���� ó����
			System.out.println("URL�̳� ID,PW�� �߸��Ǿ����ϴ�. Ȯ�����ּ���");
			e.printStackTrace(); // �ڹٿ��� �����ϴ� ���� �޼����� �����(���� ���ڵ�)
		}finally { // �����̵� ���е� �������� ������ ����
			// ������ �ݴ�� �ݾ��ش�.
			resultSet.close();
			System.out.println("resultSet ����");
			stmt.close();
			System.out.println("������Ʈ�� ����");
			conn.close();
			System.out.println("conn�� ����");
		}
	}
}
