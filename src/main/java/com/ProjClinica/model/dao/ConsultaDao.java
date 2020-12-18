package com.ProjClinica.model.dao;

import javax.persistence.EntityManager;

import com.ProjClinica.model.models.Consulta;

public class ConsultaDao extends GenericDao<Consulta, Integer>{
	
	public ConsultaDao(EntityManager entityManager) {
		super(entityManager);
	}


}
