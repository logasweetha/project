package com.bankapp.model.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entity.AppUser;
import com.bankapp.model.entity.Transactional;
@Repository
public interface TransactionalRepo extends JpaRepository<AppUser, Long>{
//List<Transactional> findAll();
}
