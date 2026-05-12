package sub1;

public class Apple extends Object {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	// toString()
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
}
