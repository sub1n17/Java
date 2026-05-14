package sub1;

/* 260514 람다식 실습 */
// 하나의 메서드만 넣어야함 

@FunctionalInterface // 인터페이스를 클래스로 구현하지 않고 함수로 구현하겠다는 의미(생략가능)
interface A {
	public int method(int a, int b);
}

@FunctionalInterface 
interface B {
	public void method(double a);
}


@FunctionalInterface 
interface C {
	public boolean method();
}

@FunctionalInterface 
interface D {
	public void method();
}

@FunctionalInterface 
interface E {
	public double method(double a);
}

public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식 정의
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> {return a + b;};
		A a3 = (a, b) -> a + b; // {중괄호}가 없으면 return 생략
		
		// 람다식 호출
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1: " + r1); // r1: 3
		System.out.println("r2: " + r2); // r2: 5
		System.out.println("r3: " + r3); // r3: 7
		
		// B 람다식 정의
		B b1 = (double a) -> {System.out.println("a : " + a);};
		B b2 = (a) -> System.out.println("a : " + a);
		B b3 = System.out::println; // :: 메서드 참조연산자로 람다식 정의
		
		
		// C 람다식 정의
		C c1 = () -> {return true;};
		C c2 = () -> false;
		
		boolean rs1 = c1.method();
		boolean rs2 = c1.method();
		
		System.out.println("rs1 : " + rs1); // rs1 : true
		System.out.println("rs2 : " + rs2); // rs2 : true
		
		// D 람다식 정의
		D d1 = () -> {System.out.println("d1 호출");}; // d1 호출
		D d2 = () -> System.out.println("d2 호출"); // d2 호출
		
		d1.method();
		d2.method();
		
		// E 람다식 정의, 호출
		E e1 = Math::ceil;
		E e2 = Math::floor;
		E e3 = Math::round;
		
		double res1 = e1.method(1.2); // res1 : 2.0
		double res2 = e2.method(1.2); // res2 : 1.0
		double res3 = e3.method(1.2); // res3 : 1.0
		 
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
	}
}
