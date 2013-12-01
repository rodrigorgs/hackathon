package com.siconvfacil.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Convenio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@Column(name="data_inicio_vigencia")
	private Date dataInicioVigencia;
	
	@Column(name="data_fim_vigencia")
	private Date dataFimVigencia;
	
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
	
	@Column(name="data_assinatura")
	private Date dataAssinatura;
	
	@Column(name="data_publicacao")
	private Date dataPublicao;
	
	@ManyToOne
	@JoinColumn(name="id_situacao")
	private SituacaoConvenio situacao;
	
	@ManyToOne
	@JoinColumn(name="id_subsituacao")
	private SubsitucaoConvenio subsituacao;
	
	@ManyToOne
	@JoinColumn(name="id_situacao_publicacao")
	private SituacaoPublicacaoConvenio situacaoPublicacao;
	
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
	
	@Column(name="indicador_publicado")
	private boolean indicadorPublicado;
	
	@Column(name="numero_processo")
	private String numeroProcesso;
	
	@Column(name="numero_interno")
	private String numeroInterno;
	
	@Column(name="permite_ajustes_cronograma_fisico")
	private boolean permiteAjustesCronogramaFisico;
	
	@Column(name="indicador_termo_aditivo")
	private boolean indicadorTermoAditivo;
	
	@ManyToOne
	@JoinColumn(name="id_proposta")
	private Proposta proposta;
	
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
	@JoinColumn(name="id_pessoa_responsavel_como_concedente")
	private PessoaResponsavel pessoaResponsavelComoConcedente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public Date getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(Date dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
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

	public Date getDataAssinatura() {
		return dataAssinatura;
	}

	public void setDataAssinatura(Date dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}

	public Date getDataPublicao() {
		return dataPublicao;
	}

	public void setDataPublicao(Date dataPublicao) {
		this.dataPublicao = dataPublicao;
	}

	public SituacaoConvenio getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoConvenio situacao) {
		this.situacao = situacao;
	}

	public SubsitucaoConvenio getSubsituacao() {
		return subsituacao;
	}

	public void setSubsituacao(SubsitucaoConvenio subsituacao) {
		this.subsituacao = subsituacao;
	}

	public SituacaoPublicacaoConvenio getSituacaoPublicacao() {
		return situacaoPublicacao;
	}

	public void setSituacaoPublicacao(SituacaoPublicacaoConvenio situacaoPublicacao) {
		this.situacaoPublicacao = situacaoPublicacao;
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

	public boolean isIndicadorPublicado() {
		return indicadorPublicado;
	}

	public void setIndicadorPublicado(boolean indicadorPublicado) {
		this.indicadorPublicado = indicadorPublicado;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public String getNumeroInterno() {
		return numeroInterno;
	}

	public void setNumeroInterno(String numeroInterno) {
		this.numeroInterno = numeroInterno;
	}

	public boolean isPermiteAjustesCronogramaFisico() {
		return permiteAjustesCronogramaFisico;
	}

	public void setPermiteAjustesCronogramaFisico(
			boolean permiteAjustesCronogramaFisico) {
		this.permiteAjustesCronogramaFisico = permiteAjustesCronogramaFisico;
	}

	public boolean isIndicadorTermoAditivo() {
		return indicadorTermoAditivo;
	}

	public void setIndicadorTermoAditivo(boolean indicadorTermoAditivo) {
		this.indicadorTermoAditivo = indicadorTermoAditivo;
	}

	public Proposta getProposta() {
		return proposta;
	}

	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
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

	public PessoaResponsavel getPessoaResponsavelComoConcedente() {
		return pessoaResponsavelComoConcedente;
	}

	public void setPessoaResponsavelComoConcedente(
			PessoaResponsavel pessoaResponsavelComoConcedente) {
		this.pessoaResponsavelComoConcedente = pessoaResponsavelComoConcedente;
	}
	
}
