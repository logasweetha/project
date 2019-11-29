package com.bankapp.model.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_table")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double balence;

	private AccountType accountType;

	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Customer customer;

	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Transactional> transactional = new ArrayList<Transactional>();

	//public void addTransactional(Transactional tx) {
		//transactional.add(tx);
		//tx.set}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Transactional> getTransactional() {
		return transactional;
	}

	public void setTransactional(List<Transactional> transactional) {
		this.transactional = transactional;
	}

	public Account(double balence, AccountType accountType, Customer customer, List<Transactional> transactional) {
		super();
		this.balence = balence;
		this.accountType = accountType;
		this.customer = customer;
		this.transactional = transactional;
	}

	public Account() {
		super();

	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balence=" + balence + ", accountType=" + accountType + ", customer=" + customer
				+ ", transactional=" + transactional + "]";
	}

}
