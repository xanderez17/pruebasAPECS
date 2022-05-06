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
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTicket;

	@Column(nullable = false)
	private Date fechaEmision;

	@ManyToOne
	@JoinColumn(name = "idAlumno")
	private Alumno Alumno;

	@ManyToOne
	@JoinColumn(name = "idCurso")
	private Curso curso;

	@ManyToOne
	@JoinColumn(name = "idFormaPago")
	private FormaPago formaPago;

	public Ticket() {
		super();
	}

	public Long getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(Long idTicket) {
		this.idTicket = idTicket;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
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

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

}
