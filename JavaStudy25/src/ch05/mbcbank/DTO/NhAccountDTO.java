package ch05.mbcbank.DTO;

public class NhAccountDTO extends AccountDTO {
	// AccountDTO�� �θ���ϴ� �ڽ� DTO
	
	public NhAccountDTO(String ano, String owner, String bankName, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.bankname = "����";
		// this.setBankname("����");
		this.balance = balance;
	}
}
