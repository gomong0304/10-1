package mbcboard.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.DTO.BoardDTO;

public class BoardDAO {
	// �Խ����� DB�� ������ ����Ѵ�.
	// JDBC 5�ܰ踦 ���
	// 1�ܰ� : Connect ��ü�� ����Ͽ� ojdbc6.jar�� ����
	// 2�ܰ� : URL,ID,PW,SQL �������� �ۼ��Ѵ�
	// 3�ܰ� : ������ ����
	// 4�ܰ� : �������� �������� �޴´�
	// 5�ܰ� : �������Ḧ ����
	
	// �ʵ� (1~5�ܰ迡�� ����� ��ü)
	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null;	// 1�ܰ迡�� ����ϴ� ��ü
	public Statement statement = null;		// 3�ܰ迡�� ����ϴ� ��ü (����), ���� ���� ó�� '"+ name +"'
	public PreparedStatement preparedStatement = null; // 3�ܰ迡�� ����ϴ� ��ü (����) , ?(���Ķ����)
	public ResultSet resultSet = null;		// 4�ܰ迡�� ��� �޴� ǥ ��ü (select ���)
	public int result = 0;					// 4�ܰ迡�� ��� �޴� ���� (insert,update,delete)
											// 1���� ���� ���� | ���� | ���� �Ǿ����ϴ�.(����ó�� -> commit)
											// 0���� ���� ���� | ���� | ���� �Ǿ����ϴ�.(������ó�� -> rollback)									 
	// �⺻������
	public BoardDAO() {
		
		try {
			// ���ܰ� �߻��Ҽ��ִ� ���๮
			// ���α׷� ���� ���� ó��
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1�ܰ� ojdbc6.jar ȣ��	
			connection = DriverManager.getConnection
					("jdbc:oracle:thin:@192.168.0.159:1521:xe", "boardtest", "boardtest"); // 2�ܰ�
		} catch(ClassNotFoundException e) {
			System.out.println("driver �̸��̳� ojdbc6.jar ������ �߸��Ǿ����ϴ�.");
			e.printStackTrace();
			System.exit(0); // ��������
		} catch(SQLException e) {
			System.out.println("URL,ID,PW�� �߸��Ǿ����ϴ�. BoardDAO�� �⺻�����ڸ� Ȯ���ϼ���.");
			e.printStackTrace();
			System.exit(0); // ��������
		}
	}// �⺻ ������ ����
	
	// �޼���
	public void selectAll() throws SQLException { // throws SQLException ������ ���� ����ó����
		// SQL ����Ͽ� ��ü ��� ���� ��� ���
		try {
		String sql = "select bno, btitle, bwriter, bdate from board order by bdate desc";
		// �����ͺ��̽��� board ���̺� ������ �������� ������
		
		statement = connection.createStatement(); // �������� ������ ��ü
		resultSet = statement.executeQuery(sql); // �������� �����Ͽ� ����� ǥ�� �޴´�. ǥ -> executeQuery(sql)!!!!!!!!!
		
		System.out.println("��ȣ\t ����\t\t �ۼ���\t �ۼ���\t");
		while(resultSet.next()) { // ���ǥ�� ���������� �Ʒ����� �������鼭 ����� �Ҽ��ִ�.
			System.out.print(resultSet.getInt("bno") + "\t");
			System.out.print(resultSet.getString("btitle") + "\t" + "\t");
			System.out.print(resultSet.getString("bwriter") + "\t");
			System.out.println(resultSet.getDate("bdate") + "\t");
		}
		System.out.println("----------------��----------------");
		} catch(SQLException e) {
			// ���� �߻��� ����ó����
			System.out.println("selectAll()�޼��忡 �������� �߸��Ǿ����ϴ�.");
			e.printStackTrace();
		} finally { // �׻���๮
			resultSet.close();
			statement.close(); // ���� ��ü�� �ݾƾ� �ٸ� �޼��嵵 ���� �۵���
		}
	}// selectAll �޼��� ����

	public void insertBoard(BoardDTO boardDTO) throws SQLException {
		// jdbc�� �̿��Ͽ� insert ������ ó���Ѵ�.
		// preparedStatement ���� ����غ���
		// ���� �������̶�� �ϰ� '?'�� ����ؼ� ���ͷ� �Է��Ѵ�.
		
		try {
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bdate) " + " values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle()); 	// ù��° ����ǥ�� DTO ��ü�� �ִ� ������ �ִ´�
			preparedStatement.setString(2, boardDTO.getBcontent()); // �ι�° ����ǥ�� DTO ��ü�� �ִ� ������ �ִ´�
			preparedStatement.setString(3, boardDTO.getBwriter()); 	// ����° ����ǥ�� DTO ��ü�� �ִ� ������ �ִ´�
			System.out.println("���� Ȯ�� : " + sql); 					// �������� �ϼ����� ���ڴ�. ���߿� �ּ�ó���ϸ� ��
			
