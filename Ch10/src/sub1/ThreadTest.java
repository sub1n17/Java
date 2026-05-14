package sub1;

// 260514 Thread 실습

public class ThreadTest {

	public static void main(String[] args) {
		
		// 스레드 객체 생성
		ChildThread ct1 = new ChildThread();
		ChildThread ct2 = new ChildThread();
		
		ct1.setName("Child1");
		ct2.setName("Child2");
		
		ct1.start();
		ct2.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread 실행");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread 종료");
	}

	
	
	
}
