package ch04.marioKart.dto;

public class MemberDTO {
	// �ʵ�
	public String id; // ���̵�(�α��ο�)
	public String pw; // ��ȣ(�α��ο�)
	public String nickname; // ����(���ӿ�)
	public String email; // ��ȣ ã���
	
	public CharacterDTO characterDTO; // ������ ĳ���� ��ü
	
	
	// �⺻ ������
	public MemberDTO() {
		
	}// �⺻ ������ ����
	// ����ڰ� ���� ������
	public MemberDTO(String id, String pw, String nickname, 
			String email, CharacterDTO characterDTO){
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.email = email;
		this.characterDTO = characterDTO;
	}
	
	//�޼���

}
