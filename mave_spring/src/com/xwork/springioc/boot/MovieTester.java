package com.xwork.springioc.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.springioc.bean.CameraMan;
import com.xwork.springioc.bean.Director;
import com.xwork.springioc.bean.Producer;
import com.xwork.springioc.springconfiguration.OptimisticConfiguration;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new AnnotationConfigApplicationContext(OptimisticConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Producer producer = container.getBean(Producer.class);
		System.out.println(producer);
		
		CameraMan cameraMan = container.getBean(CameraMan.class);
		System.out.println(cameraMan);
		
		Director director = container.getBean(Director.class);
		System.out.println(director);
		
		

	}

}
