package ch05.package_exam.mycompany;

import ch05.package_exam.hankook.SnowTire;
import ch05.package_exam.kia.Engine;
import ch05.package_exam.kumho.*;

public class Car {
	// 필드
	public String company;
	public String model;
	
	// 한국 타이어를 객체로 만듬
	ch05.package_exam.hankook.Tire tire1 = 
			new ch05.package_exam.hankook.Tire();
	
	// 금호타이어를 객체로 만듬
	Tire tire2 = new Tire();
	
	// 엔진은 기아 부품으로 사용함 (import 확인)
	Engine kiaEngine = new Engine();
	SnowTire snowTire = new SnowTire();
	BigWidthTire bigWidthTire = new BigWidthTire();
	SportTire sportTire = new SportTire();
	// 생성자
	
	
	
	// 메서드
	
	
	
	
	
	
	
}
