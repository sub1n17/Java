package sub7;


public class AbstractTest {

	public static void main(String[] args) {
		
		sub6.Animal animal6 = new sub6.Animal(); // 추상클래스가 아니므로 생성 가능
	//	sub7.Animal animal7 = new sub7.Animal(); // 추상클래스이므로 생성 불가능
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		// 객체의 타입이 다르지만 부모인 animal타입의 배열로 만들어서 객체 생성 가능
		Animal[] animals = {tiger, eagle, shark};
		
		for(Animal a : animals) {
			a.move();
		}
		
	}
}
