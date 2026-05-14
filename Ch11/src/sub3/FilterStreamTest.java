package sub3;

import java.util.Collections;
import java.util.List;

public class FilterStreamTest {
	public static void main(String[] args) {
		
		// 불변 리스트 생성
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7 ,8, 9, 1, 2, 3);
		
		// numbers.add(8); // 불변리스트이므로 새로운 값 추가 안 됨
		System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3]
		
		//중복제거
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", ")); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 
		System.out.println("\n");
		
		// 5보다 큰 데이터 필터링
		numbers
			.stream()
			.filter(num -> {
				if(num >= 5) { 
					return false; 
				} else { 
					return true; // 5보다 작아야 통과
				}
			})
			.forEach(num -> {
				System.out.print(num + ", ");
			});
		System.out.println("\n"); // 1, 2, 3, 4, 1, 2, 3
		
		// 중복 제거, 짝수 데이터 필터링, 내림차순 정렬
		numbers
			.stream()
			.distinct()
			.filter(num -> {
				if(num % 2 == 0) {
					return true;
				} else {
					return false;
				}
			})
			.sorted(Collections.reverseOrder()) // 큰거부터 정렬
			.forEach(num -> {
				System.out.print(num + ", ");
			});
		System.out.println("\n"); // 8, 6, 4, 2
		
	}
}
