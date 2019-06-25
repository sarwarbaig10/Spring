package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring/beans.xml");
		Employee obj = (Employee) context.getBean("emp");
		System.out.println(obj.getAddress()+" "+obj.getEmpid()+" "+obj.getName()+" "+obj.getSalary());
	}

}