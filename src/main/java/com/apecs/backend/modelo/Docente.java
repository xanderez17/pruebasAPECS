package com.apecs.backend.modelo;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="docente")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Docente extends Persona{
	
	private String especialidad;
	
	@OneToMany(mappedBy = "docente")
	private List<Curso> curso;

	public Docente() {
		
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/*
	 * public List<Curso> getCurso() {
	 
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
*/
}
