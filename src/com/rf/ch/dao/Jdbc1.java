package com.rf.ch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;


public class Jdbc1 {

	private static final String URL="jdbc:mysql://localhost:3306/chenhao";
	private static final String USER="root";
	private static final String PASSWORD="199411";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Drivar");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static Connection connetion() {
		Connection conn=null;
		try {
		 conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public void close(ResultSet re,PreparedStatement pr,Connection conn) {
		if(re!=null) {
			try {
				re.close();
				re=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pr!=null) {
			try {
				pr.close();
				pr=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				pr.close();
				pr=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
