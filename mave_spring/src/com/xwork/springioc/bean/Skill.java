package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component

public class Skill {
	public Skill() {
		System.out.println("Created Skill by no-arg const....");
	}

}
