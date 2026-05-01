package test2;

import java.util.Scanner;

// 비교할 때마다 중앙을 기준으로 절반을 제거하고 비교해서 빨리 확인 가능
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.print("검색할 값 입력 : ");
		int value = sc.nextInt();
		
		int start = 0, loc = 0;
		int end = arr.length - 1;
		boolean state = false;
		
		// start -------- mid -------- end
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(arr[mid] > value) { // arr[mid] = 4번째 인덱스
				end = mid - 1; // 중앙값보다 value가 작으면 마지막 숫자를 중앙앞까지 잘라서 탐색 -> end = 3번째 인덱스 
			} else if(arr[mid] < value) {
				start = mid + 1; // 중앙값보다 value가 크면 시작 숫자를 중앙 뒷부분으로 설정해서 탐색 -> start = 5번ㅉ
			} else {
				loc = mid;
				state = true;
				break;
			}
		}

		if(state) {
			System.out.printf("찾은 위치 : %d번째 있습니다.", loc + 1);
		} else {
			System.out.println("찾는 숫자가 없습니다.");
		}
	}
}
