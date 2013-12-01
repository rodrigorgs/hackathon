package com.siconvfacil.persistence;

import java.util.ArrayList;
import java.util.List;

import org.jboss.arquillian.container.test.impl.client.deployment.command.GetDeploymentCommand;

import com.siconvfacil.domain.Convenio;
import com.siconvfacil.domain.Municipio;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class MunicipioDAO extends JPACrud<Municipio, Integer> {

	private static final long serialVersionUID = 1L;
	
	public List<String> consultaMunicipioByNomeParcial(String query){
		List<Municipio> lista = getEntityManager().createQuery("SELECT m FROM Municipio m WHERE m.nome LIKE :query ").setParameter("query", "%"+query.toUpperCase()+"%").getResultList();
		List<String> listaRetorno = new ArrayList<String>();
		for(Municipio m: lista){
			listaRetorno.add(m.getNome()+" - "+m.getUf());
		}
		return listaRetorno;
	}
	
	public Municipio getMunicipioByNomeAndUf(String nome, String uf){
		return (Municipio)getEntityManager().createQuery("SELECT m FROM Municipio m WHERE m.nome = :nome AND m.uf = :uf ").setParameter("nome", nome).setParameter("uf", uf).getResultList().get(0);
	}

}
