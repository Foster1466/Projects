package com.assignment.task6.applicationRestPost;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	@PostMapping("/employee")
	public String saveEmp(@RequestBody Employee emp) {
		System.out.println(emp.getEmp_id());
		System.out.println(emp.getName());
		System.out.println(emp.getDept());
		return "Data Stored";
	}
	

}
