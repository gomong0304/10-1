package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for���� �ݺ������� �ʱ�ȭ��, ���ǽ�, ���������� �����.
		// for(int i=0 ; i<10 ; i++){�ݺ����๮;}
		// i�� 0���� 10�������� 1�� �ݺ��ϴ� ���๮!
		// for������ ����ϴ� i �ʱⰪ�� for{} ��ȣ�� ������ �������.
		
		Scanner inputInt = new Scanner(System.in);
		System.out.println("Ȯ���� max ���� �Է��ϼ���."); //Ű����� �Է��� �������� max������ ����
		System.out.print("���� �Է� >>> ");
		int max = inputInt.nextInt();
		
		System.out.println("Ȯ���� min ���� �Է��ϼ���."); //Ű����� �Է��� �������� min������ ����
		System.out.print("���� �Է� >>> "); 
		int min = inputInt.nextInt();
		
		System.out.println("Ȯ���� �������� �Է��ϼ���."); 
		System.out.print("���� �Է� >>> "); 
		int add = inputInt.nextInt();
		
		System.out.println(min + " ~ " + max+ "����" + add +" �������� ����غ���.");
		int total = 0;
		//for���� ���������� total = total+1; �� 100�� �ݺ��߾������

		for (total = min; total <= max; total += add) {
		//                              -> total = total + add �� ���� �ǹ�
		System.out.println("��� �׽�Ʈ : " + total);
		} // for�� ����

	}// main �޼ҵ� ����
}// Class����
