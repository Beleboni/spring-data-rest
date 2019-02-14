package br.com.belini.springdatarest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.belini.springdatarest.repository.UserEventHandler;

@Configuration
public class RepositoryConfiguration {
	
	@Bean
	UserEventHandler userEventHandler(){
		return new UserEventHandler();
	}

}
