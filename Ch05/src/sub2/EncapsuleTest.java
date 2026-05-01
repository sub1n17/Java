package sub2;

/*
 * 날짜 : 2026/04/29
 * 이름 : 최수빈
 * 내용 : JAVA 캡슐화 실습
 */

public class EncapsuleTest {
	public static void main(String[] args) {
		/* 캡슐화하기 전
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화 → 캡슐화된 속성을 생성자로 초기화
		sonata.brand ="소나타";
		sonata.color ="흰색";
		sonata.speed =0;
		*/
		
		
		
		// Car 객체 생성 및 생성자 초기화
		Car sonata = new Car("소나타", "흰색", 0); // 직접 초기화 - 위험함
		sonata.setColor("은색"); // 안전하게 세터로 수정
		sonata.show();
		
		Car avante = new Car(); // 간접 초기화 - 안전함
		// 세터 초기화 
		avante.setBrand("아반테");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getSpeed());
		
		
		// Account 객체 생성 및 생성자 초기화
		Account wr = new Account("우리은행", "101-12-111", "김유신", 0);
		wr.show();
		
		
		
		// Book 객체 생성 및 생성자 초기화
		Book book = new Book("이것이 자바다", "신용권", 3);
		book.show();
		
		
		
		// Member 객체 생성 및 생성자 초기화
		Member kim = new Member("김유신", 23, false);
		kim.show();
		
		
		
		
		// Movie 객체 생성 및 초기화
		Movie titanic = new Movie("타이타닉", "제임스카메론", 10.0, 300);
		titanic.showDetails();
		
		Movie avatar = new Movie("아바타", "제임스카메론", 9.8, 250);
		avatar.showDetails();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
