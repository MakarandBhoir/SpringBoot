package org.makarands.boot.services;

import org.makarands.boot.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
    @Bean(name="user")
    public User user(){
        return new User("Makarand","Bhoir");
    }

	@Override
	public String toString() {
		return "user service.";
	}
}
