package sub2;
/*
 * 260515 Java CRUD Insert 실습
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "sub1n17";
		String pass = "1234";

		try {
			// 1) DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2) SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 3) SQL 실행
			String sql = "Insert INTO User1 Values('J105','강감찬','010-121-1005', 50)";
			stmt.executeLargeUpdate(sql); // Insert, Update, Delete 쿼리만 사용
			
			
			// 4) SQL 결과 처리 (SELECT 작업일 경우)
			
			// 5) DB 연결 해제
			stmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Insert 완료");
	}
}
