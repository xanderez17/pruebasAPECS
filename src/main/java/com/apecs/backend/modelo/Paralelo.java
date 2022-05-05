package com.apecs.backend.modelo;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "paralelos")
public class Paralelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParalelo;
	
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idAula")
	private Aula aula;
	
	/*
	@OneToMany(mappedBy = "paralelo")
	private List<Curso> curso;
	*/
	public Paralelo() {
		super();
	}

	public Long getIdParalelo() {
		return idParalelo;
	}

	public void setIdParalelo(Long idParalelo) {
		this.idParalelo = idParalelo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
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
