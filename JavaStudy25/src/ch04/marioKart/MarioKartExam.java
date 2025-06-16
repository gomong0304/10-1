package ch04.marioKart;

import java.util.Scanner;

import ch04.marioKart.dto.CartDTO;
import ch04.marioKart.dto.CharacterDTO;
import ch04.marioKart.dto.GliderDTO;
import ch04.marioKart.dto.ItemDTO;
import ch04.marioKart.dto.MemberDTO;
import ch04.marioKart.dto.TireDTO;
import ch04.marioKart.service.MemberService;

public class MarioKartExam {
	// �ʵ� -> main()�޼��尡 �ִ� �ʵ�� static ������ ����
	// DTO -> �ʵ��, ���� ������ ����!
	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[10];          // 10���� ȸ��
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15]; // ĳ���� 15�� ����
	public static CartDTO[] cartDTOs = new CartDTO[8];                 // ī�� �ڵ��� 8�� �迭
	public static GliderDTO[] gliderDTOs = new GliderDTO[10];          // �۶��̴� �迭
	public static TireDTO[] tireDTOs = new TireDTO[10];                // Ÿ�̾� �迭
	public static ItemDTO[] itemDTOs = new ItemDTO[10];                // ������ �迭

	public static MemberDTO LoginState; 
	// ���ǰ� ���� ���
	// �α��� ������ ��ü�� ������ �ִ� �뵵

	// ������ -> new MarioKartExam()�� ��ü�� �������� �ʴ´�.
	// static{ } ����ƽ���� ����Ѵ�. �ʱ�ȭ��
	static {
		// �̸� ���ǵ� ȸ��(�̸� ȸ�� ���Ե� ȸ��)
		// MemberDTO memberDTO0 = new MemberDTO(); // �⺻ �����ڷ� ������ �ڵ尡 ����������
		MemberDTO memberDTO0 = new MemberDTO("phj", "1234", "����", "phj6765@naver.com", characterDTOs[0]);
		MemberDTO memberDTO1 = new MemberDTO("jsw", "5678", "������", "jsw2175@naver.com", characterDTOs[1]);
		MemberDTO memberDTO2 = new MemberDTO("ksc", "9000", "��ó��", "ksc1009@naver.com", characterDTOs[2]);
		
		memberDTOs[0] = memberDTO0;
		memberDTOs[1] = memberDTO1;
		memberDTOs[2] = memberDTO2;
		
		
		// �̸� ���ǵ� ĳ����
		CharacterDTO characterDTO0 = new CharacterDTO("������", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("������", 3.1, 4.4, 3.8, 4.0, 3.9);
		CharacterDTO characterDTO2 = new CharacterDTO("�͸���", 3.2, 4.3, 3.9, 3.9, 4.0);
		CharacterDTO characterDTO3 = new CharacterDTO("������", 3.3, 4.2, 4.0, 3.8, 4.1);
		// ��ü �����Ϸ�

		// ��ü�� �迭�� �־ ����
		characterDTOs[0] = characterDTO0;
		characterDTOs[1] = characterDTO1;
		characterDTOs[2] = characterDTO2;
		characterDTOs[3] = characterDTO3;

	}// ����ƽ ��� ���� (main �޼��� ����� �ʱ�ȭ ��)

	// ���� �޼���
	public static void main(String[] args) {
		// MVC ������ �̿��ؼ� ������ īƮ ���α׷� ����
		// DTO : ��ü�� (Data Transfer Object)
		// service :  �θ޴��� crud
		// main() : ��Ʈ�ѷ��� (�ָ޴�, �б���)
		
		System.out.println("========������ īƮ ������ �����մϴ�.========");
		
		boolean run = true ; // ó�� ����
		while(run){
		System.out.println("1. ȸ������ | 2. īƮ���� | 3. ���ӽ��� | 4. ����");
		System.out.print(">>>");
		String select = input.next(); // ���ڰ� �ƴѰ�� ���� �߻���.(����ó��) -> ����ó���ϴ°ɷ� ����.

		switch(select){
		case "1" :
			System.out.println("ȸ������ Ŭ������ �����մϴ�."); 
			// ���� ��ü�� �Դٰ����Ѵ�. MemberDTO �ٵ� ���񽺿��� ������ ����
			MemberService memberservice = new MemberService();
			LoginState = memberservice.menu(input, memberDTOs, LoginState);
			// �޴��� �Է°��� ��ĳ�� ��ü, ȸ�� �迭, �α��λ��� ��ü�� �޴°Ű�
			// ������ �α��λ��� ��ü(MemberDTO)�� �޴´�.
			System.out.println("���� �α����� ȸ�� �̸��� : " + LoginState.nickname);
			break;
		
		case "2" :
			System.out.println("īƮ���� Ŭ������ �����մϴ�.");
			break;
		
		case "3" :
			System.out.println("���ӽ��� Ŭ������ �����մϴ�.");
			break;
		
		case "4" :
			System.out.println("�������Ḧ �����մϴ�.");
			run = false ; // while�� �����
			break;
		
		default :
			System.out.println("1~4�� ���ڸ� �Է� �ϼ���");
			// break; 
			
		} // switch�� ����
		}// while�� ����
	
	}// main �޼��� ����

}
// class ����
