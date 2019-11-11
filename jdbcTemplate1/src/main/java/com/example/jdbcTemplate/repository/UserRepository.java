package com.example.jdbcTemplate.repository;

import com.example.jdbcTemplate1.entity.User;

public interface UserRepository {

	User findById(Long id);
}
