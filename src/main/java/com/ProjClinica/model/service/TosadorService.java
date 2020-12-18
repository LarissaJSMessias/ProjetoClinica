package com.ProjClinica.model.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.ProjClinica.estrutura.util.VariaveisProjeto;
import com.ProjClinica.model.dao.TosadorDao;
import com.ProjClinica.model.models.Tosador;

public class TosadorService extends ConexaoBancoService {

	private TosadorDao TosadorDao;

	public TosadorService() {
		this.TosadorDao = new TosadorDao(this.getEntityManager());
	}

	public TosadorDao getTosadorDao() {
		return TosadorDao;
	}


	public Integer save(Tosador tosador) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(tosador)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getTosadorDao().save(tosador);
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


	public Integer update(Tosador tosador) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(tosador)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getTosadorDao().update(tosador);
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


	public Integer delete(Tosador tosador) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();



		try {

			trx.begin();
			Tosador TosadorEncontrado = this.getTosadorDao().findById(tosador.getId());
			this.getTosadorDao().remove(TosadorEncontrado);
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




	public  Tosador findById(Integer id) {
		return this.getTosadorDao().findById(id);
	}


	public List<Tosador> findAll(){
		return this.getTosadorDao().findAll(Tosador.class);
	}		




	public Integer validarDigitacao(Tosador tosador) {

		if(VariaveisProjeto.digitacaoCampo(tosador.getNome_tosador())) {
			return VariaveisProjeto.CAMPO_VAZIO;
		}
		return VariaveisProjeto.DIGITACAO_OK;

	}
	
}
