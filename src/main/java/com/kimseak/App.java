package com.kimseak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Student student = (Student) applicationContext.getBean("student_bean");
		
		student.showInfo();
		
		
		
	}
}
