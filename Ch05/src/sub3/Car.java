package sub3;

public class Car {

	// 속성(멤버변수)
	private String name;
	private int speed;
	public static int count; // 클래스 변수(정적변수), 보통 외부에서 클래스타입으로 접근하기 때문에 public 선언, 모든 객체에서 공유하는 변수임
	
	
	// 생성자(생성자는 초기값만 넣는 게 아니라, 객체 생성 시 실행되는 ‘초기화 로직 전체’)
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
		count++;
	}
	
	// 기능(멤버메서드)
	public void speedUp(int speed) {
		this.speed = speed;
	}
	
	public static int totalCar() { // 클래스 메서드(정적메서드)
		return count;
	}
	
	public void show() {
		System.out.println("차랑명: " + this.name);
		System.out.println("현재속도: " + this.speed);
		System.out.println("차량수: " + this.count);
	}
	
}
