package br.com.generation.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		ExercicioFuncionario fun01 = new ExercicioFuncionario();
		
		fun01.setSalario(3000.00);
		fun01.setIdentificação(123456);
		fun01.setNome("Vitor");
		
		System.out.println("Nome do Funcionario: " + fun01.getNome());
		System.out.println("identificação: " + fun01.getIdentificação());
		System.out.println("Salario: " + fun01.getSalario());
		
		fun01.desconto(100);
		System.out.println("O salario com desconto é de: " + fun01.getSalarioD());
		
		
	}

}
