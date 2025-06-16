package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.DTO.HanaAccountDTO;
import ch05.mbcbank.DTO.NhAccountDTO;
import ch05.mbcbank.DTO.WoriAccountDTO;
import ch05.mbcbank.sevices.BankService;
import ch05.mbcbank.sevices.HanaBankService;
import ch05.mbcbank.sevices.NhBankService;
import ch05.mbcbank.sevices.WoriBankService;

public class BankExam {
	// 필드
	public static HanaAccountDTO[] hanaBank = new HanaAccountDTO[10]; // 객체 전달용~
	public static WoriAccountDTO[] woriBank = new WoriAccountDTO[10];
	public static NhAccountDTO[] nhBank = new NhAccountDTO[10];
	public static AccountDTO session = null; // 로그인했으면 저장하는 객체 생성		
	public static Scanner inputint = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	// 생성자 -> 정적 블럭 사용 (main메서드 초기화 값)
	static {
		HanaAccountDTO accountDTO0 = new HanaAccountDTO("1234", "박희진", "하나", 300000000);
		hanaBank[0] = accountDTO0;
		
		WoriAccountDTO accountDTO1 = new WoriAccountDTO("5678", "지선우", "우리", 300000000);
		woriBank[0] = accountDTO1;
	
		NhAccountDTO accountDTO2 = new NhAccountDTO("9876", "김시찬", "농협", 30000000);
		nhBank[0] = accountDTO2;
	}
	
	// 메서드
	public static void main(String[] args) {
		// 은행 3개를 만들어 계좌 관리하는 프로그래밍
		// 테스트 코드 작성
		// 기본값 입력 더미데이터 출력용 코드 -> DTO class로 가서 soure -> toSting활성화 하면 주소 -> 객체로 변환해서 나온걸 볼수있다.
		/*
		 * System.out.println("하나은행 더미데이터 출력 데스트 : " + hanaBank[0]);
		 * System.out.println("우리은행 더미데이터 출력 데스트 : " + woriBank[0]);
		 * System.out.println("농협은행 더미데이터 출력 데스트 : " + nhBank[0]);
		 */
		
		boolean run = true; // 주메뉴 반복용
		while(run) {
			System.out.println("===========================");
			System.out.println("MBC 코인시스템에 오신것을 환영합니다.");
			System.out.println("===========================");
			System.out.println("1.하나은행");
			System.out.println("2.우리은행");
			System.out.println("3.농협은행");
			System.out.println("4.프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" : 
				System.out.println("하나은행으로 진입합니다.");
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputint, inputStr, hanaBank);
				break;
			case "2" : 
				System.out.println("우리은행으로 진입합니다.");
				WoriBankService woriBankService = new WoriBankService();
				woriBankService.menu(inputint, inputStr, hanaBank);
				break;
			case "3" : 
				System.out.println("농협은행으로 진입합니다.");
				NhBankService nhBankService = new NhBankService();
				nhBankService.menu(inputint, inputStr, hanaBank);
				break;
			case "4" : 
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default : 
				System.out.println("1~4까지의 메뉴만 선택해주세요");
				break;
			}// 주메뉴 선택 switch문 종료
		}// 주메뉴 while문 종료
		
	}// main 메서드 종료
	
}// class 종료
