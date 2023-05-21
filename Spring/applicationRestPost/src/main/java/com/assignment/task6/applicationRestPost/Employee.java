package com.assignment.task6.applicationRestPost;

public class Employee {
	
	private int emp_id;
	private String name;
	private String dept;
	
	
	public Employee(int emp_id, String name, String dept) {
		this.emp_id = emp_id;
		this.name = name;
		this.dept = dept;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	 
	

}
