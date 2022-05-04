package com.apecs.backend.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aulas")
public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAAula;
	
	private String nombre;
	
	private int capacidad;
	
	@OneToMany(mappedBy = "aula")
	private List<Paralelo> paralelo;

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

	public List<Paralelo> getParalelo() {
		return paralelo;
	}

	public void setParalelo(List<Paralelo> paralelo) {
		this.paralelo = paralelo;
	}
	
}
