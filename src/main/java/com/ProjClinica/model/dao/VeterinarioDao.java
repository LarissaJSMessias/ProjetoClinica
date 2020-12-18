package com.ProjClinica.model.dao;

import javax.persistence.EntityManager;

import com.ProjClinica.model.models.Veterinario;

public class VeterinarioDao extends GenericDao<Veterinario, Integer>{
	
	public VeterinarioDao(EntityManager entityManager) {
		super(entityManager);
	}


}
