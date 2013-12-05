package com.siconvfacil.domain.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.siconvfacil.domain.NaturezaJuridica;
import com.siconvfacil.domain.Programa;
import com.siconvfacil.domain.Convenio;

public class ProgramaAtendePK implements Serializable {
	private static final long serialVersionUID = 1L;

	private Programa programa;
	private NaturezaJuridica naturezaJuridica;
	
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	public NaturezaJuridica getNaturezaJuridica() {
		return naturezaJuridica;
	}
	public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}
}
