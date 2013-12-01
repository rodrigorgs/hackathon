package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orgao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Integer id;
	
	@Column
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_orgao_superior")
	private Orgao orgaoSuperior;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Orgao getOrgaoSuperior() {
		return orgaoSuperior;
	}

	public void setOrgaoSuperior(Orgao orgaoSuperior) {
		this.orgaoSuperior = orgaoSuperior;
	}
	
}
