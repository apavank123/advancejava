package com.xwork.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwork.spring.configuration.Config;
import com.xwork.spring.things.BankBean;

public class BankRunner {

	public static void main(String[] args) {

		ApplicationContext spring1 = new AnnotationConfigApplicationContext(Config.class);
		BankBean ref = spring1.getBean(BankBean.class);
		System.out.println(ref);

		String ref1 = spring1.getBean("name", String.class);
		System.out.println(ref1);

		String ref2 = spring1.getBean("address", String.class);
		System.out.println(ref2);

		String ref3 = spring1.getBean("bankName", String.class);
		System.out.println(ref3);

		String ref4 = spring1.getBean("location", String.class);
		System.out.println(ref4);

		String ref5 = spring1.getBean("type", String.class);
		System.out.println(ref5);

		Boolean ref6 = spring1.getBean("isAlive", Boolean.class);
		System.out.println(ref6);

		Boolean ref7 = spring1.getBean("isAlive1", Boolean.class);
		System.out.println(ref7);

		Boolean ref8 = spring1.getBean("isAlive2", Boolean.class);
		System.out.println(ref8);

		Boolean ref9 = spring1.getBean("isAlive3", Boolean.class);
		System.out.println(ref9);

		Boolean ref10 = spring1.getBean("isAlive4", Boolean.class);
		System.out.println(ref10);

		Double ref11 = spring1.getBean("amount", Double.class);
		System.out.println(ref11);

		Double ref12 = spring1.getBean("total", Double.class);
		System.out.println(ref12);

		Double ref13 = spring1.getBean("credit", Double.class);
		System.out.println(ref13);

		Double ref14 = spring1.getBean("debit", Double.class);
		System.out.println(ref14);

		Double ref15 = spring1.getBean("transfer", Double.class);
		System.out.println(ref15);

		StringBuffer ref16 = spring1.getBean("name1", StringBuffer.class);
		System.out.println(ref16);

		StringBuffer ref17 = spring1.getBean("name2", StringBuffer.class);
		System.out.println(ref17);

		StringBuffer ref18 = spring1.getBean("name3", StringBuffer.class);
		System.out.println(ref18);

		StringBuffer ref19 = spring1.getBean("name4", StringBuffer.class);
		System.out.println(ref19);

		StringBuffer ref20 = spring1.getBean("name5", StringBuffer.class);
		System.out.println(ref20);

		StringBuilder ref21 = spring1.getBean("address1", StringBuilder.class);
		System.out.println(ref21);

		StringBuilder ref22 = spring1.getBean("address2", StringBuilder.class);
		System.out.println(ref22);

		StringBuilder ref23 = spring1.getBean("address3", StringBuilder.class);
		System.out.println(ref23);

		StringBuilder ref24 = spring1.getBean("address4", StringBuilder.class);
		System.out.println(ref24);

		StringBuilder ref25 = spring1.getBean("address5", StringBuilder.class);
		System.out.println(ref25);

	}

}
