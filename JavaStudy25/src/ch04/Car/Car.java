package ch04.Car;

public class Car {
	// �ʵ� (��ü�� ������ �־�� �ϴ� ��) -> �۷ι� ����(GV)
	// ���� ������
	public String company; // ���� ȸ��(����,���,������,�ƿ��...)
	public String model; // �ڵ��� ��(�ҳ�Ÿ,�ƹ���,�׷���...)
	public String color; // �ڵ��� ����(���,������,ȸ��...)
	public int maxSpeed; // �ְ� �ӵ�
	public String oilType; // ���� Ÿ�� (����,�ֹ���...)
	
	// ���� ��(���� ������ ��)
	public int speed;
	public int rpm;
	public int oil;
	
	// ��ǰ -> �ٸ� Ŭ������ �����Ͽ� �����Ѵ�.
//	public Body body;
//	public Engine engine;
//	public Tire tire;
	
	// ��ǰ�� �ʵ带 ����
	// Car myCar = new Car(); -> ���ο� ��ü ����(�ν��Ͻ�)
	// myCar.maxSpeed = 300; -> ��ü�� �ִ� maxSpeed�� 300 ������ �ִ´�. -> ���ο��� ������� �ȴ�.
	// --------------------------------------------------------------------
	
	
	// �⺻������ : ������ ���� (��ü�� ������ �� ���Ǵ� �޼��� : Ŭ������� ���� �̸�)
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 100;
	} // ��ü�� ������ �Ǹ鼭 ������ ���� �����.
	
	
	// ����� ���������� : �����ڰ� �����ϴ� ���
	// ����� ���� �����ڰ� ��������� �⺻ �����ڴ� �ڵ����� �������� �ʴ´�.
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}// Car myCar = new Car("����", "��Ŭ����", "����");
	
	
	// �޼��� (��ü�� �����ؾ� �Ǵ� ����)
	// C : �õ� ����
	// R : ���� ����, ��������
	// U : ����, ����, ����...
	// D : �õ� ����
	public void start(){
		System.out.println(this.model + "��(��) ������ �����մϴ�.");
		System.out.println("���� �ӵ� : " + this.speed);
		System.out.println("���� rpm : " + this.rpm);
		System.out.println("���� ������ : " + this.oil);
	}
	
}
