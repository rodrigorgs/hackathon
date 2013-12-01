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
@Table(name="ordem_bancaria")
public class OrdemBancaria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@Column
	private String numero;
	
	@Column(name="id_unidade_emitente")
	private long idUnidadeEmitente;
	
	@ManyToOne
	@JoinColumn(name="id_convenio")
	private Convenio convenio;
	
	@Column(name="numero_documento_habil_siafi")
	private String numeroDocumentoHabilSiafi;
	
	@Column(name="numero_interno_concedente")
	private String numeroInternoConcedente;
	
	@Column(name="cod_gestao_emitente")
	private long codGestaoEmitente;
	
	@Column(name="cod_gestao_favorecida")
	private long codGestaoFavorecida;
	
	@Column
	private String observacao;
	
	@Column(name="data_ajuste")
	private Date dataAjuste;
	
	@Column(name="situacao")
	private String situacao;
	
	@Column(name="justificativa_inadiplencia")
	private String justificativaInadiplencia;
	
	@Column(name="cod_cancelamento")
	private int codCancelamento;
	
	@Column(name="numero_doc_siafi_cancelamento")
	private long numeroDocSiafiCancelamento;
	
	@Column(name="observacao_cancelamento")
	private String observacaoCancelamento;
	
	@Column(name="data_cancelamento")
	private Date dataCancelamento;
	
	@Column(name="no_cpr")
	private boolean noCpr;
	
	@Column(name="tipo_documento")
	private String tipoDocumento;
	
	@Column
	private double valor;
	
	@Column
	private Date data;

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

	public long getIdUnidadeEmitente() {
		return idUnidadeEmitente;
	}

	public void setIdUnidadeEmitente(long idUnidadeEmitente) {
		this.idUnidadeEmitente = idUnidadeEmitente;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public String getNumeroDocumentoHabilSiafi() {
		return numeroDocumentoHabilSiafi;
	}

	public void setNumeroDocumentoHabilSiafi(String numeroDocumentoHabilSiafi) {
		this.numeroDocumentoHabilSiafi = numeroDocumentoHabilSiafi;
	}

	public String getNumeroInternoConcedente() {
		return numeroInternoConcedente;
	}

	public void setNumeroInternoConcedente(String numeroInternoConcedente) {
		this.numeroInternoConcedente = numeroInternoConcedente;
	}

	public long getCodGestaoEmitente() {
		return codGestaoEmitente;
	}

	public void setCodGestaoEmitente(long codGestaoEmitente) {
		this.codGestaoEmitente = codGestaoEmitente;
	}

	public long getCodGestaoFavorecida() {
		return codGestaoFavorecida;
	}

	public void setCodGestaoFavorecida(long codGestaoFavorecida) {
		this.codGestaoFavorecida = codGestaoFavorecida;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataAjuste() {
		return dataAjuste;
	}

	public void setDataAjuste(Date dataAjuste) {
		this.dataAjuste = dataAjuste;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getJustificativaInadiplencia() {
		return justificativaInadiplencia;
	}

	public void setJustificativaInadiplencia(String justificativaInadiplencia) {
		this.justificativaInadiplencia = justificativaInadiplencia;
	}

	public int getCodCancelamento() {
		return codCancelamento;
	}

	public void setCodCancelamento(int codCancelamento) {
		this.codCancelamento = codCancelamento;
	}

	public long getNumeroDocSiafiCancelamento() {
		return numeroDocSiafiCancelamento;
	}

	public void setNumeroDocSiafiCancelamento(long numeroDocSiafiCancelamento) {
		this.numeroDocSiafiCancelamento = numeroDocSiafiCancelamento;
	}

	public String getObservacaoCancelamento() {
		return observacaoCancelamento;
	}

	public void setObservacaoCancelamento(String observacaoCancelamento) {
		this.observacaoCancelamento = observacaoCancelamento;
	}

	public Date getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}

	public boolean isNoCpr() {
		return noCpr;
	}

	public void setNoCpr(boolean noCpr) {
		this.noCpr = noCpr;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
