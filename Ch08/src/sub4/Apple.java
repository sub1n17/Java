package sub4;

public class Apple extends Object {
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
