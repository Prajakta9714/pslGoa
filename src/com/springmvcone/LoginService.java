package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {
	
	@Autowired
	private LoginDAO loginDao;

	public boolean check(String uname,String password) {
		
		List<User> users = loginDao.findAll();
		
		
		for(User user : users) {
			if(user.getName().equals(uname) && user.getPassword().equals(password))
				return true;
		}
		
			return false;
		
		}
	
}


