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
@Table(name = "matricula")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMatricula;
	
	@Column(nullable = false)
	private Double valorMatricula;
	
	@Column(nullable = false)
	private Double valorCurso;

	@OneToMany(mappedBy = "matricula")
	private List<Contrato> contrato;

	public Matricula() {
		super();
	}

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public Double getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(Double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(Double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public List<Contrato> getContrato() {
		return contrato;
	}

	public void setContrato(List<Contrato> contrato) {
		this.contrato = contrato;
	}
	
	
	
}
