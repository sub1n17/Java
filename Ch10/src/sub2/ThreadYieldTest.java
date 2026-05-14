package sub2;

class Sub1Thread extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			System.out.println("Sub1 스레드 실행 " + i);
			Thread.yield(); // 다른 스레드가 먼저 실해오딜 수 있게 양보
		}
	}
}

class Sub2Thread extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			System.out.println("Sub2 스레드 실행 " + i);
			// Thread.yield();
		}
	}
}

public class ThreadYieldTest {
	public static void main(String[] args) {
		
		Sub1Thread s1 = new Sub1Thread();
		Sub2Thread s2 = new Sub2Thread();
		
		s1.start();
		s2.start();
		
		System.out.println("Main Thread 종료");
	}
}
