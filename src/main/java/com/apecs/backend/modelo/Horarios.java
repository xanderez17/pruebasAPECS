package com.apecs.backend.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "horarios")
public class Horarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHorario;
	
	@Column(nullable = false)
	private String dias;
	
	@Column(nullable = false)
	private String horaInicio;
	
	@Column(nullable = false)
	private String horaFin;

	
	@OneToMany(mappedBy = "horario")
	private List<Curso> curso;
	
	public Horarios() {
		super();
	}

	public Long getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Long idHorario) {
		this.idHorario = idHorario;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	
}
