package com.nissan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.nissan.service.IFortune;

public class B_DemoSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Fortune tester app
		IFortune f1= context.getBean("fortuneMaker",IFortune.class);
		System.out.println(f1.getFortune());
	
		
	}

}
