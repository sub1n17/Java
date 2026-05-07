package sub6;

public class PolyTest {
	
	public static void main(String[] args) {
		// *** 업캐스팅 *** 
		// 다형성을 활용한 객체 생성
		Animal a1 = new Tiger(); // 참조변수(객체)의 타입을 부모 클래스로 선언 → 업캐스팅, 다형성의 코드 표현
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
	
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// *** 다운캐스팅 ***
		Tiger tiger = (Tiger) a1; // 명시적 형변환
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		// 다운캐스팅 시, 객체 타입확인 연산
		if(a1 instanceof Tiger) { // a1이 Tiger로 생성되었다면 아래 실행
			System.out.println("a1은 Tiger 객체입니다.");
		} else if (a1 instanceof Eagle) {
			System.out.println("a1은 Eagle 객체입니다.");
		} else if (a1 instanceof Shark) {
			System.out.println("a1은 Shark객체입니다.");
		}
		
		
		
	
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		printSound(dog);
		printSound(cat);
		
	}
	
	public static void printSound(Pet pet) { // 다형성을 메서드 매개변수에 활용
		pet.makeSound();
	}
	
	
}
