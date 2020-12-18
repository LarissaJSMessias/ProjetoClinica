package com.ProjClinica.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TAB_VETERINARIO")

public class Veterinario {

	private Integer id;
	private String Nome_veterinario;
	private Integer CPF_veterinario;
	private String telefone;
	private String CRMV;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "VETERINARIO_ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "VETERINARIO_NOME", length =60,  nullable = false)
	public String getNome_veterinario() {
		return Nome_veterinario;
	}
	public void setNome_veterinario(String nome_veterinario) {
		Nome_veterinario = nome_veterinario;
	}
	
	@Column(name = "VETERINARIO_CPF", length =60,  nullable = false)
	public Integer getCPF_veterinario() {
		return CPF_veterinario;
	}
	public void setCPF_veterinario(Integer cPF_veterinario) {
		CPF_veterinario = cPF_veterinario;
	}
	
	@Column(name = "VETERINARIO_TELEFONE", length =60,  nullable = false)
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Column(name = "VETERINARIO_CRMV", length =60,  nullable = false)
	public String getCRMV() {
		return CRMV;
	}
	public void setCRMV(String cRMV) {
		CRMV = cRMV;
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
		Veterinario other = (Veterinario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Veterinario [id=" + id + ", Nome_veterinario=" + Nome_veterinario + ", CPF_veterinario="
				+ CPF_veterinario + ", telefone=" + telefone + ", CRMV=" + CRMV + "]";
	}
	
	
	
	
}
