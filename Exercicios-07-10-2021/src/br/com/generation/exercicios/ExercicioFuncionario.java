package br.com.generation.exercicios;

public class ExercicioFuncionario {

	//Atributos
	
	private String nome;
	private double salario = 0.0;
	private int identifica��o;
	private double salarioD;
	private double d = 0;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdentifica��o() {
		return identifica��o;
	}
	public void setIdentifica��o(int identifica��o) {
		this.identifica��o = identifica��o;
	}
	
	public double getSalarioD() {
		return salarioD;
	}
	public void setSalarioD(int salarioD) {
		this.salarioD = salarioD;
	}
	public double getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	//Fun��es
	
	void desconto (double d) {
		salarioD = salario - d;
		
	}
	
	
	
	
}
