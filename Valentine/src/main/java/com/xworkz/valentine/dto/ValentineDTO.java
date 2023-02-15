package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {
	
	@Size(min = 3, max = 20 , message = "Name cannot be less than 3 or greater than 20")
	private String name;
	@NotBlank(message = "Place should be Selected")
	private String place;
	@NotBlank(message = "Gift should be Selected")
	private String gift;
	@Size(min = 3, max = 20 , message = "valentineName cannot be less than 3 or greater than 20")
	private String valentineName;
	
}
