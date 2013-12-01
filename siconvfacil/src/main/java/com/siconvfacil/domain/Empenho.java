package com.siconvfacil.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Empenho implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@Column
	private String numero;
	
	@Column(name="numero_minuta")
	private String numeroMinuta;
	
	@ManyToOne
	@JoinColumn(name="id_convenio")
	private Convenio convenio;
	
	@ManyToOne
	@JoinColumn(name="id_especie")
	private EspecieEmpenho especie;
	
	@Column(name="cod_unidade_gestora_emitente")
	private long codUnidadeGestoraEmitente;
	
	@Column(name="cod_unidade_gestora_referencia")
	private long codUnidadeGestoraReferencia;
	
	@Column(name="cod_unidade_gestora_responsavel")
	private long codUnidadeGestoraResponsavel;
	
	@Column(name="cod_gestao_emitente")
	private long codGestaoEmitente;
	
	@Column(name="cod_gestao_referencia")
	private long codGestaoReferencia;
	
	@Column(name="cod_fonte_recurso")
	private long codFonteRecurso;
	
	@Column(name="tipo_empenho")
	private String tipoEmpenho;
	
	@Column(name="numero_plano_trabalho_resumido")
	private long numeroPlanoTrabalhoResumido;
	
	@Column(name="numero_plano_interno")
	private String numeroPlanoInterno;
	
	@Column(name="esfera_orcamentaria")
	private String esferaOrcamentaria;
	
	@Column(name="data_emissao")
	private Date dataEmissao;
	
	@Column(name="numero_interno_concedente")
	private String numeroInternoConcedente;
	
	@Column(name="numero_interno_concedente_referencia")
	private String numeroInternoConcedenteReferencia;
	
	@Column
	private String observacao;
	
	@Column
	private String situacao;
	
	@Column(name="numero_lista")
	private String numeroLista;
	
	@Column(name="numero_programa_trabalho")
	private long numeroProgramaTrabalho;
	
	@Column(name="cod_unidade_orcamentaria")
	private long codUnidadeOrcamentaria;
	
	@Column(name="numero_natureza_despesa_subitem")
	private String numeroNaturezaDespesaSubitem;
	
	@Column(name="descricao_natureza_despesa_subitem")
	private String descricaoNaturezaDespesaSubitem;
	
	@Column
	private double valor;
	
	@Column(name="numero_empenho_referencia")
	private String numeroEmpenhoReferencia;
	
	@ManyToOne
	@JoinColumn(name="id_proponente_favorecido")
	private Proponente proponenteFavorecido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumeroMinuta() {
		return numeroMinuta;
	}

	public void setNumeroMinuta(String numeroMinuta) {
		this.numeroMinuta = numeroMinuta;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public EspecieEmpenho getEspecie() {
		return especie;
	}

	public void setEspecie(EspecieEmpenho especie) {
		this.especie = especie;
	}

	public long getCodUnidadeGestoraEmitente() {
		return codUnidadeGestoraEmitente;
	}

	public void setCodUnidadeGestoraEmitente(long codUnidadeGestoraEmitente) {
		this.codUnidadeGestoraEmitente = codUnidadeGestoraEmitente;
	}

	public long getCodUnidadeGestoraReferencia() {
		return codUnidadeGestoraReferencia;
	}

	public void setCodUnidadeGestoraReferencia(long codUnidadeGestoraReferencia) {
		this.codUnidadeGestoraReferencia = codUnidadeGestoraReferencia;
	}

	public long getCodUnidadeGestoraResponsavel() {
		return codUnidadeGestoraResponsavel;
	}

	public void setCodUnidadeGestoraResponsavel(long codUnidadeGestoraResponsavel) {
		this.codUnidadeGestoraResponsavel = codUnidadeGestoraResponsavel;
	}

	public long getCodGestaoEmitente() {
		return codGestaoEmitente;
	}

	public void setCodGestaoEmitente(long codGestaoEmitente) {
		this.codGestaoEmitente = codGestaoEmitente;
	}

	public long getCodGestaoReferencia() {
		return codGestaoReferencia;
	}

	public void setCodGestaoReferencia(long codGestaoReferencia) {
		this.codGestaoReferencia = codGestaoReferencia;
	}

	public long getCodFonteRecurso() {
		return codFonteRecurso;
	}

	public void setCodFonteRecurso(long codFonteRecurso) {
		this.codFonteRecurso = codFonteRecurso;
	}

	public String getTipoEmpenho() {
		return tipoEmpenho;
	}

	public void setTipoEmpenho(String tipoEmpenho) {
		this.tipoEmpenho = tipoEmpenho;
	}

	public long getNumeroPlanoTrabalhoResumido() {
		return numeroPlanoTrabalhoResumido;
	}

	public void setNumeroPlanoTrabalhoResumido(long numeroPlanoTrabalhoResumido) {
		this.numeroPlanoTrabalhoResumido = numeroPlanoTrabalhoResumido;
	}

	public String getNumeroPlanoInterno() {
		return numeroPlanoInterno;
	}

	public void setNumeroPlanoInterno(String numeroPlanoInterno) {
		this.numeroPlanoInterno = numeroPlanoInterno;
	}

	public String getEsferaOrcamentaria() {
		return esferaOrcamentaria;
	}

	public void setEsferaOrcamentaria(String esferaOrcamentaria) {
		this.esferaOrcamentaria = esferaOrcamentaria;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getNumeroInternoConcedente() {
		return numeroInternoConcedente;
	}

	public void setNumeroInternoConcedente(String numeroInternoConcedente) {
		this.numeroInternoConcedente = numeroInternoConcedente;
	}

	public String getNumeroInternoConcedenteReferencia() {
		return numeroInternoConcedenteReferencia;
	}

	public void setNumeroInternoConcedenteReferencia(
			String numeroInternoConcedenteReferencia) {
		this.numeroInternoConcedenteReferencia = numeroInternoConcedenteReferencia;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(String numeroLista) {
		this.numeroLista = numeroLista;
	}

	public long getNumeroProgramaTrabalho() {
		return numeroProgramaTrabalho;
	}

	public void setNumeroProgramaTrabalho(long numeroProgramaTrabalho) {
		this.numeroProgramaTrabalho = numeroProgramaTrabalho;
	}

	public long getCodUnidadeOrcamentaria() {
		return codUnidadeOrcamentaria;
	}

	public void setCodUnidadeOrcamentaria(long codUnidadeOrcamentaria) {
		this.codUnidadeOrcamentaria = codUnidadeOrcamentaria;
	}

	public String getNumeroNaturezaDespesaSubitem() {
		return numeroNaturezaDespesaSubitem;
	}

	public void setNumeroNaturezaDespesaSubitem(String numeroNaturezaDespesaSubitem) {
		this.numeroNaturezaDespesaSubitem = numeroNaturezaDespesaSubitem;
	}

	public String getDescricaoNaturezaDespesaSubitem() {
		return descricaoNaturezaDespesaSubitem;
	}

	public void setDescricaoNaturezaDespesaSubitem(
			String descricaoNaturezaDespesaSubitem) {
		this.descricaoNaturezaDespesaSubitem = descricaoNaturezaDespesaSubitem;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNumeroEmpenhoReferencia() {
		return numeroEmpenhoReferencia;
	}

	public void setNumeroEmpenhoReferencia(String numeroEmpenhoReferencia) {
		this.numeroEmpenhoReferencia = numeroEmpenhoReferencia;
	}

	public Proponente getProponenteFavorecido() {
		return proponenteFavorecido;
	}

	public void setProponenteFavorecido(Proponente proponenteFavorecido) {
		this.proponenteFavorecido = proponenteFavorecido;
	}
	
}
