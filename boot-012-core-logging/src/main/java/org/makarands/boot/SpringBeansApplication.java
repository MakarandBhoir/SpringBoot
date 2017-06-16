package org.makarands.boot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"org.makarands.boot"})
@EnableAutoConfiguration
@Configuration
public class SpringBeansApplication {

    @Bean(name="user")
    public User user(){
        return new User("Makarand","Bhoir");
    }

    //private static Logger logger = Logger.getLogger("MyLogger");
    private static Logger logger = Logger.getLogger(SpringBeansApplication.class);
    public static void main(String[] args) 
    {
        ApplicationContext context = SpringApplication.run(SpringBeansApplication.class, args);
        logger.info(context.getBean("user").toString().toUpperCase());

    }
}
