package ch05.mbcbank.DTO;

public class HanaAccountDTO extends AccountDTO {
	// AccountDTO를 부모로하는 자식 DTO
	
	// 생성자
	public HanaAccountDTO(String ano, String owner, String bankName, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.bankname = "하나";
		// this.setBankname("하나");
		this.balance = balance;
	
	}

	public HanaAccountDTO() {
		// 기본생성자
	}
	
}
