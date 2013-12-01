package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="proposta_programa")
public class PropostaPrograma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name="id_proposta")
	private Proposta proposta;
	
	@Id
	@ManyToOne
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

	public Proposta getProposta() {
		return proposta;
	}

	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
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
