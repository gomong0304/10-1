package ch03;

public class ForEachExam {

	public static void main(String[] args) {
		// for each���� ���� for������ �迭�� �ε����� ������� �ʴ´�.
		// ��� : for(Ÿ�� ���� : �迭��) {
		//       ���๮1;
		//       }
		// foreach���� R(��ü)��, ��ü ����Ʈ ��¿����� ��
		
		int[] scores = {91, 95, 87, 93, 88};
		
		for(int i : scores) {
			System.out.println(i + " ");
		}
		
		
		String[] names = {"������", "�躸��", "���α�", "������", " ������", "���ϴ�"};
		
		for(String i : names) {
			System.out.println("names �迭�� ���α⾾�� �⼮�߽��ϱ�??");
			if("���α�".equals(i)) {
				System.out.println("���α⾾ ��� �Ϸ�");
			}
		}
		
	}

}
