package org.makarands.boot;

import org.makarands.boot.services.EmployeeService;
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

        EmployeeService service = (EmployeeService) context.getBean("empService");
       
        /*Get all employees information*/
        /*List<Employee> list = service.viewAll();           
        for(Employee emp : list)
        {
    	    System.out.println("Id="+emp.getEid());
        }*/
       
       /*get one employee information*/
       /*System.out.println(service.view(100));*/
        
        /*search all employee by fname*/
        /*System.out.println(service.searchByFname("Steven"));*/
        
        /*search all employee by mgr*/
        /*System.out.println(service.searchByMgr(100));*/
        
        /*serarch employee based on firstname and lastname*/
       /* System.out.println(service.searchByFnameAndLname("Kevin", "Feeney"));*/
        
        /*serarch employee based on firstname or lastname*/
        /*System.out.println(service.searchByFnameOrLname("Kevin", "Jaxson"));*/
        
        /*System.out.println(service.searchByFnameOrLnameAllIgnoreCase("kevin", "skssk"));*/
        /*System.out.println(service.searchByFnameOrderBySalaryDesc("Kevin"));*/
        System.out.println(service.searchByMgrIsNull());
    }
}
