package com.siconvfacil.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Proposta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@Column
	private Integer sequencial;
	
	@Column(name="inicio_execucao")
	private Date inicioExecucao;
	
	@Column(name="fim_execucao")
	private Date fimExecucao;
	
	@Column
	private String justificativa;
	
	@Column(name="valor_global")
	private double valorGlobal;
	
	@Column(name="valor_repasse")
	private double valorRepasse;
	
	@Column(name="valor_contra_partida")
	private double valorContraPartida;
	
	@Column(name="valor_contrapartida_financeira")
	private double valorContraPartidaFinanceira;
	
	@Column(name="valor_contrapartida_bens_servicos")
	private double valorContraPartidaBensServicos;
	
	@Column
	private int ano;
	
	@Column(name="data_envio_proposta")
	private Date dataEnvioProposta;
	
	@Column(name="data_cadastramento_proposta")
	private Date dataCadastramentoProposta;
	
	@ManyToOne
	@JoinColumn(name="id_situacao")
	private SituacaoProposta situacaoProposta;
	
	@Column
	private String objeto;
	
	@Column(name="capacidade_tecnica")
	private String capacidadeTecnica;
	
	@Column(name="agencia_bancaria")
	private String agenciaBancaria;
	
	@Column(name="conta_bancaria")
	private String contaBancaria;
	
	@Column(name="nome_banco")
	private String nomeBanco;
	
	@Column(name="codigo_banco")
	private int codigoBanco;
	
	@Column(name="indicador_parecer_tecnico")
	private boolean indicadorParecerTecnico;
	
	@Column(name="indicador_parecer_juridico")
	private boolean indicadorParecerJuridico;
	
	@Column(name="indicador_parecer_gestor")
	private boolean indicadorParecerGestor;
	
	@Column(name="numero_processo")
	private String numeroProcesso;
	
	@ManyToOne
	@JoinColumn(name="id_proponente")
	private Proponente proponente;
	
	@ManyToOne
	@JoinColumn(name="id_orgao_concedente")
	private Orgao orgaoConcedente;
	
	@ManyToOne
	@JoinColumn(name="id_modalidade")
	private ModalidadeProposta modalidade;
	
	@ManyToOne
	@JoinColumn(name="id_pessoa_responsavel_pelo_concedente")
	private PessoaResponsavel pessoaResponsavelPeloConcedente;
	
	@ManyToOne
	@JoinColumn(name="id_pessoa_responsavel_pelo_cadastramento")
	private PessoaResponsavel pessoaResponsavelPeloCadastramento;
	
	@ManyToOne
	@JoinColumn(name="id_pessoa_responsavel_pelo_envio")
	private PessoaResponsavel pessoaResponsavelPeloEnvio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSequencial() {
		return sequencial;
	}

	public void setSequencial(Integer sequencial) {
		this.sequencial = sequencial;
	}

	public Date getInicioExecucao() {
		return inicioExecucao;
	}

	public void setInicioExecucao(Date inicioExecucao) {
		this.inicioExecucao = inicioExecucao;
	}

	public Date getFimExecucao() {
		return fimExecucao;
	}

	public void setFimExecucao(Date fimExecucao) {
		this.fimExecucao = fimExecucao;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
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

	public double getValorContraPartida() {
		return valorContraPartida;
	}

	public void setValorContraPartida(double valorContraPartida) {
		this.valorContraPartida = valorContraPartida;
	}

	public double getValorContraPartidaFinanceira() {
		return valorContraPartidaFinanceira;
	}

	public void setValorContraPartidaFinanceira(double valorContraPartidaFinanceira) {
		this.valorContraPartidaFinanceira = valorContraPartidaFinanceira;
	}

	public double getValorContraPartidaBensServicos() {
		return valorContraPartidaBensServicos;
	}

	public void setValorContraPartidaBensServicos(
			double valorContraPartidaBensServicos) {
		this.valorContraPartidaBensServicos = valorContraPartidaBensServicos;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Date getDataEnvioProposta() {
		return dataEnvioProposta;
	}

	public void setDataEnvioProposta(Date dataEnvioProposta) {
		this.dataEnvioProposta = dataEnvioProposta;
	}

	public Date getDataCadastramentoProposta() {
		return dataCadastramentoProposta;
	}

	public void setDataCadastramentoProposta(Date dataCadastramentoProposta) {
		this.dataCadastramentoProposta = dataCadastramentoProposta;
	}

	public SituacaoProposta getSituacaoProposta() {
		return situacaoProposta;
	}

	public void setSituacaoProposta(SituacaoProposta situacaoProposta) {
		this.situacaoProposta = situacaoProposta;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getCapacidadeTecnica() {
		return capacidadeTecnica;
	}

	public void setCapacidadeTecnica(String capacidadeTecnica) {
		this.capacidadeTecnica = capacidadeTecnica;
	}

	public String getAgenciaBancaria() {
		return agenciaBancaria;
	}

	public void setAgenciaBancaria(String agenciaBancaria) {
		this.agenciaBancaria = agenciaBancaria;
	}

	public String getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(String contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public boolean isIndicadorParecerTecnico() {
		return indicadorParecerTecnico;
	}

	public void setIndicadorParecerTecnico(boolean indicadorParecerTecnico) {
		this.indicadorParecerTecnico = indicadorParecerTecnico;
	}

	public boolean isIndicadorParecerJuridico() {
		return indicadorParecerJuridico;
	}

	public void setIndicadorParecerJuridico(boolean indicadorParecerJuridico) {
		this.indicadorParecerJuridico = indicadorParecerJuridico;
	}

	public boolean isIndicadorParecerGestor() {
		return indicadorParecerGestor;
	}

	public void setIndicadorParecerGestor(boolean indicadorParecerGestor) {
		this.indicadorParecerGestor = indicadorParecerGestor;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public Proponente getProponente() {
		return proponente;
	}

	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}

	public Orgao getOrgaoConcedente() {
		return orgaoConcedente;
	}

	public void setOrgaoConcedente(Orgao orgaoConcedente) {
		this.orgaoConcedente = orgaoConcedente;
	}

	public ModalidadeProposta getModalidade() {
		return modalidade;
	}

	public void setModalidade(ModalidadeProposta modalidade) {
		this.modalidade = modalidade;
	}

	public PessoaResponsavel getPessoaResponsavelPeloConcedente() {
		return pessoaResponsavelPeloConcedente;
	}

	public void setPessoaResponsavelPeloConcedente(
			PessoaResponsavel pessoaResponsavelPeloConcedente) {
		this.pessoaResponsavelPeloConcedente = pessoaResponsavelPeloConcedente;
	}

	public PessoaResponsavel getPessoaResponsavelPeloCadastramento() {
		return pessoaResponsavelPeloCadastramento;
	}

	public void setPessoaResponsavelPeloCadastramento(
			PessoaResponsavel pessoaResponsavelPeloCadastramento) {
		this.pessoaResponsavelPeloCadastramento = pessoaResponsavelPeloCadastramento;
	}

	public PessoaResponsavel getPessoaResponsavelPeloEnvio() {
		return pessoaResponsavelPeloEnvio;
	}

	public void setPessoaResponsavelPeloEnvio(
			PessoaResponsavel pessoaResponsavelPeloEnvio) {
		this.pessoaResponsavelPeloEnvio = pessoaResponsavelPeloEnvio;
	}
	
}
