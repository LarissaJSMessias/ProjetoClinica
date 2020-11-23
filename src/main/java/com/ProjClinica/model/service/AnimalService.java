package com.ProjClinica.model.service;

import java.util.List;

import javax.persistence.EntityTransaction;
import com.ProjClinica.estrutura.util.VariaveisProjeto;
import com.ProjClinica.model.dao.AnimalDao;
import com.ProjClinica.model.models.Animal;


public class AnimalService extends ConexaoBancoService {

	private AnimalDao animalDao;

	public AnimalService() {
		this.animalDao = new AnimalDao(this.getEntityManager());
	}

	public AnimalDao getAnimalDao() {
		return animalDao;
	}



	//-------cadastrar
	public Integer save(Animal animal) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(animal)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getAnimalDao().save(animal);
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



	//-------alterar	
	public Integer update(Animal animal) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();


		if(validarDigitacao(animal)== VariaveisProjeto.DIGITACAO_OK) {



			try {
				trx.begin();
				this.getAnimalDao().update(animal);
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


	//-------deletar
	public Integer delete(Animal animal) {

		Integer toReturn =0;

		EntityTransaction trx = this.getEntityManager().getTransaction();



		try {

			trx.begin();
			Animal animalEncontrado = this.getAnimalDao().findById(animal.getId());
			this.getAnimalDao().remove(animalEncontrado);
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




	public  Animal findById(Integer id) {
		return this.getAnimalDao().findById(id);
	}


	public List<Animal> findAll(){
		return this.getAnimalDao().findAll(Animal.class);
	}		




	public Integer validarDigitacao(Animal animal) {

		if(VariaveisProjeto.digitacaoCampo(animal.getNome_animal())) {
			return VariaveisProjeto.CAMPO_VAZIO;
		}
		return VariaveisProjeto.DIGITACAO_OK;

	}

}
