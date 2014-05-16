package br.com.telzir.model;

public class Tarifa {

	private String origem;
	private String destino;
	private String valorMinuto;
	private String planoEscolhido;
	private String minutoUtilizadoLigacao;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getValorMinuto() {
		return valorMinuto;
	}

	public void setValorMinuto(String valorMinuto) {
		this.valorMinuto = valorMinuto;
	}

	public String getPlanoEscolhido() {
		return planoEscolhido;
	}

	public void setPlanoEscolhido(String planoEscolhido) {
		this.planoEscolhido = planoEscolhido;
	}

	public String getMinutoUtilizadoLigacao() {
		return minutoUtilizadoLigacao;
	}

	public void setMinutoUtilizadoLigacao(String minutoUtilizadoLigacao) {
		this.minutoUtilizadoLigacao = minutoUtilizadoLigacao;
	}


	
}
