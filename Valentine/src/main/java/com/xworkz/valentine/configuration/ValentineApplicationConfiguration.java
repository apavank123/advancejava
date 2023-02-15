package com.xworkz.valentine.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan("com.xworkz.valentine")
public class ValentineApplicationConfiguration {

	public ValentineApplicationConfiguration() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Registering ViewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("registering LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}

	/*
	 * @Bean public LocalContainerEntityManagerFactoryBean bean() {
	 * System.out.println("registering local entity bean"); return new
	 * LocalContainerEntityManagerFactoryBean(); }
	 */
}
