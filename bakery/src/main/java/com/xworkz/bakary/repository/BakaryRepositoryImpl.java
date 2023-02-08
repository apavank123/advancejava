package com.xworkz.bakary.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakary.dto.BakeryDTO;
@Repository
public class BakaryRepositoryImpl implements BakaryRepository {

	public BakaryRepositoryImpl() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("Running Save");
		return false;
	}

}
