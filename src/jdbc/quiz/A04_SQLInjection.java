package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class A04_SQLInjection {
	
	// coffee ���̺� SQLInjection ������ �������Ѻ�����.
	// (�Ϻη� ?�� ������� �ʾƾ� ��)
	
	// ���α׷��� ���� ������ ����ڰ� ���ϴ� id�� Ŀ�Ǹ� �����ϴ� �����̾���.
	// DELETE FROM coffee WHERE id=1 or 1=1

	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "hr";
		String password = "1234";

		// DELETE FROM coffee WEHRE id=1 or 1=1		//1=1: ������ true��� �� -> �� ������
		String id = "3 or 1=1";		//coffee���̺� ���� ������		
		
		String sql = "DELETE FROM coffee WHERE id=" + id;
		try(
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				//PreparedStatement�� ������ (���Ȼ� ������ �ִ� ����)
				Statement statement = conn.createStatement();
				int rows = statement.executeUpdate(sql);
				
				System.out.println("done.");
				//pstmt.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}











