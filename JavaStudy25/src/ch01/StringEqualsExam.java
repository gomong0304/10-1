package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// 지금까지 배운 변수 타입은 기본타입으로 자바에서 객체 없이 사용됨
		// String도 원래 객체를 생성하고 만들어야 하지만 편의상 생략해서 사용
		
		String strval1 = "박희진" ;
		String strval2 = "박희진" ;
		String strval3 = new String("박희진") ; // 객체생성문구
		
		System.out.println(strval1 == strval2); // ture
		System.out.println(strval1 == strval3); // false
		// 기사라면 동일한 이름의 검이라도 두자루를 가지고 있는것과 같은 형식
		// 객체 타입은 주소를 보고있기 때문에 새로운 strval3를 만들어서 false가 나온다
		// 객체의 주소를 판단할 때는 == 을 사용함
		// 객체의 안쪽 값을 동등비교할 때는 내장된 메서드를 사용해야함
		// String은 객체이고 객체 안쪽에는 메서드들이 들어있다.
		// 메서드가 보고싶으면 .을 찍으면 보인다.
		
		boolean eq1 = strval1.equals(strval3);
		System.out.println("1과 3번의 equals메서드 사용 결과 : " + eq1);
		
		// 결론 String은 하나의 객체로 안에 동작이 포함되어있다.
		// String으로 비교를 할때는 == 보다는 equals 메서드를 사용하자
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
