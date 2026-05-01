package test2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		int arr[] = {4, 2, 1, 5, 3};
		// i : 몇 번째 자리까지 확정할 건지
		// i=3일 때 이미 4개 숫자가 순서대로 정렬되고 나머지는 자동정렬되니까 i<4
		for (int i=0 ; i<4 ; i++) {
			// j : 뒤에 있는 모든 값 전부 비교
			// 마지막 인덱스번호가 4니까 모든 요소를 끝까지 비교하기 위해 j<5
			for (int j = i+1 ; j<5 ; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
//			i=0, j=1 / 2 4 1 5 3 
//               j=2 / 1 4 2 5 3
//			i=1, j=2 / 1 2 4 5 3
//		    i=2, j=4 / 1 2 3 5 4
//			i=3, j=4 / 1 2 3 4 5
//			과정: 1라운드(i=0) 0번째숫자 정하고, 2라운드 1번째숫자정하고, 3라운드 2번째 숫자 정하고... 
			System.out.print((i+1) + "라운드 : ");
			
			for (int n : arr) {
				System.out.print(n+" ");
			}
			
			System.out.print("\n");
			}
	}
}

