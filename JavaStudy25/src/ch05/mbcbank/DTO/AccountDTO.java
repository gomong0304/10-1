package ch05.mbcbank.DTO;

public class AccountDTO { // 부모로 생성하면 자식객체들은 상속받아 필드, 생성자,메서드를 사용할수있다.
	// 개인필드
	protected String ano; // ano = 계좌번호
	protected String owner; // 계좌주 -> memberDTO로 연결해서 만들수도 있겠는걸? 나중에~ 응용해보자~
	protected String bankname; // 은행명
	protected int balance; // 잔고
	
	
	// -----------------------------
	// 생성자
	public AccountDTO(String ano, String owner, String bankname, int balance) {
		// super();
		// AccountDTO accountDTO(계좌번호, 계좌주, 금액, 은행명)
		this.ano = ano;
		this.owner = owner;
		this.bankname = bankname;
		this.balance = balance;
	}// 4개의 입력을 받는 생성자,모든 필드를 사용한 생성자
	
	// 기본생성자
	public AccountDTO() {
		// super(); // 상속은 오후에 배울꺼다. 주석달았음
		// Account accountDTO = new AccountDTO();
	}

	
	// -----------------------------
	// 메서드(게터와 세터를 이용하여 필드를 활용)
	// getter
	public String getAno() {
		// 계좌번호 출력시 변조를 담당
		return ano;
	}

	public String getOwner() {
		// 계좢 출력시 변조를 담당
		return owner;
	}

	public String getBankname() {
		// 은행명 출력시 변조를 담당
		return bankname;
	}

	public int getBalance() {
		// 잔고를 출력시 변조를 담당
		return balance;
	}
	
	// setter
	public void setAno(String ano) {
		// 계좌번호 입력시 검증 처리용
		this.ano = ano;
	}

	public void setOwner(String owner) {
		// 계좌주 입력시 검증 처리용
		this.owner = owner;
	}

	public void setBankname(String bankname) {
		// 은행명 입력시 검증 처리용
		this.bankname = bankname;
	}

	public void setBalance(int balance) {
		// 계좌금액 입력시 검증 처리용
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", bankname=" + bankname + ", balance=" + balance + "]";
	} // 테스트용으로 쓸때만 사용
	
	
}
