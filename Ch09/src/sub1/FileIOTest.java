package sub1;

/* 260513 Java 파일 입출력 실습 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {
	public static void main(String[] args) {
		
		// 입출력 파일 경로 설정
		String source = "C:\\Users\\GGG\\Desktop\\test1.txt"; // 읽을 파일, 원본 파일
		String target = "C:\\Users\\GGG\\Desktop\\test2.txt"; // 복사될 파일, 대상 파일
		
		// 스트림 생성 
		try { // try-catch 미사용 시, FileNotFoundException 예외 에러 경고 뜸
			FileInputStream fis = new FileInputStream(source); // 입력 스트림 : source 파일 읽기 시작, 파일 → 프로그램
			FileOutputStream fos = new FileOutputStream(target); // 출력 스트림 : target 파일 쓰기 시작, 프로그램 → 파일
		
			while(true) { // 파일 끝까지 계속 읽기 위해 사용
				// 파일 읽기
				int data = fis.read(); //  IOException 예외 발생 가능 -> catch추가
				
				if(data == -1) { // 파일 내용이 없으면
					break;
				}
				
				// 임시로 출력
				// char ch = (char) data;
				// System.out.println(ch);
				
				// 파일 쓰기
				fos.write(data);
			}
			
			// 스트림 연결 해제
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
