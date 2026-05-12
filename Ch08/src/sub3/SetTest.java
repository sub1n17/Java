package sub3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 2026/05/12 Java 제네릭 Generic 실습
 */

public class SetTest {
	public static void main(String[] args) {
		// 집합(Set) 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(3);
		set.add(3);
		System.out.println(set);
		
		// 집합(Set)에 대한 반복자 생성
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) { // 반복자로 데이터가 없을 때까지 반복 수행
			System.out.println(it.next()); // 데이터를 출력하고 다음 데이터 탐색
		}
		
		// 반복문 처리
		for(int num : set) {
			System.out.println(num + ", ");
		}
		System.out.println("\n");
	
		
		// -----------------------
		// 집합 연산
		// ----------------------- // Arrays.asList() 리스트 만드는 메서드
		Set<String> setA = new HashSet<>(Arrays.asList("서울", "대전", "대구", "부산", "광주"));
		Set<String> setB = new HashSet<>(Arrays.asList("인천", "부산", "울산", "수원", "서울"));
		
		
		// -----------------------
		// 합집합 연산
		// -----------------------
		Set<String> union = new HashSet<String>(setA);
		union.addAll(setB);
		
		System.out.println("합집합 : " + union); // 합집합 : [울산, 수원, 대전, 서울, 부산, 대구, 인천, 광주]
		
		
		// -----------------------
		// 교집합 연산
		// -----------------------
		Set<String> intersection = new HashSet<String>(setA);
		intersection.retainAll(setB);
		
		System.out.println("교집합 : " + intersection); // 교집합 : [서울, 부산]
		
		
		
		// -----------------------
		// 차집합 연산
		// -----------------------
		Set<String> minus = new HashSet<String>(setA);
		minus.removeAll(setB);
		
		System.out.println("차집합 : " + minus); // 차집합 : [대전, 대구, 광주]
		
		
		// -----------------------
		// TreeSet 실습
		// -----------------------
		
		// Set<Integer> scores = new HashSet<>();  정렬없음
		Set<Integer> scores = new TreeSet<>();
		
		scores.add(68);
		scores.add(56);
		scores.add(89);
		scores.add(92);
		scores.add(70);
		scores.add(70);
		
		// System.out.println(scores); // [68, 70, 56, 89, 92]
		System.out.println(scores); // [56, 68, 70, 89, 92]
		
	}
	
}
