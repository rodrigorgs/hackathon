package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emenda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name="id_programa")
	private Programa programa;
	
	@Id
	@Column
	private Long numero;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_programa_qualificacao")
	private Programa programaQualificacao;
	
	@Column
	private double valor;

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Programa getProgramaQualificacao() {
		return programaQualificacao;
	}

	public void setProgramaQualificacao(Programa programaQualificacao) {
		this.programaQualificacao = programaQualificacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
