package com.example.jdbcTemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jdbcTemplate.repository.UserRepository;
import com.example.jdbcTemplate1.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		User user = userRepository.findById(id);
		return user;
	}

}
