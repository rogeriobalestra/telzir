package br.com.telzir.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import br.com.telzir.model.Tarifa;
import br.com.telzir.regras.CalculaTarifas;



@ManagedBean (name = "planoController")
@ViewScoped
public class PlanoController {

	private Tarifa tarifa; //Objeto Tarifa
	
	//Constutor
	public PlanoController(){
		tarifa = new Tarifa();
	}



	
	
	//Calcula ligação
	public void calculaLigacao(ActionEvent etv){
		System.out.println("Plano Escolhido: " + tarifa.getPlanoEscolhido());
		System.out.println("Origem: " + tarifa.getOrigem());
		System.out.println("Destino: " + tarifa.getDestino());
		System.out.println("TempoMinutos: " + tarifa.getMinutoUtilizadoLigacao());
		
		CalculaTarifas calculaTarifas = new CalculaTarifas();
		double tarifaFixa = calculaTarifas.buscaTarifa(tarifa.getOrigem(), tarifa.getDestino());
		
		System.out.println("Tarifa fixa: " + tarifaFixa);
		
	}





	
	//GETTS AND SETTERS DO CONTROLLER PARA ACESSO DA VIEW

	public Tarifa getTarifa() {
		return tarifa;

	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}


	
	
	

	

	
	
	
	
}
