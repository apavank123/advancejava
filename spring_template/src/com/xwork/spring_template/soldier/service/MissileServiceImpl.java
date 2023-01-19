package com.xwork.spring_template.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xwork.spring_template.soldier.dto.MissileDTO;
import com.xwork.spring_template.soldier.repo.MissileRepo;

import lombok.NoArgsConstructor;

@Component
public class MissileServiceImpl implements MissileService {

	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;

	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
		System.out.println("Created Service by passing repo.... From spring....");

	}

	public MissileServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(MissileDTO msldto) {
		System.out.println("running validate And Save");
		System.out.println("mslDTO : " + msldto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MissileDTO>> violations = validator.validate(msldto);

		if (!violations.isEmpty()) {
			System.err.println("There are Validation Errors");
			return false;
		} else {
			System.out.println("Data is Valid...... + can Save ");
			boolean saved = this.missileRepo.saves(msldto);
			System.out.println("Saved Missile " + saved);
			return saved;

		}
	}

}
