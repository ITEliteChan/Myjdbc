package com.rf.ch.service;

import java.util.ArrayList;
import java.util.List;

import com.rf.ch.entity.Student;

public interface StudentService {

	public boolean login(String username ,String password);
	public ArrayList<Student> query();
	public Student queryById(int id);
	public boolean add(Student u);
	public boolean modify(Student u,int id);
	public boolean delById(int id);
	public void charge(int a);
}
