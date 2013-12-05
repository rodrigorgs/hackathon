package com.siconvfacil.domain.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.siconvfacil.domain.Programa;
import com.siconvfacil.domain.Convenio;

public class EmendaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private Programa programa;
	private Long numero;
	private Programa programaQualificacao;
	
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Programa getProgramaQualificacao() {
		return programaQualificacao;
	}
	public void setProgramaQualificacao(Programa programaQualificacao) {
		this.programaQualificacao = programaQualificacao;
	}
}
