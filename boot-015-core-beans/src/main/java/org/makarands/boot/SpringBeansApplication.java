package org.makarands.boot;

import org.makarands.boot.model.User;
import org.makarands.boot.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan//({"org.makarands.boot", "org.makarands.repository"})
@EnableAutoConfiguration
@Configuration

public class SpringBeansApplication 
{	
	public static void main(String[] args) 
	{
        ApplicationContext context = SpringApplication.run(SpringBeansApplication.class, args);

        UserService service = context.getBean(UserService.class);
        User user = context.getBean(User.class);
        user.setFirstName("Makarand");
        user.setLastName("Bhoir");
        user.setEmailAddress("bhoir.makarand@gmail.com");
        
        service.addUser(user);
    }
}
