package com.capgemini.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.capgemini.demo.model.CustomUserDetails;
import com.capgemini.demo.model.Users;
import com.capgemini.demo.repositories.UsersRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> optionalUsers = usersRepository.findByName(username);
		optionalUsers
				.orElseThrow(() -> new UsernameNotFoundException("Username not found"));
		return optionalUsers
				.map(CustomUserDetails::new).get();
	}
}
