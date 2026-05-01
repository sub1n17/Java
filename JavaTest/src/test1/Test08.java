package test1;

public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0; i < n ; i++) { 
			
			for(int j= n-1 ; j > i; j--) {  
				System.out.print(" ");
			}
			
			for(int j= 0 ; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
	}
}

/*
j > i : 현재 줄(i)에 맞게 공백 개수를 조절하는 조건
i=0 j=4,3,2,1  → 1번째 줄 공백 4개→
i=1 j=4,3,2    → 2번째 줄 공백 3개
i=2 j=4,3      → 3번째 줄 공백 2개
i=3 j=4        → 4번째 줄 공백 1개


j < 2*i+1 : 별 개수 출력하는 조건
i=0일 때, for(j=0; j<1; j++) → 별 1개 출력 j=0
i=1일 때, for(j=0; j<3; j++) → 별 3개 출력 j=0,1,2
i=2일 때, for(j=0; j<5; j++) → 별 5개 출력 j=0,1,2,3,4
i=3일 때, for(j=0; j<7; j++) → 별 7개 출력 j=0,1,2,3,4,5,6
 */








