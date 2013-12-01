package com.siconvfacil.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Programa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@Column(name="cod_programa_siconv")
	private String codProgramaSiconv;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Column(name="data_disponibilizacao")
	private Date dataDisponibilizacao;
	
	@Column(name="data_inicio_recebimento_propostas")
	private Date dataInicioRecibimentoPropostas;
	
	@Column(name="data_fim_recebimento_propostas")
	private Date dataFimRecebimentoPropostas;
	
	@Column(name="acao_orcamentaria")
	private String acaoOrcamentaria;
	
	@Column(name="obriga_plano_trabalho")
	private boolean obrigaPlanoTrabalho;
	
	@Column(name="aceita_emenda_parlamentar")
	private boolean aceitaEmendaParlamentar;
	
	@Column(name="data_publicao_dou")
	private Date dataPublicacaoDou;
	
	@Column(name="possui_chamamento_publico")
	private boolean possuiChamamentoPublico;
	
	@Column(name="aceita_despesa_administrativa")
	private boolean aceitaDespesaAdministrativa;
	
	@Column(name="data_inicio_emenda_parlamentar")
	private Date dataInicioEmendaParlamentar;
	
	@Column(name="data_fim_emenda_parlamentar")
	private Date dataFimEmendaParlamentar;
	
	@Column(name="data_inicio_beneficiario_especifico")
	private Date dataInicioBeneficiarioEspecifico;
	
	@Column(name="data_fim_beneficiario_especifico")
	private Date dataFimBeneficiarioEspecifico;
	
	@Column
	private String situacao;
	
	@ManyToOne
	@JoinColumn(name="id_orgao_superior")
	private Orgao orgaoSuperior;
	
	@ManyToOne
	@JoinColumn(name="id_orgao_vinculado")
	private Orgao orgaoVinculado;
	
	@ManyToOne
	@JoinColumn(name="id_orgao_mandatario")
	private Orgao orgaoMandatario;
	
	@ManyToOne
	@JoinColumn(name="id_orgao_executor")
	private Orgao orgaoExecutor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodProgramaSiconv() {
		return codProgramaSiconv;
	}

	public void setCodProgramaSiconv(String codProgramaSiconv) {
		this.codProgramaSiconv = codProgramaSiconv;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDisponibilizacao() {
		return dataDisponibilizacao;
	}

	public void setDataDisponibilizacao(Date dataDisponibilizacao) {
		this.dataDisponibilizacao = dataDisponibilizacao;
	}

	public Date getDataInicioRecibimentoPropostas() {
		return dataInicioRecibimentoPropostas;
	}

	public void setDataInicioRecibimentoPropostas(
			Date dataInicioRecibimentoPropostas) {
		this.dataInicioRecibimentoPropostas = dataInicioRecibimentoPropostas;
	}

	public Date getDataFimRecebimentoPropostas() {
		return dataFimRecebimentoPropostas;
	}

	public void setDataFimRecebimentoPropostas(Date dataFimRecebimentoPropostas) {
		this.dataFimRecebimentoPropostas = dataFimRecebimentoPropostas;
	}

	public String getAcaoOrcamentaria() {
		return acaoOrcamentaria;
	}

	public void setAcaoOrcamentaria(String acaoOrcamentaria) {
		this.acaoOrcamentaria = acaoOrcamentaria;
	}

	public boolean isObrigaPlanoTrabalho() {
		return obrigaPlanoTrabalho;
	}

	public void setObrigaPlanoTrabalho(boolean obrigaPlanoTrabalho) {
		this.obrigaPlanoTrabalho = obrigaPlanoTrabalho;
	}

	public boolean isAceitaEmendaParlamentar() {
		return aceitaEmendaParlamentar;
	}

	public void setAceitaEmendaParlamentar(boolean aceitaEmendaParlamentar) {
		this.aceitaEmendaParlamentar = aceitaEmendaParlamentar;
	}

	public Date getDataPublicacaoDou() {
		return dataPublicacaoDou;
	}

	public void setDataPublicacaoDou(Date dataPublicacaoDou) {
		this.dataPublicacaoDou = dataPublicacaoDou;
	}

	public boolean isPossuiChamamentoPublico() {
		return possuiChamamentoPublico;
	}

	public void setPossuiChamamentoPublico(boolean possuiChamamentoPublico) {
		this.possuiChamamentoPublico = possuiChamamentoPublico;
	}

	public boolean isAceitaDespesaAdministrativa() {
		return aceitaDespesaAdministrativa;
	}

	public void setAceitaDespesaAdministrativa(boolean aceitaDespesaAdministrativa) {
		this.aceitaDespesaAdministrativa = aceitaDespesaAdministrativa;
	}

	public Date getDataInicioEmendaParlamentar() {
		return dataInicioEmendaParlamentar;
	}

	public void setDataInicioEmendaParlamentar(Date dataInicioEmendaParlamentar) {
		this.dataInicioEmendaParlamentar = dataInicioEmendaParlamentar;
	}

	public Date getDataFimEmendaParlamentar() {
		return dataFimEmendaParlamentar;
	}

	public void setDataFimEmendaParlamentar(Date dataFimEmendaParlamentar) {
		this.dataFimEmendaParlamentar = dataFimEmendaParlamentar;
	}

	public Date getDataInicioBeneficiarioEspecifico() {
		return dataInicioBeneficiarioEspecifico;
	}

	public void setDataInicioBeneficiarioEspecifico(
			Date dataInicioBeneficiarioEspecifico) {
		this.dataInicioBeneficiarioEspecifico = dataInicioBeneficiarioEspecifico;
	}

	public Date getDataFimBeneficiarioEspecifico() {
		return dataFimBeneficiarioEspecifico;
	}

	public void setDataFimBeneficiarioEspecifico(Date dataFimBeneficiarioEspecifico) {
		this.dataFimBeneficiarioEspecifico = dataFimBeneficiarioEspecifico;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Orgao getOrgaoSuperior() {
		return orgaoSuperior;
	}

	public void setOrgaoSuperior(Orgao orgaoSuperior) {
		this.orgaoSuperior = orgaoSuperior;
	}

	public Orgao getOrgaoVinculado() {
		return orgaoVinculado;
	}

	public void setOrgaoVinculado(Orgao orgaoVinculado) {
		this.orgaoVinculado = orgaoVinculado;
	}

	public Orgao getOrgaoMandatario() {
		return orgaoMandatario;
	}

	public void setOrgaoMandatario(Orgao orgaoMandatario) {
		this.orgaoMandatario = orgaoMandatario;
	}

	public Orgao getOrgaoExecutor() {
		return orgaoExecutor;
	}

	public void setOrgaoExecutor(Orgao orgaoExecutor) {
		this.orgaoExecutor = orgaoExecutor;
	}
	
}
