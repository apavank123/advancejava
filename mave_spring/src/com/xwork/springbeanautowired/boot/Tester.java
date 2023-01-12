package com.xwork.springbeanautowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xwork.springbeanautowired.bean.FirstTime;
import com.xwork.springbeanautowired.bean.Government;
import com.xwork.springbeanautowired.bean.Hardware;
import com.xwork.springbeanautowired.bean.Pencil;
import com.xwork.springbeanautowired.bean.Patient;
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

		Government ref2 = spring.getBean(Government.class);
		System.out.println(ref2);

		Hardware ref3 = spring.getBean(Hardware.class);
		System.out.println(ref3);

		Software ref4 = spring.getBean(Software.class);
		System.out.println(ref4);

		Pencil ref5 = spring.getBean(Pencil.class);
		System.out.println(ref5);

		Rubber ref6 = spring.getBean(Rubber.class);
		System.out.println(ref6);

		SoftwareEngineer ref7 = spring.getBean(SoftwareEngineer.class);
		System.out.println(ref7);

		Patient ref8 = sprnig.getBean(Patient.class)
		System.out.println(ref8);
	}

}
