package org.makarands.boot;

import org.apache.log4j.Logger;
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
		Logger logger = Logger.getLogger(SpringBeansApplication.class);
        ApplicationContext context = SpringApplication.run(SpringBeansApplication.class, args);

        UserService service = context.getBean(UserService.class);
        User user = context.getBean(User.class);
        user.setFirstName("Makarand");
        user.setLastName("Bhoir");
        user.setEmailAddress("bhoir.makarand@gmail.com");
        
        logger.info("Adding User using addUser service");
        service.addUser(user);        
        System.out.println("User Added");
        
        System.out.println("Before Removing: " + service.readUsers());
        service.deleteUser(user);
        System.out.println("After Removing: " + service.readUsers());
    }
}
