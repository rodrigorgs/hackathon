package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subarea_atuacao_proponente")
public class SubareaAtuacaoProponente implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_area")
	private AreaAtuacaoProponente areaAtuacaoProponente;
	
	@Column
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AreaAtuacaoProponente getAreaAtuacaoProponente() {
		return areaAtuacaoProponente;
	}

	public void setAreaAtuacaoProponente(AreaAtuacaoProponente areaAtuacaoProponente) {
		this.areaAtuacaoProponente = areaAtuacaoProponente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
