package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Municipio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String uf;
	
	@Column(name="uf_nome")
	private String ufNome;
	
	@Column(name="_regiao")
	private String regiao;

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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getUfNome() {
		return ufNome;
	}

	public void setUfNome(String ufNome) {
		this.ufNome = ufNome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
}
