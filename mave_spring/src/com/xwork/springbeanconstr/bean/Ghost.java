package com.xwork.springbeanconstr.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Autowired
	private String ghostName;// constructor
	@Autowired
	private String ghostGender;// constructor
	@Autowired
	private double ghostnailLength;// constructor
	@Autowired
	private LocalDate dateOfDeath;// constructor
	@Autowired
	private String ghostCauseOfDeath;
	@Autowired
	private int aliveageBeforeDeath;// constructor
	@Autowired
	private String placeBeforeDeath;// constructor
	@Autowired
	private String ghostFatherNameBeforeDeath;// constructor
	@Autowired
	private LocalDate ghostFatherdateOfDeath;// constructor
	@Value("Male")
	private String ghostFatherGender;
	@Value("3.5")
	private double ghostFathernailLength;
	@Value("60")
	private int ghostFatheraliveageBeforeDeath;
	@Value("Mudhol")
	private String ghostFatherplaceBeforeDeath;
	@Value("Sanvi")
	private String ghostMotherNameBeforeDeath;
	@Autowired
	private LocalDate ghostMotherdateOfDeath;// constructor
	@Value("Not_DisClosed")
	private String ghostMotherGender;
	@Value("6.8")
	private double ghostMothernailLength;
	@Value("87")
	private int ghostMotheraliveageBeforeDeath;
	@Value("Jamakandhi")
	private String ghostMotherplaceBeforeDeath;
	@Value("Raju")
	private String ghostSiblingsNameBeforeDeath;

	public Ghost() {
		// TODO Auto-generated constructor stub
	}

	public Ghost(String ghostName, String ghostGender, double ghostnailLength, LocalDate dateOfDeath,
			String ghostCauseOfDeath, int aliveageBeforeDeath, String placeBeforeDeath,
			String ghostFatherNameBeforeDeath, LocalDate ghostFatherdateOfDeath, LocalDate ghostMotherdateOfDeath) {
		super();
		this.ghostName = ghostName;
		this.ghostGender = ghostGender;
		this.ghostnailLength = ghostnailLength;
		this.dateOfDeath = dateOfDeath;
		this.ghostCauseOfDeath = ghostCauseOfDeath;
		this.aliveageBeforeDeath = aliveageBeforeDeath;
		this.placeBeforeDeath = placeBeforeDeath;
		this.ghostFatherNameBeforeDeath = ghostFatherNameBeforeDeath;
		this.ghostFatherdateOfDeath = ghostFatherdateOfDeath;
		this.ghostMotherdateOfDeath = ghostMotherdateOfDeath;
	}

	@Override
	public String toString() {
		return "Ghost [ghostName=" + ghostName + ", ghostGender=" + ghostGender + ", ghostnailLength=" + ghostnailLength
				+ ", dateOfDeath=" + dateOfDeath + ", ghostCauseOfDeath=" + ghostCauseOfDeath + ", aliveageBeforeDeath="
				+ aliveageBeforeDeath + ", placeBeforeDeath=" + placeBeforeDeath + ", ghostFatherNameBeforeDeath="
				+ ghostFatherNameBeforeDeath + ", ghostFatherdateOfDeath=" + ghostFatherdateOfDeath
				+ ", ghostFatherGender=" + ghostFatherGender + ", ghostFathernailLength=" + ghostFathernailLength
				+ ", ghostFatheraliveageBeforeDeath=" + ghostFatheraliveageBeforeDeath
				+ ", ghostFatherplaceBeforeDeath=" + ghostFatherplaceBeforeDeath + ", ghostMotherNameBeforeDeath="
				+ ghostMotherNameBeforeDeath + ", ghostMotherdateOfDeath=" + ghostMotherdateOfDeath
				+ ", ghostMotherGender=" + ghostMotherGender + ", ghostMothernailLength=" + ghostMothernailLength
				+ ", ghostMotheraliveageBeforeDeath=" + ghostMotheraliveageBeforeDeath
				+ ", ghostMotherplaceBeforeDeath=" + ghostMotherplaceBeforeDeath + ", ghostSiblingsNameBeforeDeath="
				+ ghostSiblingsNameBeforeDeath + "]";
	}

}
