package com.siconvfacil.business;

import java.util.List;

import com.siconvfacil.domain.Municipio;
import com.siconvfacil.persistence.MunicipioDAO;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@BusinessController
public class MunicipioBC extends DelegateCrud<Municipio, Integer, MunicipioDAO> {

	private static final long serialVersionUID = 1L;
	
	public List<String> consultaMunicipioByNomeParcial(String query){
		return getDelegate().consultaMunicipioByNomeParcial(query);
	}

}
