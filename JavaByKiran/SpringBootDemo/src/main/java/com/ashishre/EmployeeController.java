package com.ashishre;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService es;
	
	@RequestMapping("/home")
	String print() {
		return "Hello World";
	}
	
	//via jdbc
	@RequestMapping("/getEmployeeById")
	Employee getEmployee() throws Exception {
		return es.getEmployeeById(3);
		
	}
	
	//via jpa
	@RequestMapping("/employeeList")
	List<Employee> getEmployeeList() throws Exception {
		return es.getEmployeeList();
	}
}
