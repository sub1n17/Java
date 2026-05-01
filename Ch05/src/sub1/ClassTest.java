package sub1;

/*
 * 날짜 : 2026/04/29
 * 이름 : 최수빈
 * 내용 : JAVA 클래스 기본 실습
 */

public class ClassTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		
		Car avante = new Car();
		avante.brand = "아반테";
		avante.color = "검정";
		avante.speed = 0;
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
		
		
		
		// Account 객체 생성 및 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-11-1234";
		kb.name="김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.show();
		

		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-22-1001";
		wr.name="김춘추";
		wr.balance = 1000;
		
		wr.deposit(16000);
		wr.withdraw(2000);
		wr.show();
		
		
		
		
		// Book 객체 생성 및 초기화
		Book javaBook = new Book();
		javaBook.title = "이것이 자바다";
		javaBook.author = "신용구";
		javaBook.copies = 3;
		
		boolean result =javaBook.borrowBook();
		if(result) {
			System.out.println("대출 성공!");
			javaBook.show();
		} else {
			System.out.println("대출 실패!");
			javaBook.returnBook();
			javaBook.show();
		}
		
		
		
		
		
		// Member 객체 생성 및 초기화
		Member kim = new Member();
		kim.name = "김유신";
		kim.age = 24;
		kim.isActive = false;
		
		kim.activate();
		boolean isAdult = kim.isAdult();
		
		if(isAdult) {
			kim.show();
			System.out.println("성인입니다");
		} else {
			kim.show();
			System.out.println("미성년자입니다");

		}
	}
}
