package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Experience {
	private Skill skill;
	
	public Experience() {
		System.out.println("Created Experience by no-arg const....\"");
	}

}
