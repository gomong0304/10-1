package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.DTO.HanaAccountDTO;
import ch05.mbcbank.DTO.NhAccountDTO;
import ch05.mbcbank.DTO.WoriAccountDTO;
import ch05.mbcbank.sevices.BankService;
import ch05.mbcbank.sevices.HanaBankService;
import ch05.mbcbank.sevices.NhBankService;
import ch05.mbcbank.sevices.WoriBankService;

public class BankExam {
	// �ʵ�
	public static HanaAccountDTO[] hanaBank = new HanaAccountDTO[10]; // ��ü ���޿�~
	public static WoriAccountDTO[] woriBank = new WoriAccountDTO[10];
	public static NhAccountDTO[] nhBank = new NhAccountDTO[10];
	public static AccountDTO session = null; // �α��������� �����ϴ� ��ü ����		
	public static Scanner inputint = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	// ������ -> ���� �� ��� (main�޼��� �ʱ�ȭ ��)
	static {
		HanaAccountDTO accountDTO0 = new HanaAccountDTO("1234", "������", "�ϳ�", 300000000);
		hanaBank[0] = accountDTO0;
		
		WoriAccountDTO accountDTO1 = new WoriAccountDTO("5678", "������", "�츮", 300000000);
		woriBank[0] = accountDTO1;
	
		NhAccountDTO accountDTO2 = new NhAccountDTO("9876", "�����", "����", 30000000);
		nhBank[0] = accountDTO2;
	}
	
	// �޼���
	public static void main(String[] args) {
		// ���� 3���� ����� ���� �����ϴ� ���α׷���
		// �׽�Ʈ �ڵ� �ۼ�
		// �⺻�� �Է� ���̵����� ��¿� �ڵ� -> DTO class�� ���� soure -> toStingȰ��ȭ �ϸ� �ּ� -> ��ü�� ��ȯ�ؼ� ���°� �����ִ�.
		/*
		 * System.out.println("�ϳ����� ���̵����� ��� ����Ʈ : " + hanaBank[0]);
		 * System.out.println("�츮���� ���̵����� ��� ����Ʈ : " + woriBank[0]);
		 * System.out.println("�������� ���̵����� ��� ����Ʈ : " + nhBank[0]);
		 */
		
		boolean run = true; // �ָ޴� �ݺ���
		while(run) {
			System.out.println("===========================");
			System.out.println("MBC ���νý��ۿ� ���Ű��� ȯ���մϴ�.");
			System.out.println("===========================");
			System.out.println("1.�ϳ�����");
			System.out.println("2.�츮����");
			System.out.println("3.��������");
			System.out.println("4.���α׷� ����");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" : 
				System.out.println("�ϳ��������� �����մϴ�.");
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputint, inputStr, hanaBank);
				break;
			case "2" : 
				System.out.println("�츮�������� �����մϴ�.");
				WoriBankService woriBankService = new WoriBankService();
				woriBankService.menu(inputint, inputStr, hanaBank);
				break;
			case "3" : 
				System.out.println("������������ �����մϴ�.");
				NhBankService nhBankService = new NhBankService();
				nhBankService.menu(inputint, inputStr, hanaBank);
				break;
			case "4" : 
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			default : 
				System.out.println("1~4������ �޴��� �������ּ���");
				break;
			}// �ָ޴� ���� switch�� ����
		}// �ָ޴� while�� ����
		
	}// main �޼��� ����
	
}// class ����
