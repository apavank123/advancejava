package com.xworkz.valentine.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ValentineMVCInt extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public ValentineMVCInt() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("1) Invoked getRootConfigClasses() ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("2) Invoked getRootConfigClasses() ");
		return new Class[] {ValentineApplicationConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("3) Invoked getServletMappings()");
		return new String[]{"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("4) Invoking configureDefaultServletHandling ");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
		configurer.enable();
	}
}
