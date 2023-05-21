package com.assignment.task5.applicationRest;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	@GetMapping ("/employee")
	public Employee getEmp(){
		Employee emp = new Employee(1, "John", "IT");
		
		return emp;
		
	}

}
