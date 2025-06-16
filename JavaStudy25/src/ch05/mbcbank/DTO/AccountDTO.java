package ch05.mbcbank.DTO;

public class AccountDTO { // �θ�� �����ϸ� �ڽİ�ü���� ��ӹ޾� �ʵ�, ������,�޼��带 ����Ҽ��ִ�.
	// �����ʵ�
	protected String ano; // ano = ���¹�ȣ
	protected String owner; // ������ -> memberDTO�� �����ؼ� ������� �ְڴ°�? ���߿�~ �����غ���~
	protected String bankname; // �����
	protected int balance; // �ܰ�
	
	
	// -----------------------------
	// ������
	public AccountDTO(String ano, String owner, String bankname, int balance) {
		// super();
		// AccountDTO accountDTO(���¹�ȣ, ������, �ݾ�, �����)
		this.ano = ano;
		this.owner = owner;
		this.bankname = bankname;
		this.balance = balance;
	}// 4���� �Է��� �޴� ������,��� �ʵ带 ����� ������
	
	// �⺻������
	public AccountDTO() {
		// super(); // ����� ���Ŀ� ��ﲨ��. �ּ��޾���
		// Account accountDTO = new AccountDTO();
	}

	
	// -----------------------------
	// �޼���(���Ϳ� ���͸� �̿��Ͽ� �ʵ带 Ȱ��)
	// getter
	public String getAno() {
		// ���¹�ȣ ��½� ������ ���
		return ano;
	}

	public String getOwner() {
		// ��� ��½� ������ ���
		return owner;
	}

	public String getBankname() {
		// ����� ��½� ������ ���
		return bankname;
	}

	public int getBalance() {
		// �ܰ� ��½� ������ ���
		return balance;
	}
	
	// setter
	public void setAno(String ano) {
		// ���¹�ȣ �Է½� ���� ó����
		this.ano = ano;
	}

	public void setOwner(String owner) {
		// ������ �Է½� ���� ó����
		this.owner = owner;
	}

	public void setBankname(String bankname) {
		// ����� �Է½� ���� ó����
		this.bankname = bankname;
	}

	public void setBalance(int balance) {
		// ���±ݾ� �Է½� ���� ó����
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", bankname=" + bankname + ", balance=" + balance + "]";
	} // �׽�Ʈ������ ������ ���
	
	
}
