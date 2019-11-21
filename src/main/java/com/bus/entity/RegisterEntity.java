package com.bus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class RegisterEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sq")
	@SequenceGenerator(name="sq",sequenceName="sqa")
	private int Customer_ID;
	
	@Column(name="Name")
	private String Name;
	
	
	@Column(name="Email_ID")
	private String Email_ID;
	
	@Column(name="Phone")
	private long Phone;

	public int getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail_ID() {
		return Email_ID;
	}

	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}
	
	
	
	
	
	
	
	
	
}
