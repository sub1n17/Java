package sub2;

/* 260514 thread join 실습 */

public class ThreadJoinTest {
	public static void main(String[] args) {
		
		ChildThread ct = new ChildThread();
		ct.setName("Child");
		
		ct.start();
		
		try {
			// 자식 스레드가 작업을 마치고 Main Thread로 합류할 때까지 Main 스레드 대기
			ct.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread 종료");
	}
}
