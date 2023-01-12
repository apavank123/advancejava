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
	private short age;
	@Autowired
	@Qualifier("patientName")
	private String name;
	@Autowired
	@Qualifier("patientBloodGroup")
	private String bloodgroup;
	@Autowired
	@Qualifier("patientMobileNo")
	private long mobileNo;
	@Autowired
	@Qualifier("patientAddess")
	private String address;
	@Autowired
	@Qualifier("patientRelativeName")
	private float patientRelativeNames;
	@Autowired
	@Qualifier("isAliveOrNot")
	private boolean isAlive;
	@Autowired
	@Qualifier("patientHealthIssue")
	private String health;

	public Patient() {
		System.out.println("Created Firsttime by Patient..");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", age=" + age + ", name=" + name + ", bloodgroup=" + bloodgroup + ", mobileNo="
				+ mobileNo + ", address=" + address + ", patientRelativeNames=" + patientRelativeNames
				+ ", isAliveOrNot=" + isAlive + ", health=" + health + "]";
	}

}
