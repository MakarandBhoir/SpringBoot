package org.makarands.boot.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.makarands.boot.model.User;
import org.makarands.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService 
{
	Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public User addUser(User user) {		
		User result = repository.create(user);
		logger.info("User Added successfully. ");
		return result;
	}
	@Override
	public List<User> readUsers() {
		return repository.read();
	}
	@Override
	public User updateUser(User user) {
		return null;
	}
	@Override
	public void deleteUser(User user) {
		repository.delete(user);
	}
}
