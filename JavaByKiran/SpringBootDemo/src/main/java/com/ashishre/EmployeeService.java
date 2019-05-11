package com.ashishre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO ed;

	public Employee getEmployeeById(int id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("asdas"+id);
		return ed.serachEmployee(id);
	}

	public List<Employee> getEmployeeList() throws Exception {
		// TODO Auto-generated method stub
		return ed.listEmployee();
	}

	
}
