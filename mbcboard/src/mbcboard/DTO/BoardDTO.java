package mbcboard.DTO;

import java.sql.Date;

public class BoardDTO {
	// �Խ����� ��ü�� ����ϰ� ���� ���� ���
	// �ʵ�_������ ���̽��� �����ϰ� ����
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate; // import java.sql.Date;
	
	// �⺻������
	
	// �޼���-> ���� ����
	// ����(��¿�)
	public int getBno() {
		return bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	
	public Date getBdate() {
		return bdate;
	}
	
	// ����(�Է¿�)
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
}
