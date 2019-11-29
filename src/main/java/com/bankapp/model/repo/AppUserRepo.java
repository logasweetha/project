package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entity.AppUser;
@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long>{
public AppUser findByEmail(String email);
}
