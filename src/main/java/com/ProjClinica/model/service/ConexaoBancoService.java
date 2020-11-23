package com.ProjClinica.model.service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ProjClinica.estrutura.persistencia.ConexaoBancoDados;
import com.ProjClinica.estrutura.util.VariaveisProjeto;



public abstract class ConexaoBancoService {
	
	@PersistenceContext(unitName = VariaveisProjeto.PERSISTENCE_UNIT_NAME)
	private final EntityManager entityManager;
	
	public ConexaoBancoService() {
		this.entityManager = ConexaoBancoDados.getConexaoBancoDados().getEntityManager();
	}

	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void close() {
		if(this.getEntityManager().isOpen())
		{
			this.getEntityManager().close();
		}
		
	}
	
}