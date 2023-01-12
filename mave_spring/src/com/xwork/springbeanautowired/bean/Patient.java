package com.xwork.springbeanautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Patient {

	@Autowired
	@Qualifier("idOfPatient")
	private byte id;
	@Autowired
	@Qualifier("ageOfPatient")
	private short age ;
	@Autowired
	@Qualifier("PatientName")
	private String name;
	@Autowired
	@Qualifier("PatientBloodGroup")
	private String experience;
	@Autowired
	@Qualifier("PatientMobileNo")
	private long mobileNo;
	@Autowired
	@Qualifier("PatientAddess")
	private String salary;
	@Autowired
	@Qualifier("Deepak")
	private float patientRelativeName ;
	@Autowired
	@Qualifier("true")
	private boolean isAliveOrNot;
	@Autowired
	@Qualifier("chhh")
	private String patientHealthIssue;
	

	@Bean
	public short ageOfPatient() {
		System.out.println("registering ageOf Patient..");
		return 23;
	}

	@Bean
	public String PatientName() {
		System.out.println("registering Patient Name..");
		return "Vivek";
	}

	@Bean
	public String PatientBloodGroup() {
		System.out.println("registering Patient BloodGroup..");
		return "B+";
	}

	@Bean
	public long PatientMobileNo() {
		System.out.println("registering Patient MobileNo..");
		return 9036137153L;
	}

	@Bean
	public String PatientAddess() {
		System.out.println("registering pacentAddess..");
		return "Teachers Colony Mudhol";
	
	}

	@Bean
	public String patientRelativeName() {
		System.out.println("registering patientRelativeName..");
		return "Deepak";
	}

	@Bean
	public boolean isAliveOrNot() {
		System.out.println("registering alive..");
		return true;
	}

	@Bean
	public String patientHealthIssue() {
		System.out.println("registering patientHealthIssue..");
		return "Cancer";
	}

	
	
	public Patient() {
		System.out.println("Created Patient by spring...");
	}
}
