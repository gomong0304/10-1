package ch03;

public class ArrayMaxMinExam {

	public static void main(String[] args) {
		// 배열에 있는 성적을 for문을 사용하여 최대값과 최소값을 알아 내보자
		
		int[] scores = {78, 90, 40, 33, 45, 75, 60};
		//              0   1   2   3   4   5   6 인덱스
		// scores 배열을 만들고 값을 7개 넣어 놓는다
		
		int max = 0; // 최대값을 지정하는 변수
		int min = 101; // 최소값을 지정하는 변수
		
		for(int i = 0; i < scores.length; i++) {
		//     0번 인덱스부터 배열의 길이까지 1씩 증가용 for문
			
			// 최대값과 최소값을 판단해야한다.
			if(scores[i] > max) {
			// 배열에 있는 값이 변수 max보다 큰가??? true면
				max = scores[i]; // 배열에 있는 값을 max 변수에 넣음
			} else if(scores[i] < min) {
				min = scores[i];
			}// if문 종료-> 최대값 최소값 비교뮨 종료
			
		}// for문 종료
		
		System.out.println("배열 scores에서 찾은 최대값 : " + max);
		System.out.println("배열 scores에서 찾은 최소값 : " + min);
		

	}// main 메서드 종료

}// class 종료
