package com.xwork.springbeanconstr.springConfiguration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xwork.springbeanconstr")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration");
	}

	/*
	 * =============================Newspaper=======================================
	 */
	@Bean
	public String name() {
		System.out.println("Registering_Newspaper_Name");
		return "Vijayvani";
	}

	@Bean
	public String ownerName() {
		System.out.println("Registering_Newspaper_OwnerName");
		return "Vijay Shankeshwar";
	}

	@Bean
	public int price() {
		System.out.println("Registering_Newspaper_Price");
		return 5;
	}

	/*
	 * =============================Snake===========================================
	 */
	@Bean
	public String snakeName() {
		System.out.println("Registering_Snake_Name");
		return "Cobra";
	}

	@Bean
	public String type() {
		System.out.println("Registering_Type_Name");
		return "Indian_cobra";
	}

	@Bean
	public String poison() {
		System.out.println("Registering_poison_Name");
		return "venomous";
	}

	/*
	 * =============================Engine==========================================
	 */

	@Bean
	public String engineName() {
		System.out.println("Registering_Engine_Name");
		return "Car_Engine";
	}

	@Bean
	public String engineType() {
		System.out.println("Registering_Engine_Type");
		return "900cc";
	}

	@Bean
	public String engineCompanyName() {
		System.out.println("Registering_Engine_CompanyName");
		return "Chevrolet";
	}

	@Bean
	public String stroke() {
		System.out.println("Registering_Stroke");
		return "4_Stroke";
	}
	/*
	 * =============================Ghost==========================================
	 */

	@Bean
	public String ghostName() {
		System.out.println("Registering_Ghost_Name ");
		return "Raju";
	}

	@Bean
	public String ghostGender() {
		System.out.println("Registering_Ghost_Gender ");
		return "Not_DisClosed";
	}

	@Bean
	public Double ghostnailLength() {
		System.out.println("Registering_Ghost_NailLength");
		return 5.5;
	}

	@Bean
	public LocalDate dateOfDeath() {
		System.out.println("Registering_Ghost_dateOfDeath ");
		return LocalDate.of(2020, 6, 12);

	}

	@Bean
	public String ghostCauseOfDeath() {
		System.out.println("Registering_Ghost_Cause_OfDeath ");
		return "Bike_Incident";
	}

	@Bean
	public int aliveageBeforeDeath() {
		System.out.println("Registering_Alive_Age_BeforeDeath ");
		return 32;
	}

	@Bean
	public String placeBeforeDeath() {
		System.out.println("Registering_Place_BeforeDeath ");
		return "Nandi_Hills";
	}

	@Bean
	public String ghostFatherNameBeforeDeath() {
		System.out.println("Registering_Ghost_Father_Name_BeforeDeath ");
		return "Vivek";
	}

	@Bean
	public LocalDate ghostFatherdateOfDeath() {
		System.out.println("Registering_Ghost_Father_DateOfDeath ");
		return LocalDate.of(1999, 2, 23);
	}

	@Bean
	public LocalDate ghostMotherdateOfDeath() {
		System.out.println("Registering_Ghost_Mother_DateOfDeath ");
		return LocalDate.of(2013, 12, 13);
	}

}
