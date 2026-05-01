package test2;

public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	
	public static int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		return fibo(n-2) + fibo(n-1);
	}
}

/*
n=0 → 0
n=1 → 1
n=2 → 1 (0+1)
n=3 → 2 (1+1)
n=4 → 3 (1+2)

규칙: f(n) = f(n-1) + f(n-2)


fibo(0) = 0
fibo(1) = 1
fibo(2) = fibo(0) + fibo(1) -> 피보나치 = 앞의 두 수를 더하는 것
 */
