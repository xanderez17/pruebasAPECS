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
@Table(name = "aula")
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAAula;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private int capacidad;

	@Column(nullable = false)
	private String modalidad;

	@Column(nullable = false)
	private String ubicacion;

	public Aula() {
		super();
	}

	public Long getIdAAula() {
		return idAAula;
	}

	public void setIdAAula(Long idAAula) {
		this.idAAula = idAAula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/*
	 * public List<Paralelo> getParalelo() { return paralelo; }
	 * 
	 * public void setParalelo(List<Paralelo> paralelo) { this.paralelo = paralelo;
	 * }
	 */

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
