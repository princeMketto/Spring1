package com.jumaSpring.juma;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JumaApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(JumaApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(ManConfig.class);
		MainScreen mainScreen = (MainScreen) context.getBean(MainScreen.class);
		mainScreen.start();
	}
}
