package com.siconvfacil.persistence;

import java.util.List;

import com.siconvfacil.domain.Convenio;
import com.siconvfacil.domain.Municipio;
import com.siconvfacil.domain.Uf;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class ConvenioDAO extends JPACrud<Convenio, Long> {

	private static final long serialVersionUID = 1L;
	
	public List<Convenio> getListConvenioByUf(Uf uf){
		List<Convenio> lista = getEntityManager().createQuery("SELECT c FROM Convenio c, Proponente p , Municipio m WHERE c.proponente = p AND p.municipio = m AND m.uf = :sigla ").setParameter("sigla", uf.getSigla()).getResultList();
		return lista;
	}
	
	public List<Convenio> getListConvenioByMunicipio(Municipio municipio){
		List<Convenio> lista = getEntityManager().createQuery("SELECT c FROM Convenio c, Proponente p WHERE c.proponente = p AND p.municipio = :municipio ").setParameter("municipio", municipio).getResultList();
		return lista;
	}

}
