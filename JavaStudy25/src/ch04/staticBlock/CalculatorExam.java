package ch04.staticBlock;

public class CalculatorExam {

	public static void main(String[] args) {
		// �����ʵ�� �����޼��带 ����غ���.
		// Calculator myCalc = new Calculator(); // ��ü�� �����Ͽ� ���� -> ���� �Ẹ��.
		// �ǵ����̸� new�� �������.
		// ���� ���ϼ����ִ�.

		System.out.println("���� ������ ���̰� : " + Calculator.pi);
		double result1 = 10 * 10 * Calculator.pi ;
		System.out.println("���� �ʵ�� ���� ��� ��� : " + result1);
		int result2 = Calculator.plus(10, 20);
		System.out.println("���� �޼���� �÷��� ��� ��� : " + result2);
		int result3 = Calculator.minus(50, 30);
		System.out.println("���� �޼���� ���̳ʽ� ��� ��� : " + result3);
		
		System.out.println("a����ڰ� ���⸦ �̿��ؼ� ���� ����Ѵ�.");
		Calculator.result = 10+50;
		System.out.println("���� ��� �� : " + Calculator.result);
		System.out.println("b����ڰ� ���⸦ �����޶�� �Ѵ�.");
		Calculator.result = 100+500;
		System.out.println("a����ڰ� ���� ����ߴ� 10+50���� 100�� ���ߴ�.");
		Calculator.result = Calculator.result+100;
		System.out.println("���� ����� : " + Calculator.result);
	}// main �޼��� ����

}// class ����
