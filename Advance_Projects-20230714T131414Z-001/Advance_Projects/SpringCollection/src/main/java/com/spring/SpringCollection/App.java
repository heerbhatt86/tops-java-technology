package com.spring.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
        Customer c=a.getBean("p2",Customer.class);
        System.out.println(c);
        
    }
}
