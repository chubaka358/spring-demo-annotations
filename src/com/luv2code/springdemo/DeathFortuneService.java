package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

public class DeathFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Perfect day to die";
	}

}
