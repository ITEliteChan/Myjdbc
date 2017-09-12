package com.rf.ch.dao;

import java.util.List;

import com.rf.ch.entity.Student;

public interface StudentDao {

	public boolean login(String username ,String password);//��¼�ӿڣ�����username��password��ֵ������һ����������
	public List<Student> query();//List����һ��Student�ļ��� ��query������ѯ���е�
	public Student queryById(int id);//�û������id
	public boolean add(Student u);
	public boolean modify(Student u,int id);
	public boolean delById(int id);
	public void charge(int a);
}
