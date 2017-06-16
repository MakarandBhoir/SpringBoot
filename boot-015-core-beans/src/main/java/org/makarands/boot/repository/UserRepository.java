package org.makarands.boot.repository;

import org.makarands.boot.model.User;
import org.springframework.stereotype.Repository;

@Repository(value="userRepo")
public class UserRepository 
{
	public void create(User user)
	{
		System.out.println(user);
		System.out.println("User Created.");
	}
}
