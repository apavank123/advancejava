package com.xwork.springbeanconstr.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Value("4")
	private int id;//propetry

	@Autowired
	private String name;//const

	@Autowired
	private String ownerName;//const

	@Value("Kannada")
	private String languge;//propetry
	private int price;//setter

	public NewsPaper() {
		// TODO Auto-generated constructor stub
	}

	public NewsPaper(@Qualifier("newsPaperName") String name, @Qualifier("ownerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Autowired
	@Qualifier("price")
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", languge=" + languge
				+ ", price=" + price + "]";
	}

	
}
