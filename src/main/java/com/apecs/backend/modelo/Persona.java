package com.apecs.backend.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String identificacion;

	@Column(nullable = false)
	private String apellidoPrimer;

	@Column(nullable = false)
	private String apellidoSegundo;

	@Column(nullable = false)
	private String nombrePrimer;

	@Column(nullable = false)
	private String nombreSegundo;

	@Column(nullable = true)
	private Date fechaNacimiento;

	@Column(nullable = false)
	private String direccion;

	@Column(nullable = false)
	private String correo;

	@Column(nullable = false)
	private String telefono;

	@Column(nullable = false)
	private String sexo;

	public Persona() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getApellidoPrimer() {
		return apellidoPrimer;
	}

	public void setApellidoPrimer(String apellidoPrimer) {
		this.apellidoPrimer = apellidoPrimer;
	}

	public String getApellidoSegundo() {
		return apellidoSegundo;
	}

	public void setApellidoSegundo(String apellidoSegundo) {
		this.apellidoSegundo = apellidoSegundo;
	}

	public String getNombrePrimer() {
		return nombrePrimer;
	}

	public void setNombrePrimer(String nombrePrimer) {
		this.nombrePrimer = nombrePrimer;
	}

	public String getNombreSegundo() {
		return nombreSegundo;
	}

	public void setNombreSegundo(String nombreSegundo) {
		this.nombreSegundo = nombreSegundo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
