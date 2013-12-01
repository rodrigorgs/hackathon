package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Proponente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@Column
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_esfera_administrativa")
	private EsferaAdministrativa esferaAdministrativa;
	
	@ManyToOne
	@JoinColumn(name="id_municipio")
	private Municipio municipio;
	
	@Column
	private String endereco;
	
	@Column
	private String cep;
	
	@Column
	private String telefone;
	
	@Column
	private String fax;
	
	@Column(name="nome_responsavel")
	private String nomeResponsavel;
	
	@ManyToOne
	@JoinColumn(name="id_responsavel")
	private PessoaResponsavel pessoaResponsavel;
	
	@Column(name="inscricao_estadual")
	private String inscricaoEstadual;
	
	@Column(name="inscricao_municipal")
	private String inscricaoMunicipal;
	
	@ManyToOne
	@JoinColumn(name="id_natureza_juridica")
	private NaturezaJuridica naturezaJuridica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EsferaAdministrativa getEsferaAdministrativa() {
		return esferaAdministrativa;
	}

	public void setEsferaAdministrativa(EsferaAdministrativa esferaAdministrativa) {
		this.esferaAdministrativa = esferaAdministrativa;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public PessoaResponsavel getPessoaResponsavel() {
		return pessoaResponsavel;
	}

	public void setPessoaResponsavel(PessoaResponsavel pessoaResponsavel) {
		this.pessoaResponsavel = pessoaResponsavel;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public NaturezaJuridica getNaturezaJuridica() {
		return naturezaJuridica;
	}

	public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}
	
	
}
