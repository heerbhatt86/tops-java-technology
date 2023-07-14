package com.spring.SprigHello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      AbstractApplicationContext a= new ClassPathXmlApplicationContext("beans.xml");
      Student s1 =a.getBean("s1",Student.class);
      System.out.println(s1);
      a.registerShutdownHook();
      
    }
}
