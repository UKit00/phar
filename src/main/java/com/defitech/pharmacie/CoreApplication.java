package com.defitech.pharmacie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

//	@Bean
//	public Hibernate5Module datatypeHibernateModule(){
//		return new Hibernate5Module();
//	}
}
