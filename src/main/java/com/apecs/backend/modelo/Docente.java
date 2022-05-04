package com.apecs.backend.modelo;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="docente")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Docente extends Persona{
	
	private String especialidad;

	public Docente() {
		
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
