package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Movie obj = (Movie) context.getBean("mov");
		System.out.println(obj.getMovieActor()+"   "+obj.getMovieId()+"    "+obj.getMovieName());
	}

}
