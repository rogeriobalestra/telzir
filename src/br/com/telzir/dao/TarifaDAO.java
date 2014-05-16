package br.com.telzir.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.telzir.model.Tarifa;


public class TarifaDAO {

	//Conutor
	public TarifaDAO(){
		
		
	}
	
	
	
	//Retorna Lista de Tarifas
	public List<Tarifa> listaTarifas() throws Exception {
		
		List<Tarifa> listaTarifa = new ArrayList<Tarifa>();
		
		try{
		
			// Esses Valores viriam do banco
			Tarifa tarifa1 = new Tarifa();
			Tarifa tarifa2 = new Tarifa();
			Tarifa tarifa3 = new Tarifa();
			Tarifa tarifa4 = new Tarifa();
			Tarifa tarifa5 = new Tarifa();
			Tarifa tarifa6 = new Tarifa();
			
			tarifa1.setOrigem("011");
			tarifa1.setDestino("016");
			tarifa1.setValorMinuto("1.90");
		
			tarifa2.setOrigem("016");
			tarifa2.setDestino("011");
			tarifa2.setValorMinuto("2.90");
	
			tarifa3.setOrigem("011");
			tarifa3.setDestino("017");
			tarifa3.setValorMinuto("1.70");
	
			tarifa4.setOrigem("017");
			tarifa4.setDestino("011");
			tarifa4.setValorMinuto("2.70");
	
			tarifa5.setOrigem("011");
			tarifa5.setDestino("018");
			tarifa5.setValorMinuto("0.90");
			
			tarifa6.setOrigem("018");
			tarifa6.setDestino("011");
			tarifa6.setValorMinuto("1.90");
			
			
			listaTarifa.add(tarifa1);
			listaTarifa.add(tarifa2);
			listaTarifa.add(tarifa3);
			listaTarifa.add(tarifa4);
			listaTarifa.add(tarifa5);
			listaTarifa.add(tarifa6);
		
		} catch(Exception e){
			e.printStackTrace();
		} 
		
		return listaTarifa;
		
	}
	
	
	
	
	
	
}
