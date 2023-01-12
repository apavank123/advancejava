package com.xwork.springbeanautowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xwork.springbeanautowired.bean.FirstTime;
import com.xwork.springbeanautowired.bean.Government;
import com.xwork.springbeanautowired.bean.Hardware;
import com.xwork.springbeanautowired.bean.Patient;
import com.xwork.springbeanautowired.bean.Pencil;
import com.xwork.springbeanautowired.bean.Rubber;
import com.xwork.springbeanautowired.bean.Software;
import com.xwork.springbeanautowired.bean.SoftwareEngineer;
import com.xwork.springbeanautowired.configuration.SpringConfiguration;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));

		FirstTime ref1 = spring.getBean(FirstTime.class);
		System.out.println(ref1);

		Government govt = spring.getBean(Government.class);
		System.out.println(govt);

		Hardware hardware = spring.getBean(Hardware.class);
		System.out.println(hardware);

		Software software = spring.getBean(Software.class);
		System.out.println(software);

		Pencil pencil = spring.getBean(Pencil.class);
		System.out.println(pencil);

		Rubber rubber = spring.getBean(Rubber.class);
		System.out.println(rubber);

		SoftwareEngineer softengg = spring.getBean(SoftwareEngineer.class);
		System.out.println(softengg);
		
//		Patient ptnt = spring.getBean(Patient.class);
//		System.out.println(ptnt);

	}

}
