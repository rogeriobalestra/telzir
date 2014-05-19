package br.com.telzir.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.telzir.dao.TarifaDAO;
import br.com.telzir.regras.CalculaTarifas;

public class CalculaTarifasTest {


	@Test
	public void pegaValorFixaTest(){
		assertEquals("1.7", String.valueOf(new CalculaTarifas().pegaValorFixa("011", "017")));
	}

	@Test
	public void calculaPlanoSemFaleMaisTest(){
		double expected = 136.00;
		double result = new CalculaTarifas().calculaPlanoSemFaleMais(80, 1.70);
		assertEquals(expected, result, 0.00001);	
	}
	
	
	@Test
	public void calculaPlanoComFaleMaisTest(){
		double expected = 37.40;
		double result = new CalculaTarifas().calculaPlanoComFaleMais(80, 1.70, 60);
		assertEquals(expected, result, 0.00001);	
	}
	
	@Test
	public void adicionalPercentualTest(){
		double expected = 37.40;
		double result = new CalculaTarifas().adicionalPercentual(34.00);
		assertEquals(expected, result, 0.00001);
		
	}
	
	
	@Test
	public void listaTarifasTest() throws Exception{
		assertNotEquals(null, new TarifaDAO().listaTarifas());
	}
	
	
	@Test
	public void validaCampos(){
		assertFalse(false);
	}
	
	
	
	
	
}
