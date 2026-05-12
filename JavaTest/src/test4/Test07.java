package test4;

interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}
	
class Customer implements Buyer, Seller  {
	@Override
	public void sell() {
		System.out.println("판매 합니다.");
	}
	
	@Override
	public void buy() {
		System.out.println("구매 합니다.");
	}
}

public class Test07 {
	public static void main(String[] args) {
		// *** 인터페이스는 new로 객체생성 못 함 ***
		Buyer buyer = new Customer(); // Customer 객체를 Buyer 역할로 사용하겠다, 객체를 buyer 타입으로 참조해서 buyer에 정의된 기능만 사용하도록 함
		Seller seller = new Customer(); 
		
		buyer.buy();
		seller.sell();
	}
}