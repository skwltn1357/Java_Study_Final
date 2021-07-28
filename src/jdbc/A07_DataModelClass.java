package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.model.Coffee;

public class A07_DataModelClass {

   public static void main(String[] args) {
      
      // DB���� ������ �����ʹ� ������ �� Ŭ������ �־� �δ� ���� ����.
      
      // A06_HikariCP�� ������ ���� ���� �� �ִ�
      // getConnection() �޼��带 ������ �� coffee ���̺��� ���� �ֿܼ� ��� ����غ�����
      String sql = "SELECT * FROM coffee";
      
      // ������ Ŭ������ ���׸����� Ȱ���� �پ��� �÷����� ���� �̿��� �� �ִ�.
      ArrayList<Coffee> list = new ArrayList<>();
      
      try (
         Connection conn = A06_HikariCP.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
      ){
         
         while(rs.next()) {
            list.add(new Coffee(
                  rs.getInt("id"),
                  rs.getString("name"),
                  rs.getInt("price")));
         }
         
         System.out.println(list);
      } catch(SQLException e) {
         e.printStackTrace();
      }
      
   }
}