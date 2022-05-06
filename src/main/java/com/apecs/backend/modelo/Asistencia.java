package com.apecs.backend.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asistencia")
public class Asistencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAsignatura;

	@Column(nullable = false)
	private Date fechaAsistencia;

	@ManyToOne
	@JoinColumn(name = "idAlumno")
	private Alumno Alumno;

	@ManyToOne
	@JoinColumn(name = "idCurso")
	private Curso curso;

	public Asistencia() {
		super();
	}

	public Long getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(Long idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public Date getFechaAsistencia() {
		return fechaAsistencia;
	}

	public void setFechaAsistencia(Date fechaAsistencia) {
		this.fechaAsistencia = fechaAsistencia;
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
