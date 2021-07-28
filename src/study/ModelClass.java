package study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModelClass {
	public static void main(String[] args) {
		
		String user_input = "je";
		String keyword = String.format("%%%s%%", user_input.toLowerCase());
		
		String sql = "SELECT first_name,department_name,city FROM employees INNER JOIN departments USING(department_id) RIGHT OUTER JOIN locations USING(location_id) WHEREH lower(first_name) LIKE ?";

		
		ArrayList<Model> list = new ArrayList<>();
		
		try(
			 Connection conn = DBConnector.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(sql);
			 
		){
			pstmt.setString(1, keyword);
			
			try(
				ResultSet rs = pstmt.executeQuery();
			){

				while(rs.next()) {
					list.add(new Model(
							rs.getString("first_name"),
							rs.getString("department_name"),
							rs.getString("city")));
				}
			}
			
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
