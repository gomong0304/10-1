package ch02;

public class RandomExam {

	public static void main(String[] args) {
		// ������ ���� ���ڷ� Math��� Ŭ���� ���ʿ� random()�޼��带 Ȱ���Ѵ�.
		// �� �޼���� �ʸ� us(����ũ�μ�����) ������ ������ �־� ����Ѵ�.
		
		double  random = Math.random()*6 + 1;
		System.out.println(random);
		
		int num = (int)random;
		System.out.println(num);
				
	}

}
