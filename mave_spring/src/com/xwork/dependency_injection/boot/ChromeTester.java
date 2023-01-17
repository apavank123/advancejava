package com.xwork.dependency_injection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.dependency_injection.bean.Chrome;
import com.xwork.dependency_injection.bean.FireFox;
import com.xwork.dependency_injection.configuration.ChromeConfiguration;

public class ChromeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext spring =new AnnotationConfigApplicationContext(ChromeConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		System.out.println(spring.getBeanDefinitionCount());
		Chrome chrome= spring.getBean(Chrome.class);
		chrome.browse();
		
		
		FireFox fire= spring.getBean(FireFox.class);
		fire.browse();
	}

}
