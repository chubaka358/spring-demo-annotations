package com.luv2code.springdemo;

public class DeathCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public DeathCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Just die today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
