package com.studentcruudapi.Codes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentcruudapi.Codes.Entity.student;
import com.studentcruudapi.Codes.services.CrudService;

@RestController
public class StudentController {

	@Autowired
	CrudService crudservice;
	
	@GetMapping("/getdata")
	public List<student> getdata(){
		return this.crudservice.getdata();
	}
	
	@DeleteMapping("/deletedata/{rno}")
	public String deletedata(@PathVariable String rno) {
		return this.crudservice.deletedata(Integer.parseInt(rno));
	}
	
	@PostMapping("/adddata")
	public student adddata(@RequestBody student std) {
		return this.crudservice.adddata(std);
	}
	
	@PutMapping("/updatedata/{rno}")
	public student updatedata(@PathVariable String rno,@RequestBody student sts) {
		return this.crudservice.updatedata(Integer.parseInt(rno),sts);
	}
}
