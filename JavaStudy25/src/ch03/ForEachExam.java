package ch03;

public class ForEachExam {

	public static void main(String[] args) {
		// for each문은 향상된 for문으로 배열에 인덱스를 사용하지 않는다.
		// 방법 : for(타입 변수 : 배열명) {
		//       실행문1;
		//       }
		// foreach문은 R(전체)용, 전체 리스트 출력용으로 씀
		
		int[] scores = {91, 95, 87, 93, 88};
		
		for(int i : scores) {
			System.out.println(i + " ");
		}
		
		
		String[] names = {"김진우", "김보령", "전민기", "전혜진", " 배혜민", "이하늘"};
		
		for(String i : names) {
			System.out.println("names 배열의 전민기씨가 출석했습니까??");
			if("전민기".equals(i)) {
				System.out.println("전민기씨 출근 완료");
			}
		}
		
	}

}
