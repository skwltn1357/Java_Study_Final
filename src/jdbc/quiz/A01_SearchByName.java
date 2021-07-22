package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_SearchByName {
	/*
	 	# 사용자로부터 문자열을 입력받으면 해당 문자열이 이름에 포함된 모든 사원을 조회해보세요 	 		
	 		(대소문자 구분없이 모두 검색되어야함.)
	 */
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 라이브러리를 찾을 수 없음");
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",  
					"hr",
					"1234");
		
		String str = "le";
		// select * from employees where first_name like '%le%';
		String sql = "SELECT * FROM employees WHERE first_name LIKE '%" + str + "%'";

		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.printf("%s\n", rs.getString("first_name"));
		}
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	
	}
}
