package class1.sub2;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int p) {
		this.price = p;
		System.out.println(this.productName + "가격 수정 됨");
	}
	
	public void addStock (int s) {
		this.quantity += s;
		System.out.println(this.productName + " " + s + "개 추가 됨");
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : " + productId);
		System.out.println("상품 이름 : " + productName);
		System.out.println("가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
}
