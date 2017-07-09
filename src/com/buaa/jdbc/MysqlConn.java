package com.buaa.jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlConn {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb?"
				+ "user=root&password=root&useUnicode=true"
				+ "&characterEncoding=utf-8";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url);
			String sql = "INSERT INTO `user`(name,password) VALUES(?,?);";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "uuu");
			pstmt.setString(2, "333");
			pstmt.executeUpdate();

			while (rs.next()) {
				System.out.println(rs.getString("name") + ","
						+ rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
