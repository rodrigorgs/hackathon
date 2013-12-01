package com.siconvfacil.business;

import com.siconvfacil.domain.Uf;
import com.siconvfacil.persistence.UfDAO;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@BusinessController
public class UfBC extends DelegateCrud<Uf, String, UfDAO> {

	private static final long serialVersionUID = 1L;

}
