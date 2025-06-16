package ch05.mbcbank.DTO;

public class WoriAccountDTO extends AccountDTO {
	// AccountDTO를 부모로하는 자식 DTO
	
	public WoriAccountDTO(String ano, String owner, String bankName, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.bankname = "우리";
		// this.setBankname("우리");
		this.balance = balance;
	}
}
