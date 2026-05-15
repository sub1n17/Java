package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* 260515 JDBC 실습 */

public class JDBCTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "sub1n17";
		String pass = "1234";

		try {
			// 1) 드라이버 로드 (생략 가능)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2) DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!!");
			} else {
				System.out.println("데이터베이스 접속 실패!!");
			}
		
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
