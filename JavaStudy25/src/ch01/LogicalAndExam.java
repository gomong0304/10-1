package ch01;

import java.util.Scanner; // �ܺ� ���̺귯��

public class LogicalAndExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ��
		// & ������ ��κ� ������ 2���̻��� ��� �Ǵ��ϴ� �뵵�� ����Ѵ�.
		// ���� ��� id�� pw�� �Ѵ� �¾ƾ� �α����� �����ϴ� ���!!
		// (������ �ִ� id ==Ű����� �Է��� id) & (������ �ִ� pw == Ű����� �Է��� pw)
		//            false                           false               = false
		//            true                            false               = false   
		//            false                           false               = false 
		//            true                            true                = true
		
		
		Scanner input = new Scanner(System.in) ; 
		// ��Ʈ��+Scanner Ŭ���ϸ� �ڵ带 �����ִ�.
		// Ű����� �Է��� �� �ִ� ��ü�� ������
		System.out.println("������ �Է��Ͻø� ��ҹ��ڳ� ���ڸ� �Ǵ��ص帱����!!");
		System.out.println("�����ڵ�ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.");
		System.out.print("���� �Է� >>> ");
		int charCode = input.nextInt(); // Ű����� �������� �ԷµǼ� ������ ��.
		
		
		// if(���Ǵܹ�){ �� �Ǵܹ��� true���� �� ����Ǵ� �� }
		// else { ���Ǵܹ��� false���� �� ����Ǵ� �� }
		if( (charCode >= 65 ) & ( charCode <= 90 ) ) {
		// �Էµ� ���� ���� 65 �̻��̰� 90 �����̸� �빮�ڷ� ���
		System.out.println( "���� �Էµ� ���ڴ� �빮�� �Դϴ�. : " + (char)charCode );
		} else if ( (charCode >= 97) && (charCode <= 122) ) { 
		  // ������ ����� if ���� false�� ��� �� �񱳸� �ϰ� ��.
		  // �Էµ� ���� ���� 97 �̻��̰� 122 ���ϸ� �ҹ���
		  // &�� �ι� ����ϸ� (&&) ���� ó���� �Ѵ�. -> �ڵ�Ʃ��
		  System.out.println( "���� �Էµ� ���ڴ� �ҹ��� �Դϴ�. : " + (char)charCode );
		  }	else if ( !(charCode < 48 ) && !(charCode > 57 ) ) {
			// NAND �����̴�. ��𸣰��ǹ�Ģ�� �ľ��ϸ� NOR�� �ȴ�.
			// 48���� ���� �ʰ� 57���� ũ�� ���� �񱳹�
			System.out.println( "���� �Էµ� ���ڴ� �����ڵ��� ���������� �Դϴ�. : " + (char)charCode);
		  	} else {
		  	  System.out.println("�빮��, �ҹ���, ������ �����ڵ� ǥ ���� ���� �Դϴ�.");
		  	  System.out.println("���α׷��� �ٽ� ������ �ּ���!!!");
		  	  } // ���� if�� ����
	} // main �޼��� ����
} // Class ����
