package com.spring.DiByObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
        Person p=a.getBean("Person",Person.class);
        p.callphone();
    }
}
