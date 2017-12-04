package com.tutorialspoint;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      try {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		  obj.getMessage();
		  
		  AddIvo add = (AddIvo) context.getBean("ivohelloWorld");
		  add.setA(10);
		  add.setB(20);
		  System.out.println("The value is: "+add.AddIvo());
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
