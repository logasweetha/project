package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import com.bankapp.model.entity.AppUser;
import com.bankapp.model.repo.AppUserRepo;
import com.bankapp.model.service.AppUserService;

@SpringBootApplication
public class SpringSrcApplication implements CommandLineRunner {

	@Autowired
	private AppUserService appUserService;

	public static void main(String[] args) {
		SpringApplication.run(SpringSrcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		appUserService.addAppUser(new AppUser("raj", "raj", "raj@gmail.com", true,
				new String[] { "ROLE_ADMIN", "ROLE_MGR", "ROLE_CLERK" }, true));

		appUserService.addAppUser(
				new AppUser("loga", "loga", "loga@gmail.com", true, new String[] { "ROLE_MGR", "ROLE_CLERK" }, true));

		appUserService.addAppUser(new AppUser("swee", "swee", "swee@gmail.com", true, new String[] { "ROLE_CLERK" }, true));

		System.out.println("........................................");
		
		//AppUserRepo.save();
		
		

		/*
		 * AppUser appUser=appUserService.findByEmail("raj@gmail.com");
		 * System.out.println(appUser.getEmail());
		 * System.out.println((e)->e.getEmail());
		 */
	}

}
