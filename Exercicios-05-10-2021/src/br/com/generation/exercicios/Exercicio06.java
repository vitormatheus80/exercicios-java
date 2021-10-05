package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int numero, multiplos = 0, soma = 0, media = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				multiplos++;
				}	
		}
		while( numero != 0);
		
		media = soma/multiplos;
		System.out.println("A media de multiplos de 3 foi de......." + media);
	
		System.out.println(soma + "e"+ multiplos);
		
		leia.close();

		
	}

}
