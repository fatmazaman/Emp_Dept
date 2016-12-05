package com.fatmazaman.dto.model;

import java.io.Serializable;




public class DeptDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int id;
	
	
	private String name;
	
	
	private long Min_Sal;
	
	
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

