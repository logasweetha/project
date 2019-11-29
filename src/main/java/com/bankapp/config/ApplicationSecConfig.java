package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

@EnableWebSecurity
public class ApplicationSecConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService detailService;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(detailService);

	}

	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	private BasicAuthenticationEntryPoint authEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
				.antMatchers("/admin/**").hasAnyRole("ADMIN").antMatchers("/mgr/**").hasAnyRole("MGR", "ADMIN")
				.antMatchers("/clerk/**").hasAnyRole("ADMIN", "MGR", "CLERK").and().httpBasic()
				.authenticationEntryPoint(authEntryPoint);

	}

}
