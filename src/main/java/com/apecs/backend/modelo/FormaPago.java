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
@Table(name = "formaPago")
public class FormaPago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormaPago;

	@Column(nullable = false)
	private String periodoPago;

	@Column(nullable = false)
	private String tipoPago;

	@Column(nullable = false)
	private Double Pago;

	/*
	 * @OneToMany(mappedBy = "formaPago") private List<Contrato> contrato;
	 */
	public FormaPago() {
		super();
	}

	public Long getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(Long idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getPeriodoPago() {
		return periodoPago;
	}

	public void setPeriodoPago(String periodoPago) {
		this.periodoPago = periodoPago;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public Double getPago() {
		return Pago;
	}

	public void setPago(Double pago) {
		Pago = pago;
	}

	/*
	 * public List<Contrato> getContrato() { return contrato; }
	 * 
	 * public void setContrato(List<Contrato> contrato) { this.contrato = contrato;
	 * }
	 */

}
