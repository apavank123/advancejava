package com.xwork.springbeanconstr.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {

	@Autowired
	private String snakeName;// name :const

	@Value("2")
	private int length;// length ;property

	@Value("Cobra")
	private String color;// color;property

	@Autowired
	private String type;// type : const

	@Autowired
	private String poison; // poisionous const

	public Snake() {
		// TODO Auto-generated constructor stub
	}

	public Snake(@Qualifier("snakeName") String name, @Qualifier("type") String type,
			@Qualifier("poison") String poison) {
		super();
		this.snakeName = name;
		this.type = type;
		this.poison = poison;
	}

	@Override
	public String toString() {
		return "Snake [name=" + snakeName + ", length=" + length + ", color=" + color + ", type=" + type + ", poison="
				+ poison + "]";
	}

}
