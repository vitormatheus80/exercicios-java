package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();

			soma = soma + numero;	
		}
		while(numero != 0);
		
		System.out.println("A soma dos numeros digitados foi........."+soma);
		leia.close();
	}

}
