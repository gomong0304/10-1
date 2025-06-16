package ch04.Car;

public class Car {
	// 필드 (객체가 가지고 있어야 하는 값) -> 글로벌 변수(GV)
	// 고유 데이터
	public String company; // 제작 회사(현대,기아,쉐보레,아우디...)
	public String model; // 자동차 모델(소나타,아반테,그렌져...)
	public String color; // 자동차 색깔(흰색,검정색,회색...)
	public int maxSpeed; // 최고 속도
	public String oilType; // 오일 타입 (경유,휘발유...)
	
	// 상태 값(변동 가능한 값)
	public int speed;
	public int rpm;
	public int oil;
	
	// 부품 -> 다른 클래스를 생성하여 연결한다.
//	public Body body;
//	public Engine engine;
//	public Tire tire;
	
	// 부품에 필드를 사용법
	// Car myCar = new Car(); -> 새로운 객체 생성(인스턴스)
	// myCar.maxSpeed = 300; -> 객체에 있는 maxSpeed에 300 정수를 넣는다. -> 메인에서 써먹으면 된다.
	// --------------------------------------------------------------------
	
	
	// 기본생성자 : 생략이 가능 (객체가 생성할 때 사용되는 메서드 : 클래스명과 같은 이름)
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 100;
	} // 객체가 생성이 되면서 변수에 값이 저장됨.
	
	
	// 사용자 지정생성자 : 개발자가 응용하는 기법
	// 사용자 지정 생성자가 만들어지면 기본 생성자는 자동으로 생성되지 않는다.
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}// Car myCar = new Car("벤츠", "이클레스", "빨강");
	
	
	// 메서드 (객체가 수행해야 되는 동작)
	// C : 시동 시작
	// R : 주행 상태, 차량상태
	// U : 가속, 감속, 주차...
	// D : 시동 종료
	public void start(){
		System.out.println(this.model + "가(이) 주행을 시작합니다.");
		System.out.println("현재 속도 : " + this.speed);
		System.out.println("현재 rpm : " + this.rpm);
		System.out.println("현재 주유량 : " + this.oil);
	}
	
}
