package com.xworkz.pk.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PkWebMVCInt extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public PkWebMVCInt() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running the getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running the getServletConfigClasses");
		return new Class [] {PkConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running the getServletMappings");
		return new String[] { "/" };
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running the configureDefaultServletHandling");
		configurer.enable();
	}

}
