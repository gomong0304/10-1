package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// ���� Ÿ�� ��ȯ(Casting)
		// ū ũ���� Ÿ���� ���� ũ���� Ÿ������ �ڵ���ȯ �� �� ����.
		// int(21��) -> byte Ÿ������ ������ ������ �߻��Ѵ�.
		// �̰��� ������ �߻��ص� ������ �����ϴ� ���� ���� Ÿ�� ��ȯ�̶�� �Ѵ�.
		
		int intValue = 123456789 ;
		byte byteValue = (byte)intValue ; // ������ byte Ÿ������ ��ȯ (��ȣ�ȿ� Ÿ�� ������ ���� ��ȯ)
		//Type mismatch: cannot convert from int to byte
		
		System.out.println("int Ÿ�� �� ��� : " + intValue);
		System.out.println("byte Ÿ�� �� ��� : " + byteValue); // 2�������� �߶����->����� 10�������� ���
		// byte Ÿ���� 8bit�� ����� �տ� ���� ����������.
		//10���� 123456789�� 2�������� ������ 111010110111100110100010101 �ε�
		//111 0101 1011 1100 1101 0001 0101 
		//(          ����      ) 0001 0101 -> 10�������� 21��
		
		
		int kor = 100 ;
		int eng = 99 ; 
		int mat = 97 ;
		
		int total = kor + eng + mat ;
		System.out.println("==============����ǥ==============");
		System.out.println("���� + ���� + ���� = ���� : " + total);
		
		double avg = total / 3 ; // �ڵ�Ÿ�� ��ȯ ��
		System.out.println("��� ����(�ڵ�Ÿ�Ժ�ȯ) : " + avg);
		// ���� �߻� : � ���� ����ص� �Ҽ����� 0���� ����
		// ���� : intŸ�� total�� 3���� ������
		// �����ذ� : double Ÿ������ ���� Ÿ�� ��ȯ �Ŀ� 3���� ��������
		
		avg = (double)total / 3 ; //����Ÿ�� ��ȯ ��.
		System.out.println("��� ����(����Ÿ�Ժ�ȯ) : " + avg);
		//int�� 32bit double�� 64bit �ڵ�Ÿ�� ��ȯ ��
		//(double)�� �־ ���������� Ÿ�Ժ�ȯ�� �ؼ� �Ҽ����� ���ü��ְ� �غ���
		
	}

}
