package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		// 문자열 연결 테스트
		// print( "테스트" + "입니다.") -> +가 연결 연산자임
		// 피연산자 중 한쪽이 문자열이면 + 연산자는 문자열 연결로 반응합
		
		String str1 = "JDK" + 17.0 ;
		System.out.println(str1) ;
		
		String str2 = str1 + "특징" ;
		System.out.println(str2);
		
		String str3 = "jdk" + 3 + 3.0 ;
		System.out.println(str3);
		
		String str4 = 3 + 3.0 + "jdk" ; 
		System.out.println(str4);
		//코드의 흐름은 위에서 아래로 앞에서 뒤로 감
		// 3+3.0이 먼저 계산이 된 후에 문자열과 결합을 함.
		
		
		
		
		
		
		
		
		

	}

}
