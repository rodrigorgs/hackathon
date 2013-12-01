package com.siconvfacil.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="habilitacao_area_atuacao")
public class HabilitacaoAreaAtuacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_subarea")
	private SubareaAtuacaoProponente subarea;
	
	@ManyToOne
	@JoinColumn(name="id_proponente")
	private Proponente proponente;
	
	@ManyToOne
	@JoinColumn(name="id_orgao")
	private Orgao orgao;
	
	@ManyToOne
	@JoinColumn(name="id_pessoa_responsavel")
	private PessoaResponsavel pessoaResponsavel;
	
	@Column
	private String situacao;
	
	@Column(name="data_inicio")
	private Date dataInicio;
	
	@Column(name="data_vencimento")
	private Date dataVencimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SubareaAtuacaoProponente getSubarea() {
		return subarea;
	}

	public void setSubarea(SubareaAtuacaoProponente subarea) {
		this.subarea = subarea;
	}

	public Proponente getProponente() {
		return proponente;
	}

	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}

	public Orgao getOrgao() {
		return orgao;
	}

	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}

	public PessoaResponsavel getPessoaResponsavel() {
		return pessoaResponsavel;
	}

	public void setPessoaResponsavel(PessoaResponsavel pessoaResponsavel) {
		this.pessoaResponsavel = pessoaResponsavel;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}
