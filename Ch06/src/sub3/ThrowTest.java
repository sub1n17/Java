package sub3;

import sub3.MinusException;
import sub3.Score;

/*
 * 날짜 2026/05/11
 * 내용 Java Throw 예외 발생 시키기 실습
 */

class MinusException extends Exception {
	public MinusException(String message) {
		super(message);
	}
}
// throw 예외발생시키기 s 는 예외키워드
class Score {
	public void check(int score) throws MinusException {
		if(score < 0) {
			// 예외 발생 시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		} else {
			System.out.println("점수값 : " + score);
		}
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-1);
		} catch (MinusException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
