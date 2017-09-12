package com.rf.ch.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.rf.ch.dao.impl.StudentDaoImpl;
import com.rf.ch.entity.Student;
import com.rf.ch.service.StudentService;
//这里是访问Dao层，是业务逻辑
public class StudentServiceImpl implements StudentService{
   StudentDaoImpl su = new StudentDaoImpl();
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return su.login(username, password);
	}

	@Override
	public ArrayList<Student> query() {
		// TODO Auto-generated method stub
		return su.query();
	}

	@Override
	public Student queryById(int id) {
		// TODO Auto-generated method stub
		return su.queryById(id);
	}

	@Override
	public boolean add(Student u) {
		// TODO Auto-generated method stub
		return su.add(u);
	}

	@Override
	public boolean modify(Student u, int id) {
		// TODO Auto-generated method stub
		return su.modify(u, id);
	}

	@Override
	public boolean delById(int id) {
		// TODO Auto-generated method stub
		return su.delById(id);
	}

	public void charge(int a) {
		 su.charge(a);
	}

	
}
