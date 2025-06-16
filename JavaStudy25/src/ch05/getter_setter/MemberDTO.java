package ch05.getter_setter;

public class MemberDTO {
	// 필드 -> private로 생성해서 직접 접근이 안되서 getter setter를 사용하자, 받는건 setter 출력할때는 getter
	private String name;
	private int age;
	private boolean admin;

	
	// 생성자
	
	// 메서드 -> 공용 메서드를 통해서 값을 주고 받는다.
	// 이클립스 상단에 source메뉴 -> generate getter and setter를 이용해서 생성
	// 기본적으로 접근 제한자 -> public
	public String getName() {
		return name+"님";
	}
	public void setName(String name) {
		System.out.println("이름엔 숫자가 불가능합니다.");
		this.name = name;
	}
	public int getAge() {
		return age; // int 타입이라 뒤에 "세"를 붙일수없네..
	}
	public void setAge(int age) {
		System.out.println("나이에는 19세 이상만 가능합니다.");
		this.age = age;
	}
	public String isAdmin() { // boolean의 경우에만 is가 붙음
		String adminString = null;
		
		if (admin == true) {
			adminString = "관리자";
		}
		return adminString;
	}
	
	public void setAdmin(boolean admin) {
		System.out.println("관리자일 경우에는 true로 처리해주세요.");
		this.admin = admin;
	}
	
	
	
	
	
	
	
	
}
