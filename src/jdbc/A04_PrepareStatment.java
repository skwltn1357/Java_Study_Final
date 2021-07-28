package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A04_PrepareStatment {
	
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521/XE";
	private static String user = "hr";
	private static String password = "1234";
	
	static {		//한번만 실행될 수 있게 static 사용
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	// 사용할 쿼리문을 준비할 때 변수를 넣을 자리에는 ?를 이용한다.
	String exploit = "'a' or 1 == 1; DELETE FROM employees; --";
	String user_input = "le";
	String keyword = String.format("%%%s%%", user_input.toLowerCase());	//대소문자 구분없이 가능
;
	// ?를 쓰면 SQL Injection을 방어할 수 있다.
	String sql = "SELECT * FROM employees" + " WHERE lower(first_name) LIKE ?";
	
	try( 
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			//pstmt의 ?을 채운다
			pstmt.setString(1, keyword);

			try(
				ResultSet rs = pstmt.executeQuery();
			) {
				while(rs.next()) {
					System.out.printf("%-4d%-14s%-20s\n",
							rs.getInt("employee_id"),
							rs.getString("first_name"),
							rs.getString("job_id"));
					}
				}
			} catch(SQLException e) {
					e.printStackTrace();
		}
	}
}


