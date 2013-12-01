package com.siconvfacil.view;

import java.text.NumberFormat;
import java.util.List;

import javax.inject.Inject;

import com.siconvfacil.business.ConvenioBC;
import com.siconvfacil.business.UfBC;
import com.siconvfacil.domain.Convenio;
import com.siconvfacil.domain.Uf;

import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractPageBean;

@ViewController
public class GastosPorEstadoMB extends AbstractPageBean {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UfBC ufBC;
	@Inject
	private ConvenioBC convenioBC;
	
	private Uf ufSelecionado;
	
	private long totalConvenios;
	private double totalValorGlobal;
	private double totalValorRepasse;
	private double totalValorContraPartida;
	private double totalValorContraPartidaFinanceira;
	private double totalValorContraPartidaBensServico;
	private NumberFormat decimal = NumberFormat.getCurrencyInstance();
	
	public void atualizaEstado(){		
		List<Convenio> lista = convenioBC.getListConvenioByUf(ufSelecionado);
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
	
	public List<Uf> getEstados(){
		return ufBC.findAll();
	}

	public Uf getUfSelecionado() {
		return ufSelecionado;
	}

	public void setUfSelecionado(Uf ufSelecionado) {
		this.ufSelecionado = ufSelecionado;
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
