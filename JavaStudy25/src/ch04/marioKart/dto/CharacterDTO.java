package ch04.marioKart.dto;

public class CharacterDTO {
	// �ʵ�
		public String name; // ĳ���͸�
		public double weight; // ����
		public double speed; // �ӵ�
		public double acceleration; // ����
		public double handling; // �ڵ鸵
		public double friction; // ������
		
		// �⺻������ -> new CharacterDTO();
		// ����ڰ� �����ڸ� ����� �⺻�����ڴ� �ڵ����� ������ �ʴ´�.
		
		
		// ������ -> ��ü ������ ���� �����鼭 �����Ѵ�.
	public CharacterDTO(String name, double weight, double speed
			, double acceleration, double handling, double friction) {
		// CharacterDTO characterDTO = new CharacterDTO(�Ķ����);
		this.name = name;
		this.weight = weight;
		this.speed = speed;
		this.acceleration = acceleration;
		this.handling = handling;
		this.friction = friction;
	} // this. -> ���� ������ �۷ι� �������� ���ö� ���

	
	
	// �޼���
}
