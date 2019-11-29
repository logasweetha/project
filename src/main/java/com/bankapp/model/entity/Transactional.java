package com.bankapp.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trans_table")
public class Transactional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime timestamp;
	private Long fromAccount;
	private Long toAccount;
	//private String txType;
	private double txamount;
	private String clerkName;
	//private String status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Long getToAccount() {
		return toAccount;
	}
	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}

	public double getTxamount() {
		return txamount;
	}
	public void setTxamount(double txamount) {
		this.txamount = txamount;
	}
	public String getClerkName() {
		return clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public Transactional(LocalDateTime timestamp, Long fromAccount, Long toAccount, double txamount, String clerkName) {
		super();
		this.timestamp = LocalDateTime.now();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.txamount = txamount;
		this.clerkName = clerkName;
	}
	public Transactional() {
		super();
		
	}
	@Override
	public String toString() {
		return "Transactional [id=" + id + ", timestamp=" + timestamp + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + ", txamount=" + txamount + ", clerkName=" + clerkName + "]";
	}
	
	
	
}
