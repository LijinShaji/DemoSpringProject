package com.scaler.demo.project.demoProd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoProductApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoProductApplication.class, args);
		List<String> beans= List.of(context.getBeanDefinitionNames());
		for(String beanName:beans){
			System.out.println("Bean: ---- "+beanName);

		}
	}

}
