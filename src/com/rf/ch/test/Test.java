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
		
		System.out.println("--------1.���ѧ����Ϣ  2.ɾ��ѧ����Ϣ  3.��ѯѧ����Ϣ  4.��ѯĳ��ѧ����Ϣ  5.�޸�ѧ����Ϣ  6.��ҳ��ѯ 7.�˳�ϵͳ--------");
		Scanner sc = new Scanner(System.in);
		StudentServiceImpl sl = new StudentServiceImpl();
		while (true) {
			View vi = new View();
			int a = sc.nextInt();
			switch (a) {
			case 1:
				vi.add();
				System.out.println("�����ѧ����Ϣ");
				break;
			case 2:vi.delById();
			System.out.println("��ɾ��ѧ����Ϣ");
				break;
			case 3:vi.query();
				break;
			case 4:vi.queryById();
				break;
			case 5:vi.modify();
				break;
			case 6 :
				System.out.println("������ҳ��");
				String si = sc.next();
				sl.charge(Integer.parseInt(si));
			break;
			case 7:vi.exit();
			break;
			}
		}
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
//		StudentServiceImpl sl = new StudentServiceImpl();
//		Student st = new Student();
//		// ��¼
//		sl.login("����", "123456");
//		
//		// ȫ����ѯ
//		ArrayList<Student> li = (sl.query());
//		for (Student l : li) {
//			System.out.println(l.getId() + "*** " + l.getUsername() + "***" + l.getPassword() + "***" + l.getSex() + "***"
//					+ sdf.format(l.getBirthday()) + "\t");
//		}
//		//ͨ��ID��ѯ
//		Student stu = sl.queryById(2);
//		System.out.println(stu.getId() + "***" + stu.getUsername() + "***" + stu.getPassword() + "***" + stu.getSex() + "***"
//				+ sdf.format(stu.getBirthday()) + "\t");
//		//���
//		st.setId(8);
//		st.setUsername("����");
//		st.setPassword("159");
//		st.setSex('Ů');
//		try {
//			st.setBirthday(sdf.parse("1994��11��03��"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		sl.add(st);
//		
//		//�޸�
//	Student si = new Student();
//	
//	si.setUsername("������");
//	si.setPassword("125");
//	si.setSex('��');
//	try {
//		si.setBirthday(sdf.parse("1994��11��03��"));
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	sl.modify(si, 2);
//	
//		//ɾ��
//	sl.delById(8);
	
}

}
