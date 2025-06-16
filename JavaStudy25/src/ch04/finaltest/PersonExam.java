package ch04.finaltest;

public class PersonExam {

	public static void main(String[] args) {
		// 필드에 final을 붙인 객체를 사용해보자.
		Person person = new Person("123456-1234567", "박희진");
		// 사용자 지정 생서자를 통해서 밀어넣음.
		
		System.out.println("국가명 : " + person.nation);
		System.out.println("주민번호 : " + person.ssn);
		System.out.println("성명 : " + person.name);
		
		// person.nation = "USA"; // final을 붙여서 안바뀜
		// person.ssn = "98765-123456"; // final을 붙여서 안바뀜
		person.name = "콧고몽";
		
	}

}
