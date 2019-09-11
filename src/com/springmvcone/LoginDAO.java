package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("loginDAO")
public class LoginDAO {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public List<User> findAll(){
		
		String query = "select * from users";
		
		return jdbctemplate.query(query, new BeanPropertyRowMapper<User>(User.class));
		
	}
	

}
