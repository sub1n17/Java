package sub3;

/* 2605514 스레드 동기화 실습 */

public class ThreadSyncTest {
	public static void main(String[] args) {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		// 자식 스레드 실행 (비동기 실행 = 순서없이 실행)
		ct1.start(); 
		ct2.start(); 
		ct3.start();

		try {
			ct1.join();
			ct2.join();
			ct3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count: " + count.getNum());
		
		
	}
}
