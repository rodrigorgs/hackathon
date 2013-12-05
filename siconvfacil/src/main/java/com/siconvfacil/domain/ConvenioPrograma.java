package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.siconvfacil.domain.pk.ConvenioProgramaPK;

@Entity
@IdClass(ConvenioProgramaPK.class)
@Table(name="convenio_programa")
public class ConvenioPrograma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@JoinColumn(name="id_convenio")
	private Convenio convenio;
	
	@Id
	@JoinColumn(name="id_programa")
	private Programa programa;
	
	@Column(name="valor_global")
	private double valorGlobal;
	
	@Column(name="valor_repasse")
	private double valorRepasse;
	
	@Column(name="valor_contrapartida")
	private double valorContrapartida;
	
	@Column(name="valor_contrapartida_financeira")
	private double valorContrapartidaFinanceira;
	
	@Column(name="valor_contrapartida_bens")
	private double valorContrapartidaBens;

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public double getValorGlobal() {
		return valorGlobal;
	}

	public void setValorGlobal(double valorGlobal) {
		this.valorGlobal = valorGlobal;
	}

	public double getValorRepasse() {
		return valorRepasse;
	}

	public void setValorRepasse(double valorRepasse) {
		this.valorRepasse = valorRepasse;
	}

	public double getValorContrapartida() {
		return valorContrapartida;
	}

	public void setValorContrapartida(double valorContrapartida) {
		this.valorContrapartida = valorContrapartida;
	}

	public double getValorContrapartidaFinanceira() {
		return valorContrapartidaFinanceira;
	}

	public void setValorContrapartidaFinanceira(double valorContrapartidaFinanceira) {
		this.valorContrapartidaFinanceira = valorContrapartidaFinanceira;
	}

	public double getValorContrapartidaBens() {
		return valorContrapartidaBens;
	}

	public void setValorContrapartidaBens(double valorContrapartidaBens) {
		this.valorContrapartidaBens = valorContrapartidaBens;
	}
	
}
