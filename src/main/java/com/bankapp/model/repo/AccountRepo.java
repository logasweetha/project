package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entity.Account;
@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{
	
	public Account findByBalence(double balence);
}
