package br.com.generation.exercicios;

public class ExercicioAviao {

	// Atributos

	private String companhia, origem;
	private int velocidade, capacidade;


	// Funções

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	void atual(int aceleracao) {

		velocidade = velocidade + aceleracao;

	}

	void pousar(int freiar) {

		velocidade = velocidade - freiar;
	}

	// *************************************************//

}
