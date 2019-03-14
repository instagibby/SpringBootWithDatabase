package home.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import home.beans.Owner;
import home.beans.Pet;


@Configuration
public class BeanConfiguration {
	
	@Bean
	public Pet pet() {
		Pet bean = new Pet("Momo", "Tabby", 3);
		bean.setOwner(owner());
		return bean;
	}

	@Bean
	public Owner owner() {
		Owner bean = new Owner("Spencer", "Davis");
		return bean;
	}


}
