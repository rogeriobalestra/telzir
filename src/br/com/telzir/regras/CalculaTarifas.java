package br.com.telzir.regras;

import java.util.List;

import br.com.telzir.dao.TarifaDAO;
import br.com.telzir.model.Tarifa;

public class CalculaTarifas {
	
	//Construtor
	public CalculaTarifas(){
		
	}

	
	//Busca valor Tarifa por minuto
	public double buscaTarifa(String origem, String destino){
		double valorTarifaMinuto = 0;
		
		TarifaDAO dao = new TarifaDAO();
		
		try {
			//busca lista de tarifas no banco
			List<Tarifa> listaTarifa = dao.listaTarifas();
			
			//varre Array pra pegar o valor da tarifa por minuto
			for(Tarifa t: listaTarifa){
				if(t.getOrigem().equals(origem) && t.getDestino().equals(destino)){
					valorTarifaMinuto = Double.parseDouble(t.getValorMinuto());
				}
			}
		} catch (Exception e) {
			//tratamento exption
			e.printStackTrace();
		}
		
		return valorTarifaMinuto; 

	}
	
	
	/*
	//Teste
	public static void main(String[] args) {
		Planos p = new Planos();
		double valor = p.buscaTarifa("017", "011");
		System.out.println(valor);
		
	}
	*/
	
	
	
}
