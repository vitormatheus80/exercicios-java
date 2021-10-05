package br.com.generation.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
			
		int div;
		for(int cont = 1; cont<=10; cont++) {

			div = cont % 2;
			
			if(div == 0) {
			System.out.println("Numeros PAR: "+ cont);
			}
			if(div != 0) {
			System.out.println("Numeros IMPAR: "+ cont);
				}
			
		}
		
	}

}
