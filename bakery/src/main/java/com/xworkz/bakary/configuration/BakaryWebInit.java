package com.xworkz.bakary.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BakaryWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public BakaryWebInit() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running  getServletConfigClasses");
		return new Class[] { BakaryConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings ");
		return new String[] { "/" };
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("runing configureDefaultServletHandling");
		configurer.enable();
		}

}
