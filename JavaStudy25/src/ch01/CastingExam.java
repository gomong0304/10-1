package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// 강제 타입 변환(Casting)
		// 큰 크기의 타입은 작은 크기의 타입으로 자동변환 할 수 없다.
		// int(21억) -> byte 타입으로 담으면 누수가 발생한다.
		// 이것을 누수가 발생해도 강제로 적용하는 법을 강제 타입 변환이라고 한다.
		
		int intValue = 123456789 ;
		byte byteValue = (byte)intValue ; // 강제로 byte 타입으로 변환 (괄호안에 타입 넣으면 강제 변환)
		//Type mismatch: cannot convert from int to byte
		
		System.out.println("int 타입 값 출력 : " + intValue);
		System.out.println("byte 타입 값 출력 : " + byteValue); // 2진법으로 잘라버림->출력은 10진법으로 출력
		// byte 타입의 8bit를 만들고 앞에 값을 날려버린다.
		//10진법 123456789가 2진법으로 했을때 111010110111100110100010101 인데
		//111 0101 1011 1100 1101 0001 0101 
		//(          날라감      ) 0001 0101 -> 10진법으로 21임
		
		
		int kor = 100 ;
		int eng = 99 ; 
		int mat = 97 ;
		
		int total = kor + eng + mat ;
		System.out.println("==============성적표==============");
		System.out.println("국어 + 영어 + 수학 = 총점 : " + total);
		
		double avg = total / 3 ; // 자동타입 변환 됨
		System.out.println("평균 점수(자동타입변환) : " + avg);
		// 문제 발생 : 어떤 값을 계산해도 소수점이 0으로 나옴
		// 이유 : int타입 total이 3으로 나눠짐
		// 문제해결 : double 타입으로 강제 타입 변환 후에 3으로 나눠야함
		
		avg = (double)total / 3 ; //강제타입 변환 함.
		System.out.println("평균 점수(강제타입변환) : " + avg);
		//int는 32bit double은 64bit 자동타입 변환 됨
		//(double)을 넣어서 나누기전에 타입변환을 해서 소수점이 나올수있게 해보기
		
	}

}
