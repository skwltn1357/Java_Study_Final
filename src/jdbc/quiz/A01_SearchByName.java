package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_SearchByName {
	/*
	 	# ����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �̸��� ���Ե� ��� ����� ��ȸ�غ����� 	 		
	 		(��ҹ��� ���о��� ��� �˻��Ǿ����.)
	 */
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� ���̺귯���� ã�� �� ����");
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
