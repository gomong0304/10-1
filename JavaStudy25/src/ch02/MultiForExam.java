package ch02;

public class MultiForExam {

	public static void main(String[] args) {
		// for문 안쪽에 또다른 for문을 넣어 테스트 해보자.
		
		// 9x9단을 만들어 본다.
		// 처음 2x1=2 ~ 2x9=18
		// 끝 9x1=9 ~9x9=81
		
		// 앞단에 for문 구현
		for(int m=2; m<= 9; m++) { // 2~9까지 1씩 증가한다
			System.out.println(); // 엔터 효과가 난다
			System.out.println("==========="+ m + "단==========");
			
			//뒷단의 for문 구현
				for(int n=1; n<=9; n++) { // 1~9까지 1씩 증가
					System.out.print(" " +  m + "X" + n + "=" + (m*n) + " ");
				}			
		}
	}// main메소드 종료
}// class종료
