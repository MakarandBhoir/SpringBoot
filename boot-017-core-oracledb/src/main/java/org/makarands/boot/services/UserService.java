package org.makarands.boot.services;

import java.util.List;

import org.makarands.boot.model.User;
import org.makarands.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService 
{
	public User addUser(User user);
	public List<User> readUsers();
	public User updateUser(User user);
	public void deleteUser(User user);
}
