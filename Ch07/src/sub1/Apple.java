package sub1;

public class Apple extends Object { // 자바의 모든 클래스는 최상위 클래스인 Object를 상속, 명시할 필요 없음 
	// 싱글톤 객체 (객체를 단 하나만 생성하도록 제한하는 패턴)
	private static Apple instance = new Apple(); // 1. static 객체 생성
	private Apple () {} // 2. 생성자 private
	public static Apple getInstance () { // 3. getter 제공
		return instance;
	}
	// 사용 예시 
	// Apple a3 =  Apple.getInstance();
	// System.out.println(a2);
	
	
	
	
	private String country;
	private int price;
	
	public Apple (String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		// Object의 toString을 재정의해서 사용, 일반적으로 속성 정보를 출력
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	
}
