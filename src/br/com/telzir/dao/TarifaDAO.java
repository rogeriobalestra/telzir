package br.com.telzir.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.telzir.model.Tarifa;


public class TarifaDAO {

	//Construtor
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
			
			tarifa1.setOrigemStr("011");
			tarifa1.setDestinoStr("016");
			tarifa1.setMinutoStr("1.90");
		
			tarifa2.setOrigemStr("016");
			tarifa2.setDestinoStr("011");
			tarifa2.setMinutoStr("2.90");
	
			tarifa3.setOrigemStr("011");
			tarifa3.setDestinoStr("017");
			tarifa3.setMinutoStr("1.70");
	
			tarifa4.setOrigemStr("017");
			tarifa4.setDestinoStr("011");
			tarifa4.setMinutoStr("2.70");
	
			tarifa5.setOrigemStr("011");
			tarifa5.setDestinoStr("018");
			tarifa5.setMinutoStr("0.90");
			
			tarifa6.setOrigemStr("018");
			tarifa6.setDestinoStr("011");
			tarifa6.setMinutoStr("1.90");
			
			
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
