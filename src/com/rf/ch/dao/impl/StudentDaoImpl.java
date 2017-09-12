package com.rf.ch.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import com.rf.ch.dao.Jdbc;
import com.rf.ch.dao.StudentDao;
import com.rf.ch.entity.Student;

import jdk.nashorn.internal.scripts.JD;
//在这里实现接口的所有方法，就是接口的实现类
//这里是访问数据库的
public class StudentDaoImpl implements StudentDao{

	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		Connection conn = Jdbc.connetion();
		Jdbc jd = new Jdbc();
		String sql = "select * from studentG where username=? and password=?";
		PreparedStatement pr=null;
		ResultSet re=null;
		try {
			pr = conn.prepareStatement(sql);
			pr.setString(1,username);
			pr.setString(2, password);
		    re = pr.executeQuery();
			if(re.next()) {
				System.out.println("登录成功");
			}else {
				System.out.println("登录失败");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			jd.close(re, pr, conn);
		}
		return false;
	}

	@Override
	public ArrayList<Student> query() {
		// TODO Auto-generated method stub
		Connection conn = Jdbc.connetion();
		Jdbc jd = new Jdbc();
		String sql = "select * from StudentG";
		PreparedStatement pr=null;
		ResultSet re=null; 
		try {
			 pr = conn.prepareStatement(sql);
			 ArrayList<Student> li= new ArrayList<Student>(); 
			 re = pr.executeQuery();
		while(re.next()) {
			Student stu = new Student();
			stu.setId(re.getInt(1)); 
			stu.setUsername(re.getString(2));
			stu.setPassword(re.getString(3));
			stu.setSex(re.getString(4).charAt(0));
			stu.setBirthday(new Date(re.getDate(5).getTime()));
			li.add(stu);
		}
		return li;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			jd.close(re,pr,conn);
		}
		return null;
	}

	@Override
	public Student queryById(int id) {
		// TODO Auto-generated method stub
		Connection conn = Jdbc.connetion();
		Jdbc jd = new Jdbc();
		String sql = "select * from StudentG where id = ?";
		PreparedStatement pr=null;
		ResultSet re=null;
		try {
			pr = conn.prepareStatement(sql);
			pr.setInt(1,id);
			re =  pr.executeQuery();
			Student stu = new Student();
			while(re.next()) {
				stu.setId(re.getInt(1));
				stu.setUsername(re.getString(2));
				stu.setPassword(re.getString(3));
				stu.setSex(re.getString(4).charAt(0));
				stu.setBirthday(new Date(re.getDate(5).getTime()));
			}
			return stu;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			jd.close(re, pr, conn);
		}
		return null;
	}

	@Override
	public boolean add(Student u) {
		Connection conn = Jdbc.connetion();
		Jdbc jd = new Jdbc();
		String sql = "insert into StudentG (id,username,password,sex,birthday) values(?,?,?,?,?)";
		PreparedStatement pr=null;
		try {
			pr = conn.prepareStatement(sql);
			pr.setInt(1,u.getId());
			pr.setString(2, u.getUsername());
			pr.setString(3,u.getPassword());
			pr.setString(4,String.valueOf(u.getSex()));
			pr.setDate(5,new Date(u.getBirthday().getTime()));
		    int i = pr.executeUpdate();
			if(i>0) {
			return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			jd.close(null, pr, conn);
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify(Student u, int id) {
		Connection conn = Jdbc.connetion();
		Jdbc jd = new Jdbc();
		String sql = "update Studentg set username=?,password=?,sex=?,birthday=?,id = ? where id=?";
		PreparedStatement pr=null;
		try {
			pr = conn.prepareStatement(sql);
			pr.setString(1,u.getUsername());
			pr.setString(2,u.getPassword());
			pr.setString(3,String.valueOf(u.getSex()));
			pr.setDate(4,new Date(u.getBirthday().getTime()));
			pr.setInt(5, u.getId());
			pr.setInt(6,id);
			int i = pr.executeUpdate();
			if(i>0) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			jd.close(null, pr, conn);
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delById(int id) {
		Connection conn = Jdbc.connetion();
		Jdbc jd = new Jdbc();
		String sql = "delete from Studentg where id = ?";
		PreparedStatement pr=null;
		try {
			pr = conn.prepareStatement(sql);
			pr.setInt(1,id);
			int i= pr.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			finally {
			jd.close(null, pr, conn);
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void charge(int a) {
		Connection conn = Jdbc.connetion();
		Jdbc jd = new Jdbc();
		String sql = "select * from studentg limit "+(a-1)*3+", 3";
		PreparedStatement pr = null;
		ResultSet re = null;
		try {
			pr = conn.prepareStatement(sql);
			re = pr.executeQuery();
			while (re.next()) {
				System.out.println(re.getInt("id") + "   " + re.getString("username") + "    " + re.getDate("birthday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jd.close(re, pr, conn);
		}
	}
}

