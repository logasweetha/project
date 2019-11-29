package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Long>{
public Address findByCity(String city);
}
