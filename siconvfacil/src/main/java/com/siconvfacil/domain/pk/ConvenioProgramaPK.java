package com.siconvfacil.domain.pk;

import java.io.Serializable;
import com.siconvfacil.domain.Programa;
import com.siconvfacil.domain.Convenio;

public class ConvenioProgramaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private Convenio convenio;
	private Programa programa;
	
	public Convenio getConvenio() {
		return convenio;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
}
