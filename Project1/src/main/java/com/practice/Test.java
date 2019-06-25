package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Test {  
public static void main(String[] args) {  
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring/application-context.xml");
	Student student = (Student) context.getBean("studentbean1");
     student.displayInfo();  
}  
}  