package com.demo.springboot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Entity for Customer
 */
@Entity
@Table(name="Customer")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CUSTOMERID",unique=true,nullable=false)
	private String customerId;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LastNAME")
	private String lastName;
	
	@OneToMany(mappedBy= "customer")
	private List<Rating> rating;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String firstName, String lastName, List<Rating> rating) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rating = rating;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}

	

}
