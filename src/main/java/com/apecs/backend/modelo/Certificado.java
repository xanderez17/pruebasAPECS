package com.apecs.backend.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificado")
public class Certificado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCertificado;
	
	private String descripcion;
	
	private String estado;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Estudiante estudiante;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Curso curso;
	
	public Certificado() {
	
	}

	public Certificado(Long idCertificado, String descripcion, String estado, Estudiante estudiante, Curso curso) {
		super();
		this.idCertificado = idCertificado;
		this.descripcion = descripcion;
		this.estado = estado;
		this.estudiante = estudiante;
		this.curso = curso;
	}

	public Long getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(Long idCertificado) {
		this.idCertificado = idCertificado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
