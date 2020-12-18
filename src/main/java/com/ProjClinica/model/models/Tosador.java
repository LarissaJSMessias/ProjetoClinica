package com.ProjClinica.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TAB_TOSADOR") 
public class Tosador {
	
	private Integer id;
	private String nome_tosador;
	private Integer CPF_tosador;
	private String telefone;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "TOSADOR_ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "TOSADOR_NOME", length =60,  nullable = false)
	public String getNome_tosador() {
		return nome_tosador;
	}
	public void setNome_tosador(String nome_tosador) {
		this.nome_tosador = nome_tosador;
	}
	
	@Column(name = "TOSADOR_CPF", length =60,  nullable = false)
	public Integer getCPF_tosador() {
		return CPF_tosador;
	}
	public void setCPF_tosador(Integer cPF_tosador) {
		CPF_tosador = cPF_tosador;
	}
	
	@Column(name = "TOSADOR_TELEFONE", length =60,  nullable = false)
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		Tosador other = (Tosador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tosador [id=" + id + ", nome_tosador=" + nome_tosador + ", CPF_tosador=" + CPF_tosador + ", telefone=" + telefone + "]";
	}
	
	
	


}
