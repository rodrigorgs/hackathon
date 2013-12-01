package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="composicao_repasse_proposta")
public class ComposicaoRepasseProposta implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@Column
	private long id;
	
	@ManyToOne
	@JoinColumn(name="id_proposta")
	private Proposta proposta;
	
	@Column(name="emenda_id_programa")
	private long emendaIdPrograma;
	
	@Column(name="emenda_numero")
	private long emendaNumero;
	
	@Column(name="emenda_id_programa_qualificacao")
	private long emendaIdProgramaQualificacao;
	
	@Column
	private String tipo;
	
	@Column(name="valor_repasse")
	private double valorRepasse;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Proposta getProposta() {
		return proposta;
	}

	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}

	public long getEmendaIdPrograma() {
		return emendaIdPrograma;
	}

	public void setEmendaIdPrograma(long emendaIdPrograma) {
		this.emendaIdPrograma = emendaIdPrograma;
	}

	public long getEmendaNumero() {
		return emendaNumero;
	}

	public void setEmendaNumero(long emendaNumero) {
		this.emendaNumero = emendaNumero;
	}

	public long getEmendaIdProgramaQualificacao() {
		return emendaIdProgramaQualificacao;
	}

	public void setEmendaIdProgramaQualificacao(long emendaIdProgramaQualificacao) {
		this.emendaIdProgramaQualificacao = emendaIdProgramaQualificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValorRepasse() {
		return valorRepasse;
	}

	public void setValorRepasse(double valorRepasse) {
		this.valorRepasse = valorRepasse;
	}
	
	
	
}
