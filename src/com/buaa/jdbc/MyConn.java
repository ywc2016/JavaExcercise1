package com.buaa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 * jdbc连接mysql数据库
 * 
 * @author ywcrm
 * 
 */
public class MyConn {

	public static Connection conn = null;

	public static Connection getConn() {
		String url = "jdbc:mysql://localhost:3306/testdb?user=root&password=root&useUnicode=true&characterEncoding=utf-8";
		if (conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conn = DriverManager.getConnection(url);
				return conn;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void closeConn() {
		try {
			conn.close();
			conn = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
