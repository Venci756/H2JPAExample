package com.learning.jpa.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table - User

@Entity
public class User {
	protected User() {
		
	}
//	JPA expects a default constructor
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
}
