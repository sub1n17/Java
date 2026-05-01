package test3;

class Adder {
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	private Adder() {}
	
	private Adder(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x; // 객체 안에 있는 멤버변수인 x를 증가시킴 → 멤버 x = 0 → 1→
		y++; // 메서드 안에서만 쓰는 매개변수(지역변수)인 y를 증가시킴 → 매개변수 y = 2 → 3 (메서드 끝나면 사라짐)
	} // private int x= 1 ,private int y = 0
	
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	
	public static void add(Adder a2) {
		a2.x += 10;
	} // a1의 타입이 Adder -> a2의 반환 타입도 Adder
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value); // 새 객체 생성
	}
	
	public void show() {
		System.out.println("----------");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}


public class Test06 {
	public static void main(String[] args) {
		
		Adder a1 = Adder.getInstance(); 
				
		a1.add(1, 2); 
		a1.show(); // x:1, y:0
		
		int[] arr = {10, 20};
		a1.add(arr); 
		a1.show(); // x:11, y:20
		
		Adder.add(a1); // 클래스명으로 호출했으니까 static 메서드 실행 -> static void add(Adder a2)
		a1.show(); // x:21, y:20
		
		a1 = Adder.add(a1, 3); // 객체가 새로 생성되면서 기본값으로 시작
		a1.show(); // x:0, y:3
	}
}



// private int y; y++; -> 0?