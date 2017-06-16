package org.makarands.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableConfigurationProperties
public class ConfigpropsApplication 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = SpringApplication.run(ConfigpropsApplication.class, args);

        MyAppConfig config = (MyAppConfig) context.getBean("myAppConfig");
        System.out.println(config.toString());
    }
}
