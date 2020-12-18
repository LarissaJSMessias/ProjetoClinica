package com.ProjClinica.model.dao;

import javax.persistence.EntityManager;

import com.ProjClinica.model.models.Tosador;

public class TosadorDao extends GenericDao<Tosador, Integer>{
	
	public TosadorDao(EntityManager entityManager) {
		super(entityManager);
	}


}
