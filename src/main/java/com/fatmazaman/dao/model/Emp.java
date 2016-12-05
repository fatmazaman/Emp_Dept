package com.fatmazaman.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
@SecondaryTable(name = "Dept", pkJoinColumns=@PrimaryKeyJoinColumn( name = "id"))

public class Emp implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Manager_Name")
	private String manager_name;
	
	@Column(name = "dept_name")
	private String Dept_Name;
	
	@Column(name = "salary")
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