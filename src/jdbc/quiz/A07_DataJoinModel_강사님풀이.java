package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;
import jdbc.model.Department_�����Ǯ��;
import jdbc.model.Employee_�����Ǯ��;

public class A07_DataJoinModel_�����Ǯ�� {
	/*
	 	employees�� departments�� ��� �����Ͽ� ��ȸ�� ����� �˸��� �𵨿� ��� ����غ�����.
	 */
	
	public static void main(String[] args) {
		
		String sql = "SELECT "
				+ " e.*, "
				+ " d.*, "
				+ " e.manager_id AS mid1, "
				+ " d.manager_id AS mid2"
				+ " FROM employees e, departments d"
				+ " WHERE e.department_id = d.department_id";
		
		
		ArrayList<Employee_�����Ǯ��> employee_list = new ArrayList<>();
		
		try(
			 Connection conn = DBConnector.getConnection(); 
			 PreparedStatement pstmt = conn.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery();
		){
			//�÷��� ���
			ResultSetMetaData meta = rs.getMetaData();
			for(int i=0, len=meta.getColumnCount(); i<=len; ++i) {
				System.out.println(meta.getColumnName(i));
			}
			
			while(rs.next()) {
				employee_list.add(new Employee_�����Ǯ��(
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
					//	new Department_�����Ǯ��(
								//rs.getInt("d.department_id"),
								//rs.getString("department_name"),
								//rs.getInt("d.manager_id")
								//rs.getInt("location_id")
								//)									
						));
			}
			System.out.println("�� ����");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(employee_list);
	}
	}
