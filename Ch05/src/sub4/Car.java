package sub4;

public class Car {
	// private에서 protected 접근권한을 변경해서 자식 클래스가 접근하도록 허용, 외부에서 접근 불가능
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명: " + name);
		System.out.println("차량색: " + color);
		System.out.println("현재속도: " + speed);
	}
}

