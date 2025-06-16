package mbcboard.Service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.DAO.BoardDAO;
import mbcboard.DTO.BoardDTO;

public class BoardService {
	// dao와 dto를 사용하여 부메뉴와 crud를 처리한다.
	// 필드
	public BoardDAO boardDAO = new BoardDAO(); // 방금 만든 dao 객체가 호출이 되면서 실행이 된다. 1,2단계 실행
	
	// 생성자
	
	// 메서드 (부메뉴, 생성, 모두보기, 한개보기, 수정하기, 삭제하기)
	public void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true;
		while(subRun) {
			System.out.println("----mbc 아카데미 게시판 서비스----");
			System.out.println("1.모두 보기 | 2.게시글 작성 | 3.게시글 자세히 보기 | 4.게시글 수정 | 5.게시글 삭제 | 6.나가기");
			System.out.print(">>> ");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1" :
				System.out.println("모든 게시글 보기");
				selectAll(boardDAO);
				break;
			case "2" :
				System.out.println("게시글 작성메서드");
				insertBoard(boardDAO, inputStr);
				break;
			case "3" :
				System.out.println("게시글 자세히 보기");
				readOne(inputStr);
				break;
			case "4" :
				System.out.println("게시글 수정");
				modify(inputStr);
				break;
			case "5" :
				System.out.println("게시글 삭제");
				deleteone();
				break;
			case "6" :
				System.out.println("게시글 보기 종료");
				boardDAO.connection.close(); // 게시판 종료시 connection 종료
				subRun = false;
				break;
			default :
				System.out.println("잘못입력하셨습니다. \n 1~6만 입력해주세요");
				break;
			}// switch문 종료
		}// while문 종료
	}// 메서드 종료

	private void deleteone() throws SQLException {
		// 게시물의 번호를 받아 삭제한다.
		System.out.println("삭제하실 게시글의 번호를 입력하세요.");
		System.out.print(">>> ");
		Scanner inputInt = new Scanner(System.in);
		int selectBno = inputInt.nextInt();
		boardDAO.deleteone(selectBno);
		System.out.println("---------------------끝---------------------");
		
	}// 게시글 삭제 메서드 종료

	private void modify(Scanner inputStr) throws SQLException {
		// 제목을 찾아서 내용을 수정한다.
		System.out.println("수정하려는 게시글의 제목을 입력하세요");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.modify(title, inputStr);
		System.out.println("---------------------끝---------------------");
		
	}// 게시글 수정 메서드 종료

	private void readOne(Scanner inputStr) throws SQLException {
		// 제목을 입력하면 내용이 보이도록 select 처리
		System.out.println("보고싶은 게시글의 제목을 입력하세요");
		System.out.print(">>> ");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("---------------------끝---------------------");	
	}// readOne 메서드 종료

	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		// 키보드로 입력한 데이터를 dto를 사용하여 데이터베이스에 insert하자
		BoardDTO boardDTO = new BoardDTO(); // 빈객체 생성
		System.out.print("작성자 : ");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine()); // 띄어쓰기가 있는 문장일때는 nextLine()
		
		boardDAO.insertBoard(boardDTO); // 위에서 만든 객체를 DAO에게 전달한다.
		System.out.println("------------insertBoard 메서드 종료------------");
	}// insertBoard 메서드 종료

	private void selectAll(BoardDAO boardDAO) throws SQLException {
		// DAO에게 전체보기 하는 서비스를 제공한다.
		System.out.println("--------------------------------------------");
		System.out.println("----------------mbc 게시판 목록----------------");
		boardDAO.selectAll();
		System.out.println("--------------------------------------------");	
	}// selectAll 메서드 종료
}
