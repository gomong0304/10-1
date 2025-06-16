package ch05.getter_setter;

public class MemberDTO {
	// �ʵ� -> private�� �����ؼ� ���� ������ �ȵǼ� getter setter�� �������, �޴°� setter ����Ҷ��� getter
	private String name;
	private int age;
	private boolean admin;

	
	// ������
	
	// �޼��� -> ���� �޼��带 ���ؼ� ���� �ְ� �޴´�.
	// ��Ŭ���� ��ܿ� source�޴� -> generate getter and setter�� �̿��ؼ� ����
	// �⺻������ ���� ������ -> public
	public String getName() {
		return name+"��";
	}
	public void setName(String name) {
		System.out.println("�̸��� ���ڰ� �Ұ����մϴ�.");
		this.name = name;
	}
	public int getAge() {
		return age; // int Ÿ���̶� �ڿ� "��"�� ���ϼ�����..
	}
	public void setAge(int age) {
		System.out.println("���̿��� 19�� �̻� �����մϴ�.");
		this.age = age;
	}
	public String isAdmin() { // boolean�� ��쿡�� is�� ����
		String adminString = null;
		
		if (admin == true) {
			adminString = "������";
		}
		return adminString;
	}
	
	public void setAdmin(boolean admin) {
		System.out.println("�������� ��쿡�� true�� ó�����ּ���.");
		this.admin = admin;
	}
	
	
	
	
	
	
	
	
}
