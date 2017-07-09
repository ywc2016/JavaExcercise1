package com.buaa.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试JDBC
 * 
 * @author ywcrm
 * 
 */
public class TestJDBC {

	public static void main(String[] args) {
		while (true) {
			Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				// 建立StateMent对象
				stmt = MyConn.getConn().createStatement();
				// sql语句
				String sql = "INSERT INTO user(name,password) VALUES(?,?)";
				// 建立PreparedStatement对象
				pstmt = MyConn.getConn().prepareStatement(sql);
				pstmt.setString(1, "ywc");
				pstmt.setString(2, "123");
				pstmt.executeUpdate();

				// 访问记录集ResultSet对象
				//			while (rs.next()) {
				//				System.out.println(rs.getString("name") + ","
				//						+ rs.getString("password"));
				//			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// 依次将ResultSet、Statement、PreparedStatement、Connection对象关闭，释放所占用的资源.
				//			try {
				//				rs.close();
				//				stmt.close();
				//				pstmt.close();
				//				MyConn.closeConn();
				//			} catch (SQLException e) {
				//				e.printStackTrace();
				//			}
			}
		}

	}
}
