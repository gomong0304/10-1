package ch05.mbcbank.DTO;

public class HanaAccountDTO extends AccountDTO {
	// AccountDTO�� �θ���ϴ� �ڽ� DTO
	
	// ������
	public HanaAccountDTO(String ano, String owner, String bankName, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.bankname = "�ϳ�";
		// this.setBankname("�ϳ�");
		this.balance = balance;
	
	}

	public HanaAccountDTO() {
		// �⺻������
	}
	
}
