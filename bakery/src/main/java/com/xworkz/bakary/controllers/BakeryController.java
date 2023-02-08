package com.xworkz.bakary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakary.dto.BakeryDTO;
import com.xworkz.bakary.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {

	@Autowired
	private BakeryService bakaryService;

	public BakeryController() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/save")
	public String onBakery(BakeryDTO bakeryDTO, Model model) {
		System.out.println("Running OnBakery......." +bakeryDTO);
		model.addAttribute("bakery", bakeryDTO);
		boolean save = bakaryService.validatAndSave(bakeryDTO);
		System.out.println(save);
		return "display";
		
	}

	
}