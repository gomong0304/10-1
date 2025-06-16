package ch03;

public class ArraySortExam {

	public static void main(String[] args) {
		// 배열에 있는 값을 정렬하여 출력해보자
		// 오름차순 정렬 : 큰값이 뒤에 (육상경기...)
		// 내림차순 정렬 : 작은값이 뒤에 (성적, 게시판...)
		// 배열에 있는 값을 좌우로 변경하기 위해서는 임시방(temp)이 필요
		// 오름차순!!
		
		int[] scores = {79, 75, 26, 89, 91, 50, 100};
		//               0   1   2   3   4   5   6
		System.out.println("=======정렬 전 배열 값========");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}// for문 종료
		
		System.out.println();
		System.out.println("=======정렬 후 배열 값========");
		
		for(int j = 0 ; j < scores.length-1 ; j++) {
			// 0 ~ 7-1까지 반복하는 문 (앞자리 용임)
			
			for(int k = 0 ;k < scores.length-1-j ; k++) {
				// 0 ~ 7-1-0 -> 0 ~ 6
				// 0 ~ 7-1-1 -> 0 ~ 5
				// 0 ~ 7-1-2 -> 0 ~ 4
				// 0 ~ 7-1-3 -> 0 ~ 3
				// 결론 : 뒷자리 비교 금지 코드 (큰값 완성)
				// j값과 k값을 비교하여 j 값이 크면 자리 바꾸자
				
				if(scores[k] > scores[k+1]) {
					// 앞에 있는 값이 뒤에 있는 값보다 크면
					// 자리를 바꾼다.
					int temp = scores[k]; // 큰값을 임시방에 넣음
					scores[k] = scores[k+1]; // 작은값을 앞에 넣음
					scores[k+1] = temp; // 임시방의 큰값을 뒷방에 넣음
					// 자리 변경 완료
				}// 큰값 비교용 if문 종료
				
				// 검증용 코드
				System.out.println("검증 중.....");
				for(int i=0 ; i < scores.length; i++ ) {
					System.out.print(scores[i] + " ");
				}// 검증용 for문 종료
				
			}// 뒷자리용 for문 종료
		}// 앞자리용 for문 종료
		
	}// main 메서드 종료

}// class 종료
