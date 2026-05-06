package sub4;


/*
 * 날짜 : 2026/04/30
 * 이름 : 최수빈
 * 내용 : JAVA 클래스 변수, 클래스 매서드 실습
 */

public class InheritanceTest {
	public static void main(String[] args) {
		
		// Car 상속객체 Sedan 생성
		Sedan sonata = new Sedan("소나타", "은색", 0, 1800);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.drive();
		
		// Car 상속 객체 Truck 생성
		Truck bongo = new Truck("봉고", "블루", 0, 0);
		bongo.load(100);
		bongo.speedUp(100);
		bongo.show();
		
		// Account 상속 객체 StockAccount 생성
		StockAccount kb = new StockAccount("KB증권", "110-12-0011", "홍길동", 0, "삼성전자", 0, 0);
		kb.deposit(1_000_000);
		kb.buy(10, 100_000);
		kb.show();
		
		kb.sell(5, 150000);
		kb.show();
		
		
		// Person 상속 객체 Doctor 생성
		Doctor kim = new Doctor("김유신", 24, "소아과");
		kim.work();
		
		Engineer lee = new Engineer("이순신", 31, "SW개발");
		lee.work();
	}
}
