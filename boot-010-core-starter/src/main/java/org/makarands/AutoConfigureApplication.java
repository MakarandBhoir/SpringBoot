package org.makarands;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AutoConfigureApplication 
{
    public static void main(String[] args) 
    {
        ApplicationContext context =  SpringApplication.run(AutoConfigureApplication.class, args);  
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for( String name : beanNames )
        {
            System.out.println("Name: "+name);
        }
    }
}
