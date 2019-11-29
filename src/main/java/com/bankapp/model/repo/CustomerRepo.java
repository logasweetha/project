package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entity.AppUser;
@Repository
public interface CustomerRepo extends JpaRepository<AppUser, Long>{

}
