package ch05.mbcbank.DTO;

public class WoriAccountDTO extends AccountDTO {
	// AccountDTO�� �θ���ϴ� �ڽ� DTO
	
	public WoriAccountDTO(String ano, String owner, String bankName, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.bankname = "�츮";
		// this.setBankname("�츮");
		this.balance = balance;
	}
}
