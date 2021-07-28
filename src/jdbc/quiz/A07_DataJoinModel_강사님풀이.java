package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;
import jdbc.model.Department_강사님풀이;
import jdbc.model.Employee_강사님풀이;

public class A07_DataJoinModel_강사님풀이 {
	/*
	 	employees와 departments를 모두 조인하여 조회한 결과를 알맞은 모델에 담아 출력해보세요.
	 */
	
	public static void main(String[] args) {
		
		String sql = "SELECT "
				+ " e.*, "
				+ " d.*, "
				+ " e.manager_id AS mid1, "
				+ " d.manager_id AS mid2"
				+ " FROM employees e, departments d"
				+ " WHERE e.department_id = d.department_id";
		
		
		ArrayList<Employee_강사님풀이> employee_list = new ArrayList<>();
		
		try(
			 Connection conn = DBConnector.getConnection(); 
			 PreparedStatement pstmt = conn.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery();
		){
			//컬럼명 출력
			ResultSetMetaData meta = rs.getMetaData();
			for(int i=0, len=meta.getColumnCount(); i<=len; ++i) {
				System.out.println(meta.getColumnName(i));
			}
			
			while(rs.next()) {
				employee_list.add(new Employee_강사님풀이(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number"),
						rs.getDate("hire_date"),
						rs.getString("job_id"),
						rs.getDouble("salary"),
						rs.getDouble("commission_pct"),
						rs.getInt("e.manager_id"),
						rs.getInt("e.department_id")
					//	new Department_강사님풀이(
								//rs.getInt("d.department_id"),
								//rs.getString("department_name"),
								//rs.getInt("d.manager_id")
								//rs.getInt("location_id")
								//)									
						));
			}
			System.out.println("잘 꺼냄");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(employee_list);
	}
	}
