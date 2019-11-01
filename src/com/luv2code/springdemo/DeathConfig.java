package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeathConfig {

	@Bean
	public FortuneService fortuneService() {
		return new DeathFortuneService();
	}
	
	@Bean
	public Coach deathCoach() {
		return new DeathCoach(fortuneService());
	}
}
