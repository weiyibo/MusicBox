package com.musicbox.dao;

import javax.persistence.*;

@Table(name="TEST_DEPARTMENTS")
@Entity
public class Department {
	private int id;
	private String name;
	
	@GeneratedValue
	@Id
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
	
	
}
