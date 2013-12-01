package com.siconvfacil.persistence;

import com.siconvfacil.domain.Uf;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class UfDAO extends JPACrud<Uf, String> {

	private static final long serialVersionUID = 1L;

}
