package br.com.telzir.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.telzir.model.Tarifa;
import br.com.telzir.regras.CalculaTarifas;



@ManagedBean (name = "planoController")
@ViewScoped
public class PlanoController {

	private Tarifa tarifa; //Objeto Tarifa
	private double tarifaComFaleMais;
	private double tarifaSemFaleMais;
	private double tarifaAplicada;
	
	
	//Constutor
	public PlanoController(){
		tarifa = new Tarifa();
	}



	/** MENSAGEM */
	public void mensagem(String mensagem){
		 FacesMessage msg = new FacesMessage("",mensagem);
		 FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}
	
	
	//Calcula ligação - Evento do Botao Calcula
	public void calculaLigacao(ActionEvent etv){
	
		if (validaCampos() == false) {
			mensagem("Preencha os os campos corretamente !");
			return;// para o codigo
		}
		
		CalculaTarifas calculaTarifas = new CalculaTarifas();
		
		int minutosUltilizados = Integer.parseInt(tarifa.getMinutoUtilizadoLigacao());
		tarifaAplicada = calculaTarifas.pegaValorFixa(tarifa.getOrigem(), tarifa.getDestino());
		int planoFaleMais = Integer.parseInt(tarifa.getPlanoEscolhido());
		
		tarifaComFaleMais = calculaTarifas.calculaPlanoComFaleMais(minutosUltilizados, tarifaAplicada, planoFaleMais);
		tarifaSemFaleMais = calculaTarifas.calculaPlanoSemFaleMais(minutosUltilizados, tarifaAplicada);
		
	}


	//valida campos
	public boolean validaCampos(){
		boolean valida = false;
		
		if(tarifa.getPlanoEscolhido().isEmpty() || tarifa.getOrigem().isEmpty() 
			|| tarifa.getDestino().isEmpty() || tarifa.getMinutoUtilizadoLigacao().isEmpty()){
			
			valida = false;
		} else {
			valida = true;
		}
		return valida;
	}


	
	//GETTS AND SETTERS DO CONTROLLER PARA ACESSO DA VIEW

	public Tarifa getTarifa() {
		return tarifa;

	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public double getTarifaComFaleMais() {
		return tarifaComFaleMais;
	}

	public void setTarifaComFaleMais(double tarifaComFaleMais) {
		this.tarifaComFaleMais = tarifaComFaleMais;
	}

	public double getTarifaSemFaleMais() {
		return tarifaSemFaleMais;
	}

	public void setTarifaSemFaleMais(double tarifaSemFaleMais) {
		this.tarifaSemFaleMais = tarifaSemFaleMais;
	}

	public double getTarifaAplicada() {
		return tarifaAplicada;
	}

	public void setTarifaAplicada(double tarifaAplicada) {
		this.tarifaAplicada = tarifaAplicada;
	}
	

	

	
	
	
	
}
