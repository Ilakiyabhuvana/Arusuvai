package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login_fd")
public class Foodentity {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
    private String email;
    private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Foodentity [id=" + id + ", username=" + username + ", email=" + email
				+ ", password=" + password + "]";
	}
	public Foodentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Foodentity(int id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		
		this.email = email;
		this.password = password;
	}
    
}
