package com.rf.ch.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.rf.ch.entity.Student;
import com.rf.ch.service.impl.StudentServiceImpl;

public class View {

	public void add() {
		StudentServiceImpl stu = new StudentServiceImpl();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Student st=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入ID");
		int id =sc.nextInt();
		System.out.println("请输入姓名");
		String username=sc.next();
		System.out.println("请输入密码");
		String password=sc.next();
		System.out.println("请输入性别");
		String sex = sc.next();
		System.out.println("请输入生日");
		String birthday= sc.next();
		try {
			st = new Student(id,username,password,sex.charAt(0),sdf.parse(birthday));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(stu.add(st)) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
		
	}
	public void delById() {
		StudentServiceImpl stu = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入id");
		int id = sc.nextInt();		
		if(stu.delById(id)) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
	}
	public void query() {
		StudentServiceImpl stu = new StudentServiceImpl();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<Student> li = stu.query();
		for(Student u:li) {
			System.out.println(u.getId() + "*** " + u.getUsername() + "***" + u.getPassword() + "***" + u.getSex() + "***"
					+ sdf.format(u.getBirthday()) + "\t");
		}
		
	}
	
	public void queryById() {
		StudentServiceImpl stu = new StudentServiceImpl();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询id");
		int id = sc.nextInt();
		Student u = stu.queryById(id);
		
		System.out.println(u.getId() + "*** " + u.getUsername() + "***" + u.getPassword() + "***" + u.getSex() + "***"
				+ sdf.format(u.getBirthday()) + "\t");
	}
	public void modify() {
		StudentServiceImpl stu = new StudentServiceImpl();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Student st=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改的ID");
		int uid = sc.nextInt();
		System.out.println("请输入ID");
		int id = sc.nextInt();
		System.out.println("请输入姓名");
		String username = sc.next();
		System.out.println("请输入密码");
		String password = sc.next();
		System.out.println("请输入性别");
		String sex = sc.next();
		System.out.println("请输入生日");
		String birthday = sc.next();
	    try {
			st = new Student(id,username,password,sex.charAt(0),sdf.parse(birthday));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(stu.modify(st, uid)) {
	    	System.out.println("修改成功");
	    }else {
	    	System.out.println("修改失败");
	    }
	}
	
	public void exit() {
		System.out.println("您已退出系统");
		System.exit(0);
	}
	
}
