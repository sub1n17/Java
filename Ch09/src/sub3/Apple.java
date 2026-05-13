package sub3;

import java.io.Serializable;

// 직렬화용 객체 생성을 위한 Serializable 인터페이스 구현
public class Apple implements Serializable {
	
	// 인스턴트 식별용 아이디
	private static final long serialVersionUID = 1L;
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}

	// Object 클래스의 toString()메서드 
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
}
