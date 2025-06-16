package ch05.mbcbank.DTO;

public class NhAccountDTO extends AccountDTO {
	// AccountDTO¸¦ ºÎ¸ð·ÎÇÏ´Â ÀÚ½Ä DTO
	
	public NhAccountDTO(String ano, String owner, String bankName, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.bankname = "³óÇù";
		// this.setBankname("³óÇù");
		this.balance = balance;
	}
}
