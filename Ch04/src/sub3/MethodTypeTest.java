package sub3;

/*
 * 날짜 : 2026/04/28
 * 이름 : 최수빈
 * 내용 : JAVA 메서드 형태 실습
 */

public class MethodTypeTest {
	public static void main(String[] args) {
		// type1 메서드 호출
		double y1 = type1(1.2);
		double y2 = type1(2.2);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		
		// type2 메서드 호출
		type2(true);
		type2(false);
		type2(2 > 3);
		type2(5 < 7);
		
		// type3 메서드 호출
		boolean result = type3();
		System.out.println("type3 반환값:" + result);
		
		
		// type4 메서드 호출
		type4();
		
	}
	
	// 타입1 - 매개변수 O, 반환값 O
	public static double type1(double radius) {
		double y = (radius * radius) * 3.14;
		return y;
	}
	
	
	// 타입2 - 매개변수 O, 반환값 X
	public static void type2(boolean isOk) {
		if(isOk) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
	}
	
	
	// 타입3 - 매개변수 X, 반환값 O
	public static boolean type3() {
		int num = 0;
		
		if(num > 10) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// 타입4 - 매개변수 X, 반환값 X
	public static void type4() {
		double result = type1(5);
		System.out.println("반지름 길이가 5인 원넓이: " + result);
	}
}
