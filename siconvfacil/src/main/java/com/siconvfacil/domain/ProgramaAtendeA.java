package com.siconvfacil.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="programa_atende_a")
public class ProgramaAtendeA implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name="id_programa")
	private Programa programa;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_natureza_juridica")
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
