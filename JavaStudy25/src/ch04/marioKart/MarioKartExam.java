package ch04.marioKart;

import java.util.Scanner;

import ch04.marioKart.dto.CartDTO;
import ch04.marioKart.dto.CharacterDTO;
import ch04.marioKart.dto.GliderDTO;
import ch04.marioKart.dto.ItemDTO;
import ch04.marioKart.dto.MemberDTO;
import ch04.marioKart.dto.TireDTO;
import ch04.marioKart.service.MemberService;

public class MarioKartExam {
	// 필드 -> main()메서드가 있는 필드는 static 용으로 만듬
	// DTO -> 필드명만, 값만 가지고 있음!
	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[10];          // 10명의 회원
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15]; // 캐릭터 15개 생성
	public static CartDTO[] cartDTOs = new CartDTO[8];                 // 카드 자동차 8개 배열
	public static GliderDTO[] gliderDTOs = new GliderDTO[10];          // 글라이더 배열
	public static TireDTO[] tireDTOs = new TireDTO[10];                // 타이어 배열
	public static ItemDTO[] itemDTOs = new ItemDTO[10];                // 아이템 배열

	public static MemberDTO LoginState; 
	// 세션과 같은 기능
	// 로그인 성공시 객체를 가지고 있는 용도

	// 생성자 -> new MarioKartExam()로 객체를 생성하지 않는다.
	// static{ } 스태틱블럭을 사용한다. 초기화용
	static {
		// 미리 정의된 회원(미리 회원 가입된 회원)
		// MemberDTO memberDTO0 = new MemberDTO(); // 기본 생성자로 넣으면 코드가 많아질꺼야
		MemberDTO memberDTO0 = new MemberDTO("phj", "1234", "콧고몽", "phj6765@naver.com", characterDTOs[0]);
		MemberDTO memberDTO1 = new MemberDTO("jsw", "5678", "돔도빗", "jsw2175@naver.com", characterDTOs[1]);
		MemberDTO memberDTO2 = new MemberDTO("ksc", "9000", "김처비", "ksc1009@naver.com", characterDTOs[2]);
		
		memberDTOs[0] = memberDTO0;
		memberDTOs[1] = memberDTO1;
		memberDTOs[2] = memberDTO2;
		
		
		// 미리 정의된 캐릭터
		CharacterDTO characterDTO0 = new CharacterDTO("마리오", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지", 3.1, 4.4, 3.8, 4.0, 3.9);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오", 3.2, 4.3, 3.9, 3.9, 4.0);
		CharacterDTO characterDTO3 = new CharacterDTO("데이지", 3.3, 4.2, 4.0, 3.8, 4.1);
		// 객체 생성완료

		// 객체를 배열에 넣어서 관리
		characterDTOs[0] = characterDTO0;
		characterDTOs[1] = characterDTO1;
		characterDTOs[2] = characterDTO2;
		characterDTOs[3] = characterDTO3;

	}// 스태틱 블록 종료 (main 메서드 실행시 초기화 값)

	// 정적 메서드
	public static void main(String[] args) {
		// MVC 패턴을 이용해서 마리오 카트 프로그램 제작
		// DTO : 객체용 (Data Transfer Object)
		// service :  부메뉴용 crud
		// main() : 컨트롤러용 (주메뉴, 분기담당)
		
		System.out.println("========마리오 카트 게임을 시작합니다.========");
		
		boolean run = true ; // 처음 구동
		while(run){
		System.out.println("1. 회원관리 | 2. 카트관리 | 3. 게임실행 | 4. 종료");
		System.out.print(">>>");
		String select = input.next(); // 숫자가 아닌경우 오류 발생함.(차후처리) -> 문자처리하는걸로 하자.

		switch(select){
		case "1" :
			System.out.println("회원관리 클래스로 진입합니다."); 
			// 이제 객체가 왔다갔다한다. MemberDTO 근데 서비스에서 진행할 예정
			MemberService memberservice = new MemberService();
			LoginState = memberservice.menu(input, memberDTOs, LoginState);
			// 메뉴의 입력값은 스캐너 객체, 회원 배열, 로그인상태 객체를 받는거고
			// 리턴은 로그인상태 객체(MemberDTO)를 받는다.
			System.out.println("현재 로그인한 회원 이름은 : " + LoginState.nickname);
			break;
		
		case "2" :
			System.out.println("카트관리 클래스로 진입합니다.");
			break;
		
		case "3" :
			System.out.println("게임실행 클래스로 진입합니다.");
			break;
		
		case "4" :
			System.out.println("게임종료를 진행합니다.");
			run = false ; // while문 종료됨
			break;
		
		default :
			System.out.println("1~4번 숫자만 입력 하세요");
			// break; 
			
		} // switch문 종료
		}// while문 종료
	
	}// main 메서드 종료

}
// class 종료
