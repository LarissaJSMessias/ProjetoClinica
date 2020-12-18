package com.ProjClinica.model.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.ProjClinica.estrutura.util.VariaveisProjeto;
import com.ProjClinica.model.dao.VeterinarioDao;
import com.ProjClinica.model.models.Veterinario;

public class VeterinarioService extends ConexaoBancoService {

	
	private VeterinarioDao veterinarioDao;

	public VeterinarioService() {
		this.veterinarioDao = new VeterinarioDao(this.getEntityManager());
	}

	public VeterinarioDao getVeterinarioDao() {
		return veterinarioDao;
	}


	public Integer save(Veterinario veterinario) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(veterinario)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getVeterinarioDao().save(veterinario);
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


	public Integer update(Veterinario veterinario) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(veterinario)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getVeterinarioDao().update(veterinario);
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


	public Integer delete(Veterinario veterinario) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();



		try {

			trx.begin();
			Veterinario veterinarioEncontrado = this.getVeterinarioDao().findById(veterinario.getId());
			this.getVeterinarioDao().remove(veterinarioEncontrado);
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




	public  Veterinario findById(Integer id) {
		return this.getVeterinarioDao().findById(id);
	}


	public List<Veterinario> findAll(){
		return this.getVeterinarioDao().findAll(Veterinario.class);
	}		




	public Integer validarDigitacao(Veterinario veterinario) {

		if(VariaveisProjeto.digitacaoCampo(veterinario.getNome_veterinario())) {
			return VariaveisProjeto.CAMPO_VAZIO;
		}
		return VariaveisProjeto.DIGITACAO_OK;

	}
}
