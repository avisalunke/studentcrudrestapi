package com.studentcruudapi.Codes.services;

import java.util.List;

import com.studentcruudapi.Codes.Entity.student;

public interface CrudService {

	List<student> getdata();

	String deletedata(int parseInt);

	student adddata(student std);

	student updatedata(int parseInt, student sts);

}
