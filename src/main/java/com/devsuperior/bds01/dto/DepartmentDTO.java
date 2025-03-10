package com.devsuperior.bds01.dto;

import java.io.Serializable;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO implements Serializable {
	private static final long serialVersionUID = 8606549653896788793L;
	public Long id;
	public String name;
	
	public DepartmentDTO() {
		
	}
	
	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department dept) {
		this.id = dept.getId();
		this.name = dept.getName();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
