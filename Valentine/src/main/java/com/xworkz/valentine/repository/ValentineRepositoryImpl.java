package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(ValentineEntity valentineEntity) {
		System.out.println("Running save in ValentineEntityRepository.....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(valentineEntity);
		entityTransaction.commit();
		entityManager.close();

		return true;
	}

}