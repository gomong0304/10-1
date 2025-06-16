package ch04.marioKart.dto;

public class MemberDTO {
	// 필드
	public String id; // 아이디(로그인용)
	public String pw; // 암호(로그인용)
	public String nickname; // 별명(게임용)
	public String email; // 암호 찾기용
	
	public CharacterDTO characterDTO; // 계정별 캐릭터 객체
	
	
	// 기본 생성자
	public MemberDTO() {
		
	}// 기본 생성자 종료
	// 사용자가 만든 생성자
	public MemberDTO(String id, String pw, String nickname, 
			String email, CharacterDTO characterDTO){
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.email = email;
		this.characterDTO = characterDTO;
	}
	
	//메서드

}
