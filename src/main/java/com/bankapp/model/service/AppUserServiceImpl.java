package com.bankapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.entity.AppUser;
import com.bankapp.model.repo.AppUserRepo;

@Service
@Transactional
public class AppUserServiceImpl implements AppUserService{

	
	private AppUserRepo userRepo;
	
	
	@Autowired
	public AppUserServiceImpl(AppUserRepo userRepo) {
		
		this.userRepo = userRepo;
	}

	@Override
	public void addAppUser(AppUser user) {
		userRepo.save(user);
		
	}

	@Override
	public AppUser findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public List<AppUserService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void blockUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}
