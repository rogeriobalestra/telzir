package br.com.telzir.regras;

import java.util.List;
import br.com.telzir.dao.TarifaDAO;
import br.com.telzir.model.Tarifa;

public class CalculaTarifas {
	
	//Construtor
	public CalculaTarifas(){
		
	}

	
	//Mostra valor da tarifa fixa de acordo com o DDD origem e destino
	public double pegaValorFixa(String origem, String destino){
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
	
	
	
	//Calcula Plano COM FaleMais
	public double calculaPlanoComFaleMais(int minutosLigacao, double valorTarifaFixa, int planoFaleMais){

		double tarifaCobrada = 0;
		
		if(minutosLigacao >= planoFaleMais){
			
			int minutosComDesconto = minutosLigacao - planoFaleMais;
			double valorCalcula = minutosComDesconto * valorTarifaFixa;
			tarifaCobrada = adicionalPercentual(valorCalcula);//adiona 10% no valora
		} else {
			tarifaCobrada = 0.0;
		}
		return tarifaCobrada;
	}

	
	//Calcula Plano SEM FaleMais
	public double calculaPlanoSemFaleMais(int minutosLigacao, double valorTarifaFixa){
		double valor = minutosLigacao * valorTarifaFixa;
		return valor;
	}
	
	
	//Adicional percentual (Adiciona valor de 10%)
	public double adicionalPercentual(double valor){
		double percentual = (valor * 10) / 100;
		return valor + percentual;
	}

	
	
	
}
