package ch04;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {
		// �̹Ű� ����� ��ü(�޷�)�� �����Ͽ�
		// ��¥�� ����غ���
		
		Week today = null;
	//	Ÿ��   ����  = ��;
		
	Calendar calendar = Calendar.getInstance();
	// Ÿ��      ����     =	      ��ü.�޼���
	// Ķ���� Ÿ���� ��ü�� ��������鼭 calendar ������ �����
	// Instance�� ��ü��¶� getInstance�� ��ü�� �����Ͷ�
	// 10-1 ��ǻ���� �ð��� �����´�.
	
	int year = calendar.get(Calendar.YEAR);
	// ����Ÿ���� year������ Ķ�������� ������ �������� �ִ´�.
	System.out.println("���� ������ : " + year);
	
	
	int month = calendar.get(Calendar.MONTH);
	System.out.println("���� ���� " + (month+1) + "�� �Դϴ�.");
	
	int day = calendar.get(Calendar.DATE);
	System.out.println("��¥ : " + day);
	
	int day2 = calendar.get(Calendar.DAY_OF_MONTH);
	System.out.println("������ ��¥ : " + day2 + "��");
	
	int week = calendar.get(Calendar.DAY_OF_WEEK);
	System.out.println("������ " + week + "�����Դϴ�");
	
	switch(week) {
	case 1 :
		today = Week.SUNDAY; break;
	case 2 :
		today = Week.MONDAY; break;
	case 3 :
		today = Week.TUESDAY; break;
	case 4 :
		today = Week.WEDNESDAY; break;
	case 5 :
		today = Week.THURSDAY; break;
	case 6 :
		today = Week.FRIDAY; break;
	case 7 :
		today = Week.SATURDAY; break;
	}// ����ġ�� ����
		
	}// main �޼���

}// class ����
