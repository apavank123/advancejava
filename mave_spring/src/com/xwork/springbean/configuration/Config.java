package com.xwork.springbean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xwork.springbean.bean.Actor;
import com.xwork.springbean.bean.Flower;
import com.xwork.springbean.bean.Rocket;

@Configuration
@ComponentScan("com.xwork.springbean.bean")
public class Config {
	@Bean
	public Flower rose() {
		System.out.println("Registering another Flower in spring..");
		Flower flower = new Flower();
		return flower;

	}

	@Bean
	public Actor name1() {
		System.out.println("Registering another actor in spring..");
		Actor act1 = new Actor("Puneet", "Kannad", 45);
		return act1;

	}

	@Bean
	public Actor name2() {
		System.out.println("Registering another actor in spring...");
		Actor act2 = new Actor("Akshay", "Hindi", 50);
		return act2;
	}

	@Bean
	public Actor name3() {
		System.out.println("Registering another actor in spring...");
		Actor act3 = new Actor("Allu_Arjun", "Telagu", 49);
		return act3;
	}

	@Bean
	public Actor name4() {
		System.out.println("Registering another actor in spring...");
		Actor act4 = new Actor("Darshan", "Kannada", 46);
		return act4;
	}

	@Bean
	public Actor name5() {
		System.out.println("Registering another actor in spring...");
		Actor act5 = new Actor("Mahesh_Babu", "Telagu", 48);
		return act5;
	}

	@Bean
	public Actor name6() {
		System.out.println("Registering another actor in spring...");
		Actor act6 = new Actor("Sampatmi", "Kannada", 24);
		return act6;

	}

	@Bean
	public Rocket racket() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock = new Rocket();
		return rock;
	}

	@Bean
	public Rocket racket2() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock1 = new Rocket();
		return rock1;
	}

	@Bean
	public Rocket racket3() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock2 = new Rocket();
		return rock2;
	}

	@Bean
	public Rocket racket4() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock4 = new Rocket();
		return rock4;
	}

	@Bean
	public Rocket racket5() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock5 = new Rocket();
		return rock5;
	}

	@Bean
	public Rocket racket6() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock6 = new Rocket();
		return rock6;
	}

}
