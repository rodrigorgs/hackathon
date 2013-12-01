package com.siconvfacil.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.siconvfacil.domain.Uf;
import com.siconvfacil.persistence.UfDAO;

@FacesConverter(forClass=Uf.class, value="UfConverter")
public class UfConverter implements Converter {
	
	
	private UfDAO ufDAO = new UfDAO();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		
		return ufDAO.load(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		Uf uf = (Uf)value;
		return uf.getSigla();
	}
}
