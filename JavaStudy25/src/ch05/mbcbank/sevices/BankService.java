package ch05.mbcbank.sevices;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.DTO.HanaAccountDTO;

public class BankService { // ���� ������ CRUD �޼��� ���ַ� �����Ѵ�.
	// �ʵ�
	
	// ������
	
	// �޼���(�θ޴�, ���»���, �Ա�, ���, ����, ��ü ��...)
	public void menu(Scanner inputint, Scanner inputStr, HanaAccountDTO[] hanaBank) {
		// ��ü�޴��� �߰��Ϸ��� �ٸ� ���������� ��ε� ���� ��������
		boolean subRun = true;
		while(subRun) {
			System.out.println("-------------------------------");
			System.out.println("�ϳ����� ���� ���� �޴��Դϴ�.");
			System.out.println("1.���»��� | 2.���¸�� | 3.�Ա� | 4.��� | 5.��ü | 6.����");
			System.out.print("���Ͻô� �޴� ���� >>> ");
			String select = inputStr.next();
			switch(select) {
			case "1" : 
				System.out.println("===���� ���� �޴��Դϴ�.===");
				createAccount(inputStr, inputint, hanaBank);
				break;
			case "2" : 
				System.out.println("===���� ��� �޴��Դϴ�.===");
				accountLists(inputStr, inputint, hanaBank);
				break;
			case "3" : 
				System.out.println("===���� �Ա� �޴��Դϴ�.===");
				deposit(inputStr, inputint, hanaBank);
				break;
			case "4" : 
				System.out.println("===���� ��� �޴��Դϴ�.===");
				break;
			case "5" : 
				System.out.println("===���� ��ü �޴��Դϴ�.===");
				break;
			case "6" : 
				System.out.println("===�ϳ������� �����մϴ�.===");
				System.out.println();
				System.out.println("���θ޴��� ���ư��ϴ�.");
				subRun = false;
				break;
			default : 
				System.out.println("1~6������ �޴��� �����ϽǼ� �ֽ��ϴ�.");
				break;
			}// �ϳ����� switch�� ����
		}// �ϳ����� while�� ����
	}// �θ޴� �޼��� ����

	private void deposit(Scanner inputStr, Scanner inputint, HanaAccountDTO[] hanaBank) {
	// ���¹�ȣ�� �Է��ϰ� �Աݾ��� �Է��ϸ� ���¹�ȣ�� ã�Ƽ� �����ܾ��� ������Ų��.
		System.out.println("=======����=======");
		System.out.println("���¹�ȣ : ");
		String ano = inputStr.next();
		System.out.println("���ݾ� : ");
		int money = inputint.nextInt();
		HanaAccountDTO inputAccount = findAccount(ano, hanaBank);
		// findAccount �޼���� �迭���� ��ü�� ã���ְ� ��ü�� �������ش�.(�ݺ��ڵ� ������)
		if(inputAccount == null) {
			System.out.println("ã�� ���¹�ȣ�� �����ϴ�.");
			return;
		}
		inputAccount.setBalance(inputAccount.getBalance() + money); // ���¿��� ã�� �ݾ� + �Ӵϸ� �ٽ� set�� �ִ´�.
		// System.out.println("�Ա� �׽�Ʈ ��� : " + inputAccount);
		// toSting���� ��� ����
		System.out.println(inputAccount.getOwner() + "��, �Ա��� ���������� �Ϸ�Ǿ����ϴ�.");
		System.out.println("�ܾ� : " + inputAccount.getBalance() + "��");
		System.out.println("=====================================================");
	
	
	}// �Աݿ� �޼��� ����

	private HanaAccountDTO findAccount(String ano, HanaAccountDTO[] hanaBank) {
		// �Ա� ��� ��ü���� ���¹�ȣ�� �̿��� ��ü�� ã�� �ݺ��ڵ� �޼���
		HanaAccountDTO account = null; // ��ü ����
		for(int i = 0; i < hanaBank.length; i++) {
			if(hanaBank[i] != null) { // �ϳ����� �迭�� null�� �ƴ�
				String dbAno = hanaBank[i].getAno(); // �迭�� �ִ� ���� ��ȣ�� ������ dbano ������ ����.
				if(dbAno.equals(ano)) { // Ű����� �Էµ� ���� ano�� dbano�� �������� �� �� ã�´�.
					account = hanaBank[i]; // ��ü�� ã�� ��ü�� �ִ´�.
					break;
				}// ��ȣ ������ �Ǵ�if�� ����
			}// ��ü�� �ƴ��� �Ǵ� if�� ����
		}// �迭 �ݺ� for�� ����
		return account;
	}// ���� ã�� �޼��� ����

	private void accountLists(Scanner inputStr, Scanner inputint, HanaAccountDTO[] hanaBank) {
	// �ϳ������� ���¸� ��� ���� (�������)
	System.out.println("---�ϳ����� ���� ����Ʈ---");
	for(int i = 0; i < hanaBank.length; i++) {
		HanaAccountDTO accountLists = hanaBank[i]; // ��ü �ʿ� ���� �ִ°ɷ� �״�� ���
		if(accountLists != null) { // ��ü�� ����� �ʿ䰡 �����ϱ� if�� ���
			// �迭�� null�� �ƴϸ� ����� ����.
			System.out.print(accountLists.getAno());
			System.out.print("\t");
			
			System.out.print(accountLists.getOwner());
			System.out.print("\t");
			
			System.out.print(accountLists.getBalance());
			System.out.print("\t\n"); // \t -> ������ ���� \n -> ���� ȿ��
			System.out.println("------------------------------");
		}
	}
}// �ϳ����� ���� ��� �޼��� ����

	private void createAccount(Scanner inputStr, Scanner inputint, HanaAccountDTO[] hanaBank) {
		// �ϳ����� �迭�� ���ο� ��ü�� �ִ´�
		System.out.println("------------���� ����------------");
		// ������ ���� �ְų�, ��ü�� ���� �ְų�		
		HanaAccountDTO myAccount = new HanaAccountDTO(); // ��ü ����
		System.out.print("���¹�ȣ >>> ");
		myAccount.setAno(inputStr.next());
		
		System.out.print("������ >>> ");
		myAccount.setOwner(inputStr.next());
		
		System.out.print("�ʱ� �Աݾ� >>> ");
		myAccount.setBalance(inputint.nextInt()); // int�� ���� 21������� �Ա� ����
		
		myAccount.setBankname("�ϳ�"); // ���� Ű����� �Է¹��� �ʰ� �ٷ� ��ü�� �����͸� ����.
		// ��ü�� ����� ��ü�� �������� ���� �迭�� �ȳ���
		// �ϳ����� �迭�� ��ü�� �����ؾ��� (null���� Ȯ���ϰ� ����-> 0������ ���� ��ü ���� Ȯ���غ��� �־�ô�.)
		for(int i = 0; i < hanaBank.length; i++) {
			if(hanaBank[i] == null) { //�ϳ� ���� �迭�� null ���̸� ó���ϴ� �ڵ�
				hanaBank[i] = myAccount; // �迭�� �Է��� ��ü�� �����
				// toString���� �׽�Ʈ ����� ����.
				System.out.println("�����Է� �Ϸ� �׽�Ʈ : " + hanaBank[i]);
				break;
			}
			
		}//�ϳ����� �迭�� 0������ ���� �ݺ��ϴ� �ڵ�
		
		System.out.println("���°� ���������� �����Ǿ����ϴ�."); // �迭�� ��ü�� �ְ� ���� ���;���
		
}// ���� ���� �޼��� ����





}// �ϳ����� class����
