package sub4;

/*
 * 날짜 : 2026/04/28
 * 이름 : 최수빈
 * 내용 : JAVA 지역변수, 전역변수 실습
 */

public class LocalGlobalVariableTest {
	public static void main(String[] args) {
		int total1 = sum(1, 10);
		int total2 = sum(1, 100);
		int total3 = sum(1, 1000);
		
		System.out.println("total1: " + total1);
		System.out.println("total2: " + total2);
		System.out.println("total3: " + total3);
	}
	
	int num = 1; // 전역변수, 클래스 내에 선언
	
	
	
	public static int sum(int start, int end) { // 매개션수는 지역변수 (지역변수는 메서드가 끝나면 메모리에서 삭제됨)
		int total = 0; // 메서드 안에서 선언된 지역변수
		
		for(int k = start; k<=end; k++) { // for문의 반복변수 k는 지역변수
			total += k;
		}
		
		return total;
	}
	
	
	
	
	
	
	
	
	
}
