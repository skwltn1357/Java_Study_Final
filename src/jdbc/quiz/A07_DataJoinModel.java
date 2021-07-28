package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;
import jdbc.model.Coffee;
import jdbc.model.Employees_Departments;

public class A07_DataJoinModel {
	/*
	 	employees와 departments를 모두 조인하여 조회한 결과를 알맞은 모델에 담아 출력해보세요.
	 */
	
	public static void main(String[] args) {
		
	String sql = "SELECT * FROM employees e INNER JOIN departments d ON e.department_id = d.department_id";
	
	ArrayList<Employees_Departments> list = new ArrayList<>();
	
	 try (
	         Connection conn = DBConnector.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery();
	      ){
		 	
		 	while(rs.next()) {
		 		list.add(new Employees_Departments(	
		 				rs.getInt("employee_id"),
		 				rs.getString("first_name"),
		 				rs.getString("job_id"),
		 				rs.getString("email"),
		 				rs.getInt("salary"),
		 				rs.getInt("manager_id"),
		 				rs.getInt("department_id"),
		 				rs.getString("department_name")
		 				));
		 	}
		 	
		 	System.out.println(list);
	 	} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
