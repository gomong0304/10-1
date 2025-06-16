package mbcboard.DTO;

import java.sql.Date;

public class BoardDTO {
	// 게시판의 객체를 담당하고 게터 세터 사용
	// 필드_데이터 베이스와 동일하게 생성
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate; // import java.sql.Date;
	
	// 기본생성자
	
	// 메서드-> 게터 세터
	// 게터(출력용)
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
	
	// 세터(입력용)
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
