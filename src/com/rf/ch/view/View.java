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
		System.out.println("������ID");
		int id =sc.nextInt();
		System.out.println("����������");
		String username=sc.next();
		System.out.println("����������");
		String password=sc.next();
		System.out.println("�������Ա�");
		String sex = sc.next();
		System.out.println("����������");
		String birthday= sc.next();
		try {
			st = new Student(id,username,password,sex.charAt(0),sdf.parse(birthday));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(stu.add(st)) {
			System.out.println("��ӳɹ�");
		}else {
			System.out.println("���ʧ��");
		}
		
	}
	public void delById() {
		StudentServiceImpl stu = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("������id");
		int id = sc.nextInt();		
		if(stu.delById(id)) {
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("ɾ��ʧ��");
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
		System.out.println("������Ҫ��ѯid");
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
		System.out.println("������Ҫ�޸ĵ�ID");
		int uid = sc.nextInt();
		System.out.println("������ID");
		int id = sc.nextInt();
		System.out.println("����������");
		String username = sc.next();
		System.out.println("����������");
		String password = sc.next();
		System.out.println("�������Ա�");
		String sex = sc.next();
		System.out.println("����������");
		String birthday = sc.next();
	    try {
			st = new Student(id,username,password,sex.charAt(0),sdf.parse(birthday));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(stu.modify(st, uid)) {
	    	System.out.println("�޸ĳɹ�");
	    }else {
	    	System.out.println("�޸�ʧ��");
	    }
	}
	
	public void exit() {
		System.out.println("�����˳�ϵͳ");
		System.exit(0);
	}
	
}
