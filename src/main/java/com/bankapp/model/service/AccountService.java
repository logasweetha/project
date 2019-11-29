package com.bankapp.model.service;

import com.bankapp.model.entity.Account;

public interface AccountService {
	public void addAccount(Account account);
	public Account findByBalence(int balence);
}
