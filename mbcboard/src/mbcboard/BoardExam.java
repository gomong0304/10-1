package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.Service.BoardService;

public class BoardExam {
	// 필드
	public static Scanner inputStr = new Scanner(System.in); // 공용으로 써진다.
	
	// 생성자 -> static 블럭
	
	// 메서드
	public static void main(String[] args) throws SQLException {
		// mbc 게시판용 jdbc 테스트
		// dto : 객체를 담당
		// dao : 데이터베이스에서 연동을 담당
		// service :  부메뉴와 서비스를 담당
		
		boolean run = true;
		while (run) {
			System.out.println("------mbc 자유 게시판------");
			System.out.println(" 1.회원 | 2.게시판 | 3.종료 ");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" : 
				System.out.println("회원용 서비스로 진입합니다.");
				break;
			case "2" : 
				System.out.println("게시판 서비스로 진입합니다.");
				BoardService boardService = new BoardService();
				boardService.subMenu(inputStr);
				break;
			case "3" : 
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default :
				System.out.println("잘못입력하셨습니다. \n 1~3까지만 입력 바랍니다.");
				break;
			}// switch문 종료
		}// 메뉴 while문 종료
		

	}// main 메서드 종료

}// class 종료
