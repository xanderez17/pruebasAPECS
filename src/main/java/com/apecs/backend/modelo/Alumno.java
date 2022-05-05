package com.apecs.backend.modelo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Alumno extends Persona{

	@Column(nullable = true)
	private String ocupacion;
	
	@Column(nullable = true)
	private String cargo;

	@OneToMany(mappedBy = "alumno")
	private List<Parentezco> listaParentezco;
	
	public Alumno() {

	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Parentezco> getListaParentezco() {
		return listaParentezco;
	}

	public void setListaParentezco(List<Parentezco> listaParentezco) {
		this.listaParentezco = listaParentezco;
	}


	

}