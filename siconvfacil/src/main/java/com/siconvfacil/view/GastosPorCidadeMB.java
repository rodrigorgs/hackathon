package com.siconvfacil.view;

import java.text.NumberFormat;
import java.util.List;

import javax.inject.Inject;

import com.siconvfacil.business.ConvenioBC;
import com.siconvfacil.business.MunicipioBC;
import com.siconvfacil.business.UfBC;
import com.siconvfacil.domain.Convenio;
import com.siconvfacil.domain.Municipio;
import com.siconvfacil.domain.Uf;

import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractPageBean;

@ViewController
public class GastosPorCidadeMB extends AbstractPageBean {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private MunicipioBC municipioBC;
	@Inject
	private ConvenioBC convenioBC;
	
	private Municipio municipioSelecionado;
	
	private long totalConvenios;
	private double totalValorGlobal;
	private double totalValorRepasse;
	private double totalValorContraPartida;
	private double totalValorContraPartidaFinanceira;
	private double totalValorContraPartidaBensServico;
	private NumberFormat decimal = NumberFormat.getCurrencyInstance();
	
	public List<String> completaCidade(String query){
		List<String> lista = municipioBC.consultaMunicipioByNomeParcial(query);
		if(lista.isEmpty()){
			System.out.println("Vazia");
		}else{
			System.out.println("Não Vazia");
		}
			
		return lista;
	}
	
	public void atualizaCidade(){		
		List<Convenio> lista = convenioBC.getListConvenioByMunicipio(municipioSelecionado);
		totalConvenios = lista.size();
		totalValorGlobal =  0;
		totalValorRepasse = 0;
		totalValorContraPartida = 0;
		totalValorContraPartidaFinanceira = 0;
		totalValorContraPartidaBensServico = 0;
		
		for(Convenio c: lista){
			totalValorGlobal += c.getValorGlobal();
			totalValorRepasse += c.getValorRepasse();
			totalValorContraPartida += c.getValorContraPartida();
			totalValorContraPartidaFinanceira += c.getValorContraPartidaFinanceira();
			totalValorContraPartidaBensServico += c.getValorContraPartidaBensServicos();
		}
	}

	
	
	public Municipio getMunicipioSelecionado() {
		return municipioSelecionado;
	}



	public void setMunicipioSelecionado(Municipio municipioSelecionado) {
		this.municipioSelecionado = municipioSelecionado;
	}



	public long getTotalConvenios() {
		return totalConvenios;
	}

	public void setTotalConvenios(long totalConvenios) {
		this.totalConvenios = totalConvenios;
	}

	public String getTotalValorGlobal() {
		return decimal.format(totalValorGlobal);
	}

	public String getTotalValorRepasse() {
		return decimal.format(totalValorRepasse);
	}

	public String getTotalValorContraPartida() {
		return decimal.format(totalValorContraPartida);
	}

	public String getTotalValorContraPartidaFinanceira() {
		return decimal.format(totalValorContraPartidaFinanceira);
	}

	public String getTotalValorContraPartidaBensServico() {
		return decimal.format(totalValorContraPartidaBensServico);
	}
	
}
