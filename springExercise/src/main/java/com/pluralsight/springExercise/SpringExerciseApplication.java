package com.pluralsight.springExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExerciseApplication.class, args);
        ApplicationContext ac = SpringApplication.run(SpringExerciseApplication.class, args);
        for(String beanName : ac.getBeanDefinitionNames()) {
            System.out.println("Bean: " + beanName);
        }
	}

}
