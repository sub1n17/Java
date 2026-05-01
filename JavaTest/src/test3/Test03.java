package test3;

class Car {
	private String company;
	private String name;
	private int price;
	
	public Car(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
	
	public void drive() {
		System.out.println(name +" 운행 중...");
	}
	
	public void info() {
		System.out.println("제조사 : " + company);
		System.out.println("차량명 : " + name);
		System.out.println("가 격 : " + price);
	}
}

public class Test03 {
	public static void main(String[] args) {
		Car sonata = null; // 객체 null 초기화
		Car k5 = null;
		
		sonata = new Car("현대", "소나타", 3000);
		k5 = new Car("기아", "K5", 4000);
		
		sonata.drive();
		sonata.info();
		
		k5.drive();
		k5.info();
	}
}

/*
 *** Car sonata = null; 왜 바로 생성자 생성 후 초기화하지 않고 null? ***
 변수만 먼저 만들어 놓고 (null 상태) 나중에 객체를 넣음
 조건 때문에 나중에 값을 결정해야 할 때는 미리 null로 선언해야 함
 Car car = null;

 if (조건) {
    car = new Car("현대", "소나타", 3000);
 } else {
    car = new Car("기아", "K5", 4000);
 }
 지금처럼 조건식 없는 경우엔 Car sonata = new Car("현대", "소나타", 3000); 객체 생성과 초기화 동시에 가능
*/

