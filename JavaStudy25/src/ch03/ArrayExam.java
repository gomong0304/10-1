package ch03;

public class ArrayExam {

	public static void main(String[] args) {
		// 자바의 배열 연습해보기
		// 배열은 같은 타입에 표를 만드는 행위
		// String[] str1 = new String[30]; 30개의 문자열이 들어가는 표가 생성됨
		// 회원에 대한거 3개 성적에 대한거 3개
		// int[] int1 = new int[30]; 30개의 정수가 들어가는 표가 생성됨
		// 배열은 방번호를 인덱스라고 부르며 0번부터 시작한다.
		
		int[] scores = {83,90,87,100}; // s붙여서 여러개인걸 표시하자!, 객체가 생성되면서 값이 들어감
		/*System.out.println("첫번째 점수 출력용 : " + scores[0]);
		System.out.println("두번째 점수 출력용 : " + scores[1]);
		System.out.println("세번째 점수 출력용 : " + scores[2]);
		System.out.println("네번째 점수 출력용 : " + scores[3]);*/
		
		
		for(int i=0; i<scores.length; i++) {// 
			System.out.println("for문을 사용한 점수 출력 " + i + "번째 " + scores[i] + "점");
		}// for문 종료
		
		
		// 총점을 계산해보자
		int total=0; // 초기값 설정
		double avg=0.0; // 초기값 설정
		for(int i=0; i<scores.length; i++) {
			total=total+scores[i];		
		}// for문 종료
		System.out.println("총점 : " + total );
		System.out.println("학생수 : " + scores.length + " 명");
		System.out.println("평균 : " + (avg=(double)total/scores.length));
				
	}// mian 메서드 종료

}// class 종료
