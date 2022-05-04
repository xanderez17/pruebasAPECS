package com.apecs.backend.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "certificados")
public class Certificado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCertificado;
	
	private String estado;
	
	private String detalle;
	
	private String codigoQR;

	public Certificado() {
		super();
	}

	public Long getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(Long idCertificado) {
		this.idCertificado = idCertificado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getCodigoQR() {
		return codigoQR;
	}

	public void setCodigoQR(String codigoQR) {
		this.codigoQR = codigoQR;
	}
	
}
