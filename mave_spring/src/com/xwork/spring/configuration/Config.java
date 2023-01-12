package com.xwork.spring.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xwork")
public class Config {

	@Bean
	public String name() {
		System.out.println("Registering name by string..");
		String ref = new String("Sneha");
		return ref;
	}
	
	@Bean
	public String address() {
		System.out.println("Registering address by string..");
		String ref1 = new String("Rajajinagar");
		return ref1;
	}
	
	@Bean
	public String bankName() {
		System.out.println("Registering bank name by string");
		String ref2 = new String("Axisbank");
		return ref2;
	}
	
	@Bean 
	public String location() {
		System.out.println("Registering location by string..");
		String ref3 = new String("Banglore");
		return ref3;
	}
	
	@Bean
	public String type() {
		System.out.println("Registering location by string..");
		String ref4 = new String("Nationalize");
		return ref4;
	}
	
	@Bean
	public Boolean isAlive() {
		System.out.println("Registering is alive by boolean.");
		Boolean ref5 = new Boolean(true);
		return ref5;
	}
	
	@Bean
	public Boolean isAlive1() {
		System.out.println("Registering is alive is boolean..");
		Boolean ref6 = new Boolean(false);
		return ref6;
	}
	
	@Bean
	public Boolean isAlive2() {
		System.out.println("Registering is alive by boolean.");
		Boolean ref7 = new Boolean(true);
		return ref7;
	}
	
	@Bean
	public Boolean isAlive3() {
		System.out.println("Registering is alive is boolean..");
		Boolean ref8 = new Boolean(false);
		return ref8;
	}
	
	@Bean
	public Boolean isAlive4() {
		System.out.println("Registering is alive by boolean.");
		Boolean ref9 = new Boolean(true);
		return ref9;
	}
	
	@Bean 
	public Double amount() {
		System.out.println("Registering amount by double..");
		Double ref10 = new Double(10.0);
		return ref10;
	}
	
	@Bean 
	public Double total() {
		System.out.println("Registering amount by double..");
		Double ref11 = new Double(20.0);
		return ref11;
	}
	
	@Bean
	public Double credit() {
		System.out.println("Registering amount by double..");
		Double ref12 = new Double(30.0);
		return ref12;
	}
	
	@Bean 
	public Double debit() {
		System.out.println("Registering amount by double..");
		Double ref13 = new Double(40.0);
		return ref13;
	}
	
	@Bean 
	public Double transfer() {
		System.out.println("Registering amount by double..");
		Double ref14 = new Double(50.0);
		return ref14;
	}
	
	@Bean
	public StringBuffer name1() {
		System.out.println("Registering name1 by string buffer");
	    StringBuffer ref15 = new StringBuffer("Sneha");
	    return ref15;
	    
	}
	
	@Bean
	public StringBuffer name2() {
		System.out.println("Registering name2 by string buffer..");
		StringBuffer ref16 = new StringBuffer("Swati");
		return ref16;
	}
	
	@Bean
	public StringBuffer name3() {
		System.out.println("Registering name3 by string buffer..");
		StringBuffer ref17 = new StringBuffer("Anu");
		return ref17;
	}
	
	@Bean
	public StringBuffer name4() {
		System.out.println("Registering name4 by string buffer..");
		StringBuffer ref18 = new StringBuffer("Manu");
		return ref18;
	}
	
	@Bean
	public StringBuffer name5() {
		System.out.println("Registering name5 by string buffer..");
		StringBuffer ref19 = new StringBuffer("Vishala");
		return ref19;
	}
	
	@Bean 
	public StringBuilder address1() {
		System.out.println("Registering address by string builder..");
		StringBuilder ref20 = new StringBuilder("Rajajinagar");
		return ref20;
	}
	
	@Bean 
	public StringBuilder address2() {
		System.out.println("Registering address2 by string builder..");
		StringBuilder ref21 = new StringBuilder("Mejestic");
		return ref21;
	}
	
	@Bean 
	public StringBuilder address3() {
		System.out.println("Reggistering address3 by string builder..");
		StringBuilder ref22 = new StringBuilder("Jayanagar");
		return ref22;
	}
	
	@Bean 
	public StringBuilder address4() {
		System.out.println("Reggistering address by string builder..");
		StringBuilder ref23 = new StringBuilder("BTM");
		return ref23;
	}
	
	@Bean 
	public StringBuilder address5() {
		System.out.println("Reggistering address by string builder..");
		StringBuilder ref24 = new StringBuilder("Shivajinagar");
		return ref24;
	}
	
	@Bean
	public void id1() {
	Collection<Integer> list = new ArrayList();
	list.add(12);
	list.add(13);
	list.add(14);
	list.add(15);
	list.add(16);
	
	for(Integer value : list) {
		System.out.println(value);
	}
	}
	
	@Bean
	public void id2() {
		Map<String,Double> map = new HashMap();
		map.put("BankOfIndia", 100.3);
		map.put("Canara", 105.6);
		map.put("CBI", 110.7);
		map.put("HDFC", 200.35);
		map.put("IDBI", 250.0);
		
		Set<String> name = map.keySet();
		System.out.println(name);
		
		Collection<Double> balance = map.values();
		System.out.println(balance);
		
		Set<Entry<String, Double>> entry = map.entrySet();
		entry.forEach(e->System.out.println(e));
		
		
	}
	
}