			result = preparedStatement.executeUpdate(); 			// ������ �����ؼ� ����� ������ ���� ���� -> executeUpdate()!!!!!! ��ȣ�ȿ� sql ���� ���� �߻��ϴϱ� ��������
			
			if(result > 0) {
				System.out.println(result + "���� �Խù��� ��� �Ǿ����ϴ�.");
				connection.commit(); // ��������
			} else {
				System.out.println("���� ���� ��� :" + result );
				System.out.println("�Է� ����!!");
				connection.rollback(); // ���� ���
			}
			
		} catch (SQLException e) {
			System.out.println("���ܹ߻� : insertBoard() �޼����� �������� Ȯ�����ּ���");
			e.printStackTrace();
		} finally {
			// ���� �߻� �� ���� ������ ������ ó���Ǵ� ���๮
			preparedStatement.close();
		}
	}// insertBoard �޼��� ����

	public void readOne(String title) throws SQLException {
		// ���� ���ڿ��� �Ѿ�°��� select ó���Ͽ� �����
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board where btitle = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title); // service���� �Ѿ�� ã�� ���� ������ ?�� �Ѿ��.
			resultSet = preparedStatement.executeQuery(); // ������ ���� �� ����� ǥ�� �޴´�.
			
			if(resultSet.next()) {// �˻� ����� ������!!
				BoardDTO boardDTO = new BoardDTO(); // ��ü ����
				
				boardDTO.setBno(resultSet.getInt("bno"));
				boardDTO.setBtitle(resultSet.getString("btitle"));
				boardDTO.setBcontent(resultSet.getString("bcontent"));
				boardDTO.setBwriter(resultSet.getString("bwriter"));
				boardDTO.setBdate(resultSet.getDate("bdate"));
				// ������ ���̽��� �ִ� ���� ��ü�� �ֱ� �Ϸ�
				
				System.out.println("---------------------------------");
				System.out.println("��ȣ : " + boardDTO.getBno());
				System.out.println("���� : " + boardDTO.getBtitle());
				System.out.println("���� : " + boardDTO.getBcontent());
				System.out.println("�ۼ��� : " + boardDTO.getBwriter());
				System.out.println("�ۼ��� : " + boardDTO.getBdate());
				
			} else {// �˻� ����� ������!!
				System.out.println("�ش��ϴ� �Խù��� �������� �ʽ��ϴ�.");
			}// if�� ����
			
		} catch (SQLException e) {
			System.out.println("���� �߻� : readOne() �޼��带 Ȯ���ϼ���.");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
		
	}// readOne�޼��� ����

	public void modify(String title, Scanner inputStr) throws SQLException {
		// ������ ã�Ƽ� ������ �����Ѵ�.
		
		BoardDTO boardDTO = new BoardDTO(); // �� ��ü ����
		
		System.out.println("[���� ������ �Է��ϼ���]");
		System.out.print("���� : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("���� : ");
		boardDTO.setBcontent(inputLine.nextLine());
		
		try {
			String sql = "update board set btitle=? , bcontent=?, bdate=sysdate where btitle=? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle());
			preparedStatement.setString(2, boardDTO.getBcontent());
			preparedStatement.setString(3, title);
			
			result = preparedStatement.executeUpdate(); // ������ ������ ����� ������ ����
			
			if (result > 0) {
				System.out.println(result + "���� �����Ͱ� �����Ǿ����ϴ�.");
				connection.commit();
			} else {
				System.out.println("������ �Ϸ���� �ʾҽ��ϴ�.");
				connection.rollback();
			}// if�� ����
			
		} catch (SQLException e) {
			System.out.println("���ܹ߻� : modify �޼���� sql���� Ȯ���ϼ���!!!");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
		
		
	}// �Խñ� modify �޼��� ����

	public void deleteone(int selectBno) throws SQLException {
		// ���񽺿��� ���� �Խù��� ��ȣ�� �̿��Ͽ� �����͸� �����Ѵ�.
		
		try {
			String sql = "delete from board where bno = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, selectBno);
			result = preparedStatement.executeUpdate(); // ������ ���� �� ����� ������ ����
			
			if (result > 0) {
				System.out.println(result + "���� �Խù��� ���� �Ǿ����ϴ�.");
				connection.commit();
			} else {
				System.out.println("�Խù��� ���� ���� �ʾҽ��ϴ�.");
				connection.rollback();
			}
			
			System.out.println("------------------------------------------");
			selectAll(); // ���� �� ��ü ����Ʈ ���Ⱑ �����ϴ�.
			
		} catch (SQLException e) {
			System.out.println("���ܹ߻� : deleteOne() �޼���� sql���� Ȯ���ϼ���");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
		
	}// �Խñ� ���� �޼��� ����
	

}
