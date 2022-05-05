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
@Table(name = "calificacion")
public class Calificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCalificacion;

	@Column(nullable = false)
	private Double valorCalificacion;

	@Column(nullable = false)
	private String observaciones;

	@ManyToOne
	@JoinColumn(name = "idAlumno")
	private Alumno Alumno;

	@ManyToOne
	@JoinColumn(name = "idCurso")
	private Curso curso;

	public Calificacion() {
		super();
	}

	public long getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(long idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public Double getValorCalificacion() {
		return valorCalificacion;
	}

	public void setValorCalificacion(Double valorCalificacion) {
		this.valorCalificacion = valorCalificacion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Alumno getAlumno() {
		return Alumno;
	}

	public void setAlumno(Alumno alumno) {
		Alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
