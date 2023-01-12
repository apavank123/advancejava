package com.xwork.spring.things;
import org.springframework.stereotype.Component;

@Component
public class BankBean {

	public void transaction() {
		System.out.println("Created Bank by spring..");
	}

}
