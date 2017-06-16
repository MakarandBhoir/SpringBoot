package org.makarands.boot.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.makarands.boot.model.User;
import org.springframework.stereotype.Repository;
@Repository(value="userRepo")
public class UserRepositoryImpl implements UserRepository
{
	private static List<User> users;
	
	static
	{
		users = new ArrayList<User>();
	}
	@Override
	public User create(User user) {
		if(users.add(user))
			return user;
		else
			return null;
	}
	@Override
	public List<User> read() {
		return users;
	}
	@Override
	public User update(User user) {
		return null;
	}
	@Override
	public void delete(User user) {
		users.remove(user);		
	}
}
