package com.ProjClinica.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TAB_ANIMAL") //declarando pro banco o nome da tabela

public class Animal {

	private Integer id;
	private String Nome_animal;
	private String Especie;
	private String Raca;
	private String Sexo;
	private String Nome_dono;
	private String Telefone;




	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ANIMAL_ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	@Column(name = "ANIMAL_NOME", length =60,  nullable = false)
	public String getNome_animal() {
		return Nome_animal;
	}
	public void setNome_animal(String nome_animal) {
		Nome_animal = nome_animal;
	}


	@Column(name = "ANIMAL_ESPECIE", length =60,  nullable = false)
	public String getEspecie() {
		return Especie;
	}
	public void setEspecie(String especie) {
		Especie = especie;
	}


	@Column(name = "ANIMAL_RACA", length =60,  nullable = false)
	public String getRaca() {
		return Raca;
	}
	public void setRaca(String raca) {
		Raca = raca;
	}


	@Column(name = "ANIMAL_SEXO", length =60,  nullable = false)
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}


	@Column(name = "ANIMAL_DONO", length =60,  nullable = false)
	public String getNome_dono() {
		return Nome_dono;
	}
	public void setNome_dono(String nome_dono) {
		Nome_dono = nome_dono;
	}


	@Column(name = "ANIMAL_TELEFONE", length =60,  nullable = false)
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString(){
		return "Usuario [id=" + id + ", nome_animal=" + Nome_animal + ", especie=" + Especie + ", raça=" + Raca
				+ ", sexo=" + Sexo  + ", nome_dono=" + Nome_dono  + ", telefone=" + Telefone +"]";
	}
}
