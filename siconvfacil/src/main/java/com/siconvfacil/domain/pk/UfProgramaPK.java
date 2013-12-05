package com.siconvfacil.domain.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.siconvfacil.domain.Programa;
import com.siconvfacil.domain.Convenio;
import com.siconvfacil.domain.Uf;

public class UfProgramaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private Uf uf;
	private Programa programa;
	
	public Uf getUf() {
		return uf;
	}
	public void setUf(Uf uf) {
		this.uf = uf;
	}
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
}
