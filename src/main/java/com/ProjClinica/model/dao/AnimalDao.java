package com.ProjClinica.model.dao;

import javax.persistence.EntityManager;

import com.ProjClinica.model.models.Animal;

public class AnimalDao extends GenericDao<Animal, Integer>{ //chama a genericDao passando a classe animal e o tipo da chave primaria

	public AnimalDao(EntityManager entityManager) {
		super(entityManager);
	}


}

