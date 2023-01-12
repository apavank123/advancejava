package com.xwork.springbeanconstr.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Autowired
	private String engineName;// engineName : const
	@Autowired
	private String engineType;// type : const

	@Value("12345676L")
	private String engineNumber;// number :propetry

	@Value("BS_6")
	private String engineVersion;// version : propetry
	@Autowired
	private String engineCompanyName;// company : const
	@Autowired
	private String stroke;// strokes : setter

	public Engine() {

	}

	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type,
			@Qualifier("engineCompanyName") String companyName) {
		super();
		this.engineName = name;
		this.engineType = type;
		this.engineCompanyName = companyName;
	}

	@Autowired
	@Qualifier("stroke")
	public void setStroke(String stroke) {
		this.stroke = stroke;

	}

	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + ", engineType=" + engineType + ", engineNumber=" + engineNumber
				+ ", engineVersion=" + engineVersion + ", engineCompanyName=" + engineCompanyName + ", stroke=" + stroke
				+ "]";
	}

}
