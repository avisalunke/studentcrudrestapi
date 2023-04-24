package com.studentcruudapi.Codes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcruudapi.Codes.Dao.Dao;
import com.studentcruudapi.Codes.Entity.student;

@Service
public class CrudServicesImpl implements CrudService {

	@Autowired
	Dao dao;

	@Override
	public List<student> getdata() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String deletedata(int rno) {
		// TODO Auto-generated method stub
		dao.findById(rno);
		return "data deleted";
	}

	@Override
	public student adddata(student std) {
		// TODO Auto-generated method stub
		return dao.save(std);
	}

	@Override
	public student updatedata(int rno, student sts) {
		student updatedstudent = dao.findById(rno).get();
		updatedstudent.setPhno(sts.getPhno());
		updatedstudent.setName(sts.getName());
		updatedstudent.setEmail(sts.getEmail());
		dao.save(updatedstudent);
		return updatedstudent;
	}
	
	
}
