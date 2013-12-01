package com.siconvfacil.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.siconvfacil.domain.Municipio;
import com.siconvfacil.persistence.MunicipioDAO;

@FacesConverter(forClass=Municipio.class, value="MunicipioConverter")
public class MunicipioConverter implements Converter {
	
	
	private MunicipioDAO mDAO = new MunicipioDAO();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		String[] nomeMunicipio = value.split(" - ");
		return mDAO.getMunicipioByNomeAndUf(nomeMunicipio[0], nomeMunicipio[1]);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		Municipio m = (Municipio)value;
		return m.getNome()+" - "+m.getUf();
	}
}
