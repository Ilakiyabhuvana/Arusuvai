package com.example.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Payment", schema="arusuvai")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String name;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String Address;
	@NotEmpty(message = "Please enter a valid email Id")
	private String city;
	@NotEmpty
   private String state;
	@Digits(integer = 6, fraction = 0, message = "Pincode must be a 6 digit number")
   private long pincode;
	@NotNull
   private long number;
	@NotEmpty
	private String status;
   public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
   
   
}
