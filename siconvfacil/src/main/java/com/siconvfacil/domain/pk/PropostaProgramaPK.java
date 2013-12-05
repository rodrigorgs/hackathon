package com.siconvfacil.domain.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.siconvfacil.domain.Programa;
import com.siconvfacil.domain.Convenio;
import com.siconvfacil.domain.Proposta;

public class PropostaProgramaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private Proposta proposta;
	private Programa programa;
	
	public Proposta getProposta() {
		return proposta;
	}
	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
}
