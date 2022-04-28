package com.apecs.backend.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contrato")

public class Contrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContrato;
	
	private String descripcion;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Estudiante estudiante;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Curso curso;

	public Contrato() {
		
	}

	public Contrato(Long idContrato, String descripcion, Estudiante estudiante, Curso curso) {
		super();
		this.idContrato = idContrato;
		this.descripcion = descripcion;
		this.estudiante = estudiante;
		this.curso = curso;
	}

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
