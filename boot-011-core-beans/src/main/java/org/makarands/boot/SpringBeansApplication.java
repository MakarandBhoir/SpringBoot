package org.makarands.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan//({"org.makarands.boot", "org.makarands.repository"})
@EnableAutoConfiguration
@Configuration
public class SpringBeansApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBeansApplication.class, args);

        System.out.println( context.getBean("user").toString().toUpperCase() );
        System.out.println( context.getBean("userService").toString().toUpperCase() );
        System.out.println( context.getBean("userRepo").toString().toUpperCase() );
        

    }
}

