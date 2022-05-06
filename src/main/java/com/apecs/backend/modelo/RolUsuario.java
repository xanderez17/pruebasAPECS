package com.apecs.backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "rol")
public class RolUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRol;
	
	@Column(nullable = false)
	private String rol;
	
	

	public RolUsuario() {
		super();
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idUsuario) {
		this.idRol = idUsuario;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	

}
