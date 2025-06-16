package ch05.mbcbank.sevices;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.DTO.HanaAccountDTO;

public class BankService { // 서비스 계층은 CRUD 메서드 위주로 생성한다.
	// 필드
	
	// 생성자
	
	// 메서드(부메뉴, 계좌생성, 입금, 출금, 삭제, 이체 등...)
	public void menu(Scanner inputint, Scanner inputStr, HanaAccountDTO[] hanaBank) {
		// 이체메뉴도 추가하려면 다른 은행으로의 통로도 만들어서 진행하자
		boolean subRun = true;
		while(subRun) {
			System.out.println("-------------------------------");
			System.out.println("하나은행 계좌 관리 메뉴입니다.");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.이체 | 6.종료");
			System.out.print("원하시는 메뉴 선택 >>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" : 
				System.out.println("===계좌 생성 메뉴입니다.===");
				createAccount(inputStr, inputint, hanaBank);
				break;
			case "2" : 
				System.out.println("===계좌 목록 메뉴입니다.===");
				accountLists(inputStr, inputint, hanaBank);
				break;
			case "3" : 
				System.out.println("===계좌 입금 메뉴입니다.===");
				deposit(inputStr, inputint, hanaBank);
				break;
			case "4" : 
				System.out.println("===계좌 출금 메뉴입니다.===");
				break;
			case "5" : 
				System.out.println("===계좌 이체 메뉴입니다.===");
				break;
			case "6" : 
				System.out.println("===하나은행을 종료합니다.===");
				System.out.println();
				System.out.println("메인메뉴로 돌아갑니다.");
				subRun = false;
				break;
			default : 
				System.out.println("1~6까지의 메뉴만 선택하실수 있습니다.");
				break;
			}// 하나은행 switch문 종료
		}// 하나은행 while문 종료
	}// 부메뉴 메서드 종료

	private void deposit(Scanner inputStr, Scanner inputint, HanaAccountDTO[] hanaBank) {
	// 계좌번호를 입력하고 입금액을 입력하면 계좌번호를 찾아서 계좌잔액을 증가시킨다.
		System.out.println("=======예금=======");
		System.out.println("계좌번호 : ");
		String ano = inputStr.next();
		System.out.println("예금액 : ");
		int money = inputint.nextInt();
		HanaAccountDTO inputAccount = findAccount(ano, hanaBank);
		// findAccount 메서드는 배열에서 객체를 찾아주고 객체를 리턴해준다.(반복코드 배제용)
		if(inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다.");
			return;
		}
		inputAccount.setBalance(inputAccount.getBalance() + money); // 계좌에서 찾은 금액 + 머니를 다시 set에 넣는다.
		// System.out.println("입금 테스트 결과 : " + inputAccount);
		// toSting으로 결과 보기
		System.out.println(inputAccount.getOwner() + "님, 입금이 성공적으로 완료되었습니다.");
		System.out.println("잔액 : " + inputAccount.getBalance() + "원");
		System.out.println("=====================================================");
	
	
	}// 입금용 메서드 종료

	private HanaAccountDTO findAccount(String ano, HanaAccountDTO[] hanaBank) {
		// 입금 출금 이체에서 계좌번호를 이용해 객체를 찾는 반복코드 메서드
		HanaAccountDTO account = null; // 빈객체 생성
		for(int i = 0; i < hanaBank.length; i++) {
			if(hanaBank[i] != null) { // 하나은행 배열이 null이 아님
				String dbAno = hanaBank[i].getAno(); // 배열에 있는 계좌 번호를 가져와 dbano 변수에 넣음.
				if(dbAno.equals(ano)) { // 키보드로 입력된 계좌 ano가 dbano와 동일한지 비교 및 찾는다.
					account = hanaBank[i]; // 빈객체에 찾은 객체를 넣는다.
					break;
				}// 번호 같은지 판단if문 종료
			}// 빈객체가 아닌지 판단 if문 종료
		}// 배열 반복 for문 종료
		return account;
	}// 계좌 찾기 메서드 종료

	private void accountLists(Scanner inputStr, Scanner inputint, HanaAccountDTO[] hanaBank) {
	// 하나은행의 계좌를 모두 본다 (은행원용)
	System.out.println("---하나은행 계좌 리스트---");
	for(int i = 0; i < hanaBank.length; i++) {
		HanaAccountDTO accountLists = hanaBank[i]; // 빈객체 필요 없이 있는걸로 그대로 사용
		if(accountLists != null) { // 빈객체는 출력할 필요가 없으니까 if문 사용
			// 배열에 null이 아니면 출력을 하자.
			System.out.print(accountLists.getAno());
			System.out.print("\t");
			
			System.out.print(accountLists.getOwner());
			System.out.print("\t");
			
			System.out.print(accountLists.getBalance());
			System.out.print("\t\n"); // \t -> 공백을 생성 \n -> 엔터 효과
			System.out.println("------------------------------");
		}
	}
}// 하나은행 계좌 목록 메서드 종료

	private void createAccount(Scanner inputStr, Scanner inputint, HanaAccountDTO[] hanaBank) {
		// 하나은행 배열에 새로운 객체를 넣는다
		System.out.println("------------계좌 생성------------");
		// 변수를 만들어서 넣거나, 객체를 만들어서 넣거나		
		HanaAccountDTO myAccount = new HanaAccountDTO(); // 빈객체 생성
		System.out.print("계좌번호 >>> ");
		myAccount.setAno(inputStr.next());
		
		System.out.print("계좌주 >>> ");
		myAccount.setOwner(inputStr.next());
		
		System.out.print("초기 입금액 >>> ");
		myAccount.setBalance(inputint.nextInt()); // int로 만들어서 21억까지만 입금 가능
		
		myAccount.setBankname("하나"); // 따로 키보드로 입력받지 않고 바로 객체에 데이터를 넣음.
		// 빈객체를 만들고 객체만 생성했음 아직 배열에 안넣음
		// 하나은행 배열에 객체를 삽입해야함 (null인지 확인하고 넣자-> 0번에서 부터 빈객체 인지 확인해보고 넣어봅시다.)
		for(int i = 0; i < hanaBank.length; i++) {
			if(hanaBank[i] == null) { //하나 은행 배열에 null 값이면 처리하는 코드
				hanaBank[i] = myAccount; // 배열에 입력한 객체가 연결됨
				// toString으로 테스트 결과가 보임.
				System.out.println("계좌입력 완료 테스트 : " + hanaBank[i]);
				break;
			}
			
		}//하나은행 배열을 0번에서 부터 반복하는 코드
		
		System.out.println("계좌가 정상적으로 생성되었습니다."); // 배열에 객체를 넣고 나서 나와야함
		
}// 계좌 생성 메서드 종료





}// 하나은행 class종료
