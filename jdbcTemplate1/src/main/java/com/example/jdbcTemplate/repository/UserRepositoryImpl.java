package com.example.jdbcTemplate.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.jdbcTemplate1.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	protected JdbcTemplate jdbcTemplate;
	private RowMapper<User> rowMapper = new UserRowMapper();
	
	@Autowired
	public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User findById(Long id) {
		String sql = "select id, username, password, email from user where id = ?" ;
		User user = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return user;
	}
	
	class UserRowMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			Long id = rs.getLong("ID");
			String username = rs.getString("USERNAME");
			String password = rs.getString("PASSWORD");
			String email = rs.getString("EMAIL");
			User user = new User();
			user.setId(id);
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			return user;
		}
		
	}

}
