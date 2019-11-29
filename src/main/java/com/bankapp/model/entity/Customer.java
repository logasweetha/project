package com.bankapp.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "customer_table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int phone;
	private String email;
	@JoinColumn(name = "cid")
	@OneToOne
	private Address address;
//@OneToOne
	private AccountType accountType;

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer(String name, int phone, String email, Address address, AccountType accountType) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.accountType = accountType;
	}

	public Customer() {
		super();

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", accountType=" + accountType + "]";
	}

}
