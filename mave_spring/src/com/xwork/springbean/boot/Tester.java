package com.xwork.springbean.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.springbean.bean.Actor;
import com.xwork.springbean.bean.Flower;
import com.xwork.springbean.bean.Rocket;
import com.xwork.springbean.configuration.Config;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext spring = new AnnotationConfigApplicationContext(Config.class);
		String[] string = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(string));
		Flower flower = spring.getBean("flower", Flower.class);
		System.out.println(flower);
		System.out.println(flower.getName());
		System.out.println(flower.getPrice());
		System.out.println(flower.getColor());
		
		Flower flower1 = spring.getBean("rose", Flower.class);
		System.out.println(flower1);
		System.out.println(flower1.getName());
		System.out.println(flower1.getPrice());
		System.out.println(flower1.getColor());
		
		Actor actor = spring.getBean("actor", Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getLanguage());
		System.out.println(actor.getAge());
		
		Actor act1 = spring.getBean("name1", Actor.class);
		System.out.println(act1);
		System.out.println(act1.getName());
		System.out.println(act1.getLanguage());
		System.out.println(act1.getAge());
		
		Actor act2 = spring.getBean("name2", Actor.class);
		System.out.println(act2);
		System.out.println(act2.getName());
		System.out.println(act2.getLanguage());
		System.out.println(act2.getAge());
		
		Actor act3 = spring.getBean("name3", Actor.class);
		System.out.println(act3);
		System.out.println(act3.getName());
		System.out.println(act3.getLanguage());
		System.out.println(act3.getAge());
		
		Actor act4 = spring.getBean("name4", Actor.class);
		System.out.println(act4);
		System.out.println(act4.getName());
		System.out.println(act4.getLanguage());
		System.out.println(act4.getAge());
		
		Actor act5 = spring.getBean("name5", Actor.class);
		System.out.println(act5);
		System.out.println(act5.getName());
		System.out.println(act5.getLanguage());
		System.out.println(act5.getAge());
		
		Actor act6 = spring.getBean("name6", Actor.class);
		System.out.println(act6);
		System.out.println(act6.getName());
		System.out.println(act6.getLanguage());
		System.out.println(act6.getAge());
		
		Rocket rct = spring.getBean("racket", Rocket.class);
		System.out.println(rct);
		System.out.println(rct.getName());
		System.out.println(rct.getContry());
		System.out.println(rct.getBudget());
		
		Rocket rct1 = spring.getBean("racket2", Rocket.class);
		System.out.println(rct1);
		System.out.println(rct1.getName());
		System.out.println(rct1.getContry());
		System.out.println(rct1.getBudget());
		
		Rocket rct2 = spring.getBean("racket3", Rocket.class);
		System.out.println(rct2);
		System.out.println(rct2.getName());
		System.out.println(rct2.getContry());
		System.out.println(rct2.getBudget());
		
		Rocket rct3 = spring.getBean("racket4", Rocket.class);
		System.out.println(rct3);
		System.out.println(rct3.getName());
		System.out.println(rct3.getContry());
		System.out.println(rct3.getBudget());
		
		Rocket rct4 = spring.getBean("racket5", Rocket.class);
		System.out.println(rct4);
		System.out.println(rct4.getName());
		System.out.println(rct4.getContry());
		System.out.println(rct4.getBudget());
		
		Rocket rct5 = spring.getBean("racket6", Rocket.class);
		System.out.println(rct5);
		System.out.println(rct5.getName());
		System.out.println(rct5.getContry());
		System.out.println(rct5.getBudget());

	}

}
