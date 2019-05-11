package com.ashishre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO  {
	
	public static ResultSet getResultSet(String query) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://ashishre:3306/test","root","root");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		if(rs.next()) {			
			return  rs;
		}
		else 
			return null;
	}

	public Employee serachEmployee(int id) throws Exception {
		
		String sqlQuery = "Select * from Employee where id="+id;//JDBC connection
		//get Record
		ResultSet rs = EmployeeDAO.getResultSet(sqlQuery);
		if(rs != null) {
			return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));	
		}
		else 
			return null;	
	}

	public List<Employee> listEmployee() throws Exception {
		// TODO Auto-generated method stub
		List<Employee> empList = null;
		String sqlQuery = "Select * from Employee";//JDBC connection
		//get Record
		ResultSet rs = EmployeeDAO.getResultSet(sqlQuery);
		if(rs != null) {
			empList = new ArrayList<Employee>();
			while(rs.next()) {
				empList.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			return empList;					
		}
		else 
			return null;
	}

}
