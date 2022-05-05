package com.apecs.backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCurso;

	@Column(nullable = false)
	private String titulo;

	@Column(nullable = false)
	private String descripcion;

	@Column(nullable = false)
	private String categoria;

	@Column(nullable = false)
	private int cupos;

	@Column(nullable = false)
	private String seminarios;

	@Column(nullable = false)
	private int duracion;
	
	@Column(nullable = false)
	private String fechaInicio;
	
	@Column(nullable = false)
	private String fechaFin;

	@Column(nullable = false)
	private String fechaInscripcion;

	@Column(nullable = false)
	private String img;

	@Column(nullable = false)
	private String pdf;

	
	@ManyToOne
	@JoinColumn(name = "idMateria")
	private Materia materia;
	
	@ManyToOne
	@JoinColumn(name = "idDocente")
	private Docente docente;

	@ManyToOne
	@JoinColumn(name = "idHorario")
	private Horarios horario;

	@ManyToOne
	@JoinColumn(name = "idParalelo")
	private Paralelo paralelo;

	public Curso() {
		super();
	}

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCupos() {
		return cupos;
	}

	public void setCupos(int cupos) {
		this.cupos = cupos;
	}

	public String getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(String seminarios) {
		this.seminarios = seminarios;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(String fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Horarios getHorario() {
		return horario;
	}

	public void setHorario(Horarios horario) {
		this.horario = horario;
	}

	public Paralelo getParalelo() {
		return paralelo;
	}

	public void setParalelo(Paralelo paralelo) {
		this.paralelo = paralelo;
	}
	
	
	

}
