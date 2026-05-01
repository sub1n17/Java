package sub5;

/*
 * 날짜 : 2026/04/28
 * 이름 : 최수빈
 * 내용 : JAVA 메서드 오버로드 실습
 */

public class MethodOverloadTest {
	public static void main(String[] args) {
		int rs1 = add(1);
		int rs2 = add(1, 2);
		double rs3 = add(1.0, 2.1);
		String rs4 = add("Hello ", "World");
		
		System.out.println("rs1: " + rs1);
		System.out.println("rs2: " + rs2);
		System.out.println("rs3: " + rs3);
		System.out.println("rs4: " + rs4);
	}
	
	
	// 오버로드 메서드 정의 (오버로드: 같은 이름의 메서드를 매개변수로 구분한 메서드)
	public static int add(int a) {
		return a + a;
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;
	}
	public static String add(String a, String b) {
		return a + b;
	}
	
	
	
	
	
}
