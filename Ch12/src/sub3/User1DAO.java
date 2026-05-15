package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User1DAO {
	// DB 정보
	private static String host = "jdbc:mysql://127.0.0.1:3306/studydb";
	private static String user = "sub1n17";
	private static String pass = "1234";
	
	
	public static void insert(User1DTO dto) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// PreparedStatement (미리 준비가 완료된 SQL을 사용하는 실행객체)
			String sql = "INSERT INTO User1 VALUES (?, ?, ? , ?)"; // ? 쿼리 파라미터 사용
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getUserid()); // 첫번째 ? 에 userid를 넣음
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setInt(4, dto.getAge()); // 4번째 쿼리 파라미터에 숫자로 데이터 매핑
			
			// SQL 실행
			psmt.executeUpdate();
			
			// SQL 종료
			psmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void update(User1DTO dto) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// PreparedStatement (미리 준비가 완료된 SQL을 사용하는 실행객체)
			String sql = "UPDATE User1 SET "
										+ "name = ?,"
										+ "hp = ?," 
										+ "age = ? "
										+ "WHERE userid = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 데이터 매핑(사상)			
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getHp());
			psmt.setInt(3, dto.getAge()); 
			psmt.setString(4, dto.getUserid());
			
			// SQL 실행
			psmt.executeUpdate();
			
			// SQL 종료
			psmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void delete(String userid) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// PreparedStatement (미리 준비가 완료된 SQL을 사용하는 실행객체)
			String sql = "DELETE FROM User1 WHERE userid = ?"; // ? 쿼리 파라미터 사용
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, userid);
			
			// SQL 실행
			psmt.executeUpdate();
			
			// SQL 종료
			psmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static List<User1DTO> select() {
		// try 안에있어서 ㅇ반환에러
		// 결과셋 처리 (DTO 리스트 생성)
		List<User1DTO> dtoList = new ArrayList<>();
					
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// PreparedStatement (미리 준비가 완료된 SQL을 사용하는 실행객체)
			String sql = "SELECT * FROM User1"; // ? 쿼리 파라미터 사용
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			
			
			while(rs.next()) {
				// String userid = rs.getString(1);
				// String name = rs.getString(2);
				// String hp = rs.getString(3);
				// int age = rs.getInt(4);
				
				// DTO 생성
				User1DTO dto = new User1DTO();
				dto.setUserid(rs.getString(1)); // dto.setUserid(userid);
				dto.setName(rs.getString(2)); // dto.setName(name);
				dto.setHp(rs.getString(3)); // dto.setHp(hp);
				dto.setAge(rs.getInt(4)); // dto.setAge(age);
			
				// 리스트 추가
				dtoList.add(dto);
			}
			
			
			// SQL 종료
			psmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dtoList;
	}
	
	
	public static List<User1DTO> search(String name) {
		
		// 결과셋 처리 (DTO 리스트 생성)
		List<User1DTO> dtoList = new ArrayList<>();
					
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// PreparedStatement (미리 준비가 완료된 SQL을 사용하는 실행객체)
			String sql = "SELECT * FROM User1 WHERE name = ?"; // ? 쿼리 파라미터 사용
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			
			// SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			
			// 결과셋 처리(DTO 리스트 생성)
			while(rs.next()) {
				// String userid = rs.getString(1);
				// String name = rs.getString(2);
				// String hp = rs.getString(3);
				// int age = rs.getInt(4);
				
				// DTO 생성
				User1DTO dto = new User1DTO();
				dto.setUserid(rs.getString(1)); // dto.setUserid(userid);
				dto.setName(rs.getString(2)); // dto.setName(name);
				dto.setHp(rs.getString(3)); // dto.setHp(hp);
				dto.setAge(rs.getInt(4)); // dto.setAge(age);
			
				// 리스트 추가
				dtoList.add(dto);
			}
			
			
			// SQL 종료
			psmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dtoList;
	}
	
	
	
}
