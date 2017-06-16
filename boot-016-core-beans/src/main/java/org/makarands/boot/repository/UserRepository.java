package org.makarands.boot.repository;

import java.util.List;

import org.makarands.boot.model.User;
import org.springframework.stereotype.Repository;

public interface UserRepository 
{
	public User create(User user);
	public List<User> read();
	public User update(User user);
	public void delete(User user);
}
