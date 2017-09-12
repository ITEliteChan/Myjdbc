package com.rf.ch.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.rf.ch.dao.Jdbc;
import com.rf.ch.dao.impl.StudentDaoImpl;
import com.rf.ch.entity.Student;
import com.rf.ch.service.impl.StudentServiceImpl;
import com.rf.ch.view.View;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("--------1.添加学生信息  2.删除学生信息  3.查询学生信息  4.查询某个学生信息  5.修改学生信息  6.分页查询 7.退出系统--------");
		Scanner sc = new Scanner(System.in);
		StudentServiceImpl sl = new StudentServiceImpl();
		while (true) {
			View vi = new View();
			int a = sc.nextInt();
			switch (a) {
			case 1:
				vi.add();
				System.out.println("已添加学生信息");
				break;
			case 2:vi.delById();
			System.out.println("已删除学生信息");
				break;
			case 3:vi.query();
				break;
			case 4:vi.queryById();
				break;
			case 5:vi.modify();
				break;
			case 6 :
				System.out.println("请输入页数");
				String si = sc.next();
				sl.charge(Integer.parseInt(si));
			break;
			case 7:vi.exit();
			break;
			}
		}
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//		StudentServiceImpl sl = new StudentServiceImpl();
//		Student st = new Student();
//		// 登录
//		sl.login("张三", "123456");
//		
//		// 全部查询
//		ArrayList<Student> li = (sl.query());
//		for (Student l : li) {
//			System.out.println(l.getId() + "*** " + l.getUsername() + "***" + l.getPassword() + "***" + l.getSex() + "***"
//					+ sdf.format(l.getBirthday()) + "\t");
//		}
//		//通过ID查询
//		Student stu = sl.queryById(2);
//		System.out.println(stu.getId() + "***" + stu.getUsername() + "***" + stu.getPassword() + "***" + stu.getSex() + "***"
//				+ sdf.format(stu.getBirthday()) + "\t");
//		//添加
//		st.setId(8);
//		st.setUsername("王五");
//		st.setPassword("159");
//		st.setSex('女');
//		try {
//			st.setBirthday(sdf.parse("1994年11月03日"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		sl.add(st);
//		
//		//修改
//	Student si = new Student();
//	
//	si.setUsername("赵七七");
//	si.setPassword("125");
//	si.setSex('男');
//	try {
//		si.setBirthday(sdf.parse("1994年11月03日"));
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	sl.modify(si, 2);
//	
//		//删除
//	sl.delById(8);
	
}

}
