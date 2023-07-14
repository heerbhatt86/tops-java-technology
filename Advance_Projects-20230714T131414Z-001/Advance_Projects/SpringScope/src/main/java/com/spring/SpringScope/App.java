package com.spring.SpringScope;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;


public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext a= new ClassPathXmlApplicationContext("beans.xml");
     Student s1=a.getBean("s1",Student.class);
     s1.setId(1);
     s1.setFname("heer");
     s1.setLname("bhatt");
     s1.setEmail("heer@gmail");
     
     System.out.println(s1);
     Student s2=a.getBean("s1",Student.class);
     System.out.println(s2);
     
     
    }
}
