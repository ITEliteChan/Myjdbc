package com.rf.ch.dao;

import java.util.List;

import com.rf.ch.entity.Student;

public interface StudentDao {

	public boolean login(String username ,String password);//登录接口，传入username和password的值，返回一个布尔类型
	public List<Student> query();//List返回一个Student的集合 ，query（）查询所有的
	public Student queryById(int id);//用户输入的id
	public boolean add(Student u);
	public boolean modify(Student u,int id);
	public boolean delById(int id);
	public void charge(int a);
}
