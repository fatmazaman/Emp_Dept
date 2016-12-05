package com.fatmazaman.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
@SecondaryTable(name = "Employee", pkJoinColumns=@PrimaryKeyJoinColumn( name = "name"))

public class Dept implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "min_sal")
	private long Min_Sal;
	
	@Column(name = "max_sal")
	private long Max_Sal;

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

	public long getMin_Sal() {
		return Min_Sal;
	}

	public void setMin_Sal(long min_Sal) {
		Min_Sal = min_Sal;
	}

	public long getMax_Sal() {
		return Max_Sal;
	}

	public void setMax_Sal(long max_Sal) {
		Max_Sal = max_Sal;
	}
}

