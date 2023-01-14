package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	private Lens lens;
	private Battery battery;
	
	public Camera() {
		System.out.println("Created Camera by no-arg const....");
	}

}
