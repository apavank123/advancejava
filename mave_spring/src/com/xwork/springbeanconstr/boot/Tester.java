package com.xwork.springbeanconstr.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.springbeanconstr.bean.Engine;
import com.xwork.springbeanconstr.bean.Ghost;
import com.xwork.springbeanconstr.bean.NewsPaper;
import com.xwork.springbeanconstr.bean.Snake;
import com.xwork.springbeanconstr.springConfiguration.SpringConfiguration;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		NewsPaper newsppr = spring.getBean(NewsPaper.class);
		System.out.println(newsppr);

		Snake snake = spring.getBean(Snake.class);
		System.out.println(snake);

		Engine engine = spring.getBean(Engine.class);
		System.out.println(engine);

		Ghost ghost = spring.getBean(Ghost.class);
		System.out.println(ghost);
	}

}
