package com.rf.ch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	private static final String URL= "jdbc:mysql://localhost:3306/chenhao";
	private static final String USER ="root";
	private static final String PASSWORD = "199411";
	
	static {
		try {
			//ע������
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Connection connetion() {
		//��������
		Connection conn= null;
		try {
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void close(ResultSet re ,PreparedStatement pr,Connection conn ) {
		if(re!=null) {
			try {
				re.close();
				re=null;//��ֵΪ����Ϊ���ͷŵ�׼ȷ�Ժ���Դ�ܼ�ʱ���ͷ�
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
				conn.close();
				conn=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
