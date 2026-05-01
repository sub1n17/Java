package sub3;

/*
 * 날짜 : 2026/04/30
 * 이름 : 최수빈
 * 내용 : JAVA 클래스 변수, 클래스 매서드 실습
 */


class Increament {
	// 속성
	public int num1;        // 인스턴스 변수 (객체마다 따로 존재)
	public static int num2; // 클래스 변수(정적 변수, 모든 객체가 공유)
	
	// 생성자 (클래스 이름과 동일, 반환 타입 없음, 객체 생성 시 자동 실행 → Increament a = new Increament();
	// 생성자는 객체 만들 때 초기값 넣어주거나 초기 상태(기본값)를 만들어 로직을 실행 할 수 있음 
	public Increament() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1); 
		System.out.println("num2 : " + num2);
	}
	
}

public class StaticTest {
	public static void main(String[] args) {
		Increament inc1 = new Increament(); // num1=1, num2=1
		Increament inc2 = new Increament(); // num1=1, num2=2
		Increament inc3 = new Increament(); // num1=1, num2=3
		// ㄴ> num1 : 객체마다 따로니까 항상 0에서 시작 / num2 : 공유되니까 계속 누적
		
		// 클래스 변수는 객체 생성없이 직접 접근 가능
		// Increament.num1 = 1; // 에러 -> num1은 인스턴트 속성이기 때문에 객체로 접근해야 됨
		inc1.num1 = 1; 
		inc2.num1 = 2;
		inc3.num1 = 3;
		// 
		
		
		
		Increament.num2 = 2; // num2는 클래스변수(정적변수)이기 때문에 클래스 타입으로 접근 가능
		inc1.num2 = 1;
		inc2.num2 = 2;
		inc3.num2 = 3;
		
		
		
		// Car 객체 생성 및 초기화
		Car sonata = new Car("소나타", 0);
		Car avante = new Car("아반테", 0);
		Car toyota = new Car("토요타", 0);
		
		System.out.println("전체 차량수: " + Car.totalCar()); // 클래스 메서드 호출
		sonata.show();
		avante.show();
		toyota.show();
		
		
		
		
		
		// 싱글톤 객체, 예제 객체끼리 공유해야 하는 기능은 method area에 넣음
		// Calc c1 = new Calc(); 싱글톤 객체 생성 시, new 못하게 생성자를 막아서 에러남
		Calc c1 = Calc.getInstance(); 
		// ㄴ> private Calc() {}로 new로 객체 생성 못 하게 제한 -> 클래스 내부에서 미리 만들어둔 싱글톤 객체를 getInstance로 가져오기
	
		System.out.println("덧셈: " + c1.plus(2, 3));
		System.out.println("뺄셈: " + c1.minus(2, 3));
		System.out.println("곱셈: " + c1.multi(5, 7));
		
		
		
		
	}
}
