package org.makarands.boot.services;

import org.makarands.boot.model.User;
import org.makarands.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService 
{
	@Autowired
	private UserRepository repository;
	
	public void addUser(User user)
	{
		repository.create(user);
	}
}
