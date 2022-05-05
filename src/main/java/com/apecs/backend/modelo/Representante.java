package com.apecs.backend.modelo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "representante")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Representante extends Persona{

	
	@OneToMany(mappedBy = "representante")
	private List<Parentezco> listaParentezco;
	
	public Representante() {
		super();
	}

	public List<Parentezco> getListaParentezco() {
		return listaParentezco;
	}

	public void setListaParentezco(List<Parentezco> listaParentezco) {
		this.listaParentezco = listaParentezco;
	}
	

	
}
