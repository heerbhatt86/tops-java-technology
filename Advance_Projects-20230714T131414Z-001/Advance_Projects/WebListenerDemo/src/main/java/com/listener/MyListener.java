package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyListener implements ServletContextListener {

   
 
    public void contextDestroyed(ServletContextEvent sce)  { 
    	
    	sce.getServletContext().getAttribute("counter");
    	System.out.println("Servlet context destroyed");
      
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
         
    	sce.getServletContext().getAttribute("counter");
    	System.out.println("Servlet context initialized");
    }
	
}
