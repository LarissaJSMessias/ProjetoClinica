package com.ProjClinica.model.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="TAB_CONSULTA") 
public class Consulta {
	
	private Integer id;
	private String data;   
	private String infos;
	private String exame;
	
	private Animal animal;
	private Veterinario veterinario;
	
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "CONSULTA_ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "CONSULTA_DATA", length =60,  nullable = false)
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Column(name = "CONSULTA_INFOS", length =60,  nullable = false)
	public String getInfos() {
		return infos;
	}
	public void setInfos(String infos) {
		this.infos = infos;
	}

	@Column(name = "CONSULTA_EXAME", length =60,  nullable = false)
	public String getExame() {
		return exame;
	}
	public void setExame(String exame) {
		this.exame = exame;
	}
	
	
	
	@ManyToOne
	@JoinColumn(name = "ANIMAL_ID", nullable =false)
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "VETERINARIO_ID", nullable =false)
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
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
		Consulta other = (Consulta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Consulta [id=" + id + ", data=" + data + ", infos=" + infos + ", exame=" + exame + ", animal=" + animal
				+ ", veterinario=" + veterinario + "]";
	}
	
	
	
	
	
	
	
	

}
