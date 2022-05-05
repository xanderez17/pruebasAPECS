package com.apecs.backend.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMateria;
	
	private String nombre;
	
	private String contenido;
	
	/*
	@OneToMany(mappedBy = "materia")
	private List<Curso> curso;
	*/
	
	public Materia() {
		super();
	}
	

	

	public Long getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	/*
	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	*/
}
