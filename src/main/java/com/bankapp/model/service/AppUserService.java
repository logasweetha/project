package com.bankapp.model.service;
import java.util.*;
import com.bankapp.model.entity.AppUser;

public interface AppUserService {
public void addAppUser(AppUser user);
public AppUser findByEmail(String email);
public List<AppUserService> findAll();
public void blockUser(Long id);

}
