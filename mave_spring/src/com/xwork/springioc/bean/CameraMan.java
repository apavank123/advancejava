package com.xwork.springioc.bean;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	private Camera camera;
	
	public CameraMan() {
		System.out.println("Created CameraMan by no-arg const....");
	}

}
