package sub3;

public class Calc {
	// 생성자
	// 의미: 객체를 만들 때 자동으로 실행되는 특별한 함수, new xxx() 하는 순간 생성자가 자동 실행
	// 역할: 객체가 만들어질 때 초기 상태를 만들어주려고 위함
	// 특징: 클래스 이름이랑 같음, 반환 타입 없음(void도 없음), new할 때 자동 실행
	
	// ********* ★ 싱글톤 객체 구현 방법 ★ ************
	// 싱글톤 객체 (객체를 딱 하나만 생성해서 계속 재사용, 클래스 안에서 본인 객체 생성, 메모리 절약, 상태 공유 가능, 관리 포인트가 하나라서 안정적)
	private static Calc instance = new Calc(); // 1개만 생성, 객체를 미리 하나 만들어둠 (공유용)
	public static Calc getInstance() { // 접근 방법 제공, 객체 필요하면 getInstance로만 접근
		return instance;
	}
	private Calc() {} //외부에서 new 못하게 막음, 생성자를 막음, 외부에서 Calc 객체 생성 못 하게 막기 위한 private 생성자 → Calc c1 = new Calc(); 안 됨→
	// ********************************************
	
	
	
	
	// 기능
	public int plus(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
	
	
	
}
