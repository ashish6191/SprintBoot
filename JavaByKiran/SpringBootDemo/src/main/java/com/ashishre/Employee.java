package com.ashishre;

public class Employee {

	private int eid;
	private String name;
	private String loc;
	
	public Employee(int eid, String name, String loc) {
		super();
		this.eid = eid;
		this.name = name;
		this.loc = loc;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
