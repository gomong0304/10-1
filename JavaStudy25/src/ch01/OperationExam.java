package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// �����ڴ� ���α׷����� �����͸� ó���Ͽ� ����� ������
		// �����ڴ� +, -, *, /, % (4Ģ������ + ���������)
		// �ǿ����ڴ� ����, ���� ����
		
		// ���� ���� (������ 1���ΰ�)
		
		int x = 10 ;
		x++ ; // x = x + 1
		System.out.println("10�� ++ ���׿����� ��� : " + x) ;
		
		x-- ; // x = x - 1 ������ ���� x���� ������
		System.out.println("x�� -- ���׿����� ��� : " + x);
		
		
		// ���� ���� (������ 2���� ��)
		int y = 20 ;
		int result = x + y ;
		//    30     10  20
		
		
		System.out.println("x + y = " + result);
		
		
		
		// ���� ���� (���� 3���� ��)
		boolean result1 = (result>10) ? true : false ;
		//                    ����        ��      ����
		System.out.println("result>10 ��� : " + result1);
		
		
		String result2 = (result>50) ? "ũ��" : "�۴�" ; // ���ڷ� ������ �Ϸ��� String ���
		System.out.println("result>50 ��� : " + result2);
		
		
		int x1 = 10 * 10 ;   // ����
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ;    // ������ -> ���� ����
		System.out.println("10 / 3 = " + x2);
		int x3 = 10 % 3 ;    // ������ -> �������� ����
		System.out.println("10�� 3�� ���� ������ = " + x3);
		
		
		// �̼� -> 3�� �����ڸ� ����Ͽ� Ȧ¦ ����� �غ���. (���� �Ѱ�)
		int x4 = 2197 ; 
		int result4 = x4 % 2 ;
		String result5 = (result4 < 1) ? "¦��" : "Ȧ��" ;
		System.out.println(x4 + "�� ����� : " + result5 );
		
		
		// �̼� -> 3�� �����ڸ� ����Ͽ� Ȧ¦ ����� �غ���. (�������̶� �Ѱ�)
		int odd = 11 ;
		int div = odd % 2 ; // 11�� 2�� �������� �� �������� div�� ����
		String resultodd = (div == 1) ? "Ȧ��" : "¦��" ;
		System.out.println("11�� Ȧ¦ ��� ��� : " + resultodd);
		
		
		// �̼� -> 3�� �����ڸ� ����Ͽ� 4�� �����  ã�ƺ��� (���� �Ѱ�)
		int x5 =24;
		int result6 = x5 % 4 ; //x5�� 4�� ���������� �������� result6�� ����
		String result7 = (result6 == 0) ? "�½��ϴ�" : "�ƴմϴ�" ;
		System.out.println(x5 + "��(��) 4�� ����� " + result7);
		
		
		// �̼� -> 3�� �����ڸ� ����Ͽ� 4�� �����  ã�ƺ��� (�������̶� �Ѱ�)
		int multi4 = 24 ;
		int div4 = multi4 % 4 ; 
		String resultDiv4 = (div4 == 0) ? "4�� ����Դϴ�" : "4�� ����� �ƴմϴ�." ;
		System.out.println("4�� ��� �Ǵ� ��� : " + resultDiv4);
		
		
		// ���������� �׽�Ʈ
		System.out.println("-------���������� ��ġ�� ���� ���---------");
		int a = 10 ;
		a++ ; // a=a+1�� �ǹ� -> 11
		++a ; // 11+1 = 12
		System.out.println("10 -> a++ -> ++a�� ��� " + a);
		
		int b = 10 ;
		b-- ;
		--b ;
		System.out.println("10 -> b-- -> --b�� ��� " + b);
		
		int c ;
		c = a++ ; 
		// ������ ���� a���� 12�� c�� ���� a++ -> 12+1�� ���Ǽ� a���� ����
		//c = a ��� �Ŀ� a = a + 1�� �Ǿ���.
		// �������� �켱������ ���� ����� �Ǳ� �����̴�.
		System.out.println("a�� ��� : " + a); // 13
		System.out.println("c�� ��� : " + c); // 12
		System.out.println("----------------------------");
		
		c = ++a ;
		// ���� a = 13�̿����ϱ� c = a = a + 1
		System.out.println("a�� ��� : " + a); // 14
		System.out.println("c�� ��� : " + c); // 14
		System.out.println("----------------------------");
		
		
		c = ++a + b++ ;
		// ������ a = 14 �����ϱ� ++a = 15
		// ������ b = 8 �̿����ϱ� b++ = 9
		// c�� ���ʿ��� ���� ����� �Ǿ c = (1 + a) + (b = 8) + �̷���... -> ���⼭ �˼� �ִ°��� ++�� ��ġ�� ���� ���� ���Ѵٴ� ��
		System.out.println("a�� ��� : " + a); // 15
		System.out.println("b�� ��� : " + b); // 9
		System.out.println("c�� ��� : " + c); // 23
		System.out.println("----------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
