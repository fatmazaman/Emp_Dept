package com.fatmazaman.dto.model;

import java.io.Serializable;

public class EmpDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int id;
	
	private String name;
	
	
	private String manager_name;
	
	
	private String Dept_Name;
	
	
	private long Salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getDept_Name() {
		return Dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}
}