package com.kimseak;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
	
	@Bean(name="student_bean")
	@Scope(scopeName="prototype")
	public Student getStudent(){
		return new Student();
	}
	
	@Bean(name="address_bean")
	public Address getAddress(){
		return new Address();
	}
	
	@Bean(name="1")
	public Address getAddress1(){
		return new Address("1");
	}
	
	@Bean(name="2")
	public Address getAddress2(){
		return new Address("2");
	}
	

	

}
