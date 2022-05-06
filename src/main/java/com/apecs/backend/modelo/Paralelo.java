package com.apecs.backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paralelo")
public class Paralelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParalelo;

	@Column(nullable = false)
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "idAula")
	private Aula aula;

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
	 * public List<Curso> getCurso() { return curso; }
	 * 
	 * public void setCurso(List<Curso> curso) { this.curso = curso; }
	 */

}
