package com.siconvfacil.business;

import java.util.List;

import com.siconvfacil.domain.Convenio;
import com.siconvfacil.domain.Municipio;
import com.siconvfacil.domain.Uf;
import com.siconvfacil.persistence.ConvenioDAO;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@BusinessController
public class ConvenioBC extends DelegateCrud<Convenio, Long, ConvenioDAO> {

	private static final long serialVersionUID = 1L;
	
	public List<Convenio> getListConvenioByUf(Uf uf){
		return getDelegate().getListConvenioByUf(uf);
	}

	public List<Convenio> getListConvenioByMunicipio(Municipio municipio){
		return getDelegate().getListConvenioByMunicipio(municipio);
	}
	
}
