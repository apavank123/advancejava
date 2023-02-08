package com.xworkz.bakary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakary.dto.BakeryDTO;
import com.xworkz.bakary.repository.BakaryRepository;
@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakaryRepository bakaryRepository;

	
	@Override
	public boolean validatAndSave(BakeryDTO bakeryDTO) {
		System.out.println("Running validateAndSave");
		boolean save = bakaryRepository.save(bakeryDTO);
		System.out.println("Save " + save);
		return false;
	}

}
