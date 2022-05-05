package com.apecs.backend.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parentezco")
public class Parentezco {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private Long id;

@Column(nullable = false)
private String parentezco;


@ManyToOne
@JoinColumn(name = "idRepresentante")
private Representante representante;

@ManyToOne
@JoinColumn(name = "idAlumno")
private Alumno alumno;



public Parentezco() {
	super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getParentezco() {
	return parentezco;
}

public void setParentezco(String parentezco) {
	this.parentezco = parentezco;
}

public Representante getRepresentante() {
	return representante;
}

public void setRepresentante(Representante representante) {
	this.representante = representante;
}

public Alumno getAlumno() {
	return alumno;
}

public void setAlumno(Alumno alumno) {
	this.alumno = alumno;
}


}
