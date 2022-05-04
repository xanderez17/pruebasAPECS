package com.apecs.backend.modelo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "representante")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Representante extends Persona{

	@Column(nullable = false)
	private String parentezco;
	
	@OneToMany(mappedBy = "representante")
	private List<Alumno> listaAlumnos;

	public Representante() {
		super();
	}

	public String getParentezco() {
		return parentezco;
	}

	public void setParentezco(String parentezco) {
		this.parentezco = parentezco;
	}

	
}
