package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.siconvfacil.domain.pk.UfProgramaPK;

@Entity
@IdClass(UfProgramaPK.class)
@Table(name="uf_programa")
public class UfPrograma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@JoinColumn(name="sigla_uf")
	private Uf uf;
	
	@Id
	@JoinColumn
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
