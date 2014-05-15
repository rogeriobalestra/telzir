package br.com.telzir.controller;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.telzir.dao.TarifaDAO;
import br.com.telzir.model.Tarifa;    


@ManagedBean (name="tarifaController")
@ViewScoped    
public class TarifaController {

	private List<Tarifa> listaTarifa;
	
	//Construtor
	public TarifaController(){
		preencheListaTarifa();
		
	}

	//Preenche lista Tarifa
	private void preencheListaTarifa(){
		TarifaDAO dao = new TarifaDAO();
		
		try {
			listaTarifa = null;
			listaTarifa = dao.listaTarifas();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	
	
	
	// GETTS AND SETTERS - CONTROLLER
	
	public List<Tarifa> getListaTarifa() {
		return listaTarifa;
	}


	public void setListaTarifa(List<Tarifa> listaTarifa) {
		this.listaTarifa = listaTarifa;
	}
	
	
	
	
	
}
