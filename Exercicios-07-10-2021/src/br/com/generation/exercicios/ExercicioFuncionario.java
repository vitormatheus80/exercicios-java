package br.com.generation.exercicios;

public class ExercicioFuncionario {

	//Atributos
	
	private String nome;
	private double salario = 0.0;
	private int identificação;
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
	public int getIdentificação() {
		return identificação;
	}
	public void setIdentificação(int identificação) {
		this.identificação = identificação;
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
	
	//Funçôes
	
	void desconto (double d) {
		salarioD = salario - d;
		
	}
	
	
	
	
}
