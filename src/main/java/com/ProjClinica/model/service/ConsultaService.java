package com.ProjClinica.model.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.ProjClinica.estrutura.util.VariaveisProjeto;
import com.ProjClinica.model.dao.ConsultaDao;
import com.ProjClinica.model.models.Consulta;

public class ConsultaService extends ConexaoBancoService {

	private ConsultaDao ConsultaDao;

	public ConsultaService() {
		this.ConsultaDao = new ConsultaDao(this.getEntityManager());
	}

	public ConsultaDao getConsultaDao() {
		return ConsultaDao;
	}


	public Integer save(Consulta consulta) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(consulta)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getConsultaDao().save(consulta);
				trx.commit();


			}catch (Exception ex) {
				ex.printStackTrace();
				if(trx.isActive()) {
					trx.rollback();
				}
				toReturn = VariaveisProjeto.ERRO_INCLUSAO;

			}finally {
				close(); 
			}
		}
		else {
			toReturn = VariaveisProjeto.CAMPO_VAZIO;
		}

		return toReturn;
	}


	public Integer update(Consulta consulta) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(consulta)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getConsultaDao().update(consulta);
				trx.commit();


			}catch (Exception ex) {
				ex.printStackTrace();
				if(trx.isActive()) {
					trx.rollback();
				}
				toReturn = VariaveisProjeto.ERRO_ALTERACAO;

			}finally {
				close(); 
			}
		}
		else {
			toReturn = VariaveisProjeto.CAMPO_VAZIO;
		}

		return toReturn;
	}


	public Integer delete(Consulta consulta) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();



		try {

			trx.begin();
			Consulta ConsultaEncontrado = this.getConsultaDao().findById(consulta.getId());
			this.getConsultaDao().remove(ConsultaEncontrado);
			trx.commit();


		}catch (Exception ex) {
			ex.printStackTrace();
			if(trx.isActive()) {
				trx.rollback();
			}
			toReturn = VariaveisProjeto.ERRO_EXCLUSAO;

		}finally {
			close(); 
		}

		return toReturn;
	}




	public  Consulta findById(Integer id) {
		return this.getConsultaDao().findById(id);
	}


	public List<Consulta> findAll(){
		return this.getConsultaDao().findAll(Consulta.class);
	}		




	public Integer validarDigitacao(Consulta consulta) {

		if(VariaveisProjeto.digitacaoCampo(consulta.getData())) {
			return VariaveisProjeto.CAMPO_VAZIO;
		}
		return VariaveisProjeto.DIGITACAO_OK;

	}
	
}
