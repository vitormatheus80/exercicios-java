package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int[] dado = new int[10];
		int numero6 = 0, soma = 0;
		
		for(int i = 0; i < dado.length; i++) {
			
			System.out.println((i+1) + "° Rodada: ");
			dado[i] = leia.nextInt();
			
			soma += dado[i];
			
			if(dado[i] == 6) {
				numero6++; 
			}
			
		}
		System.out.println("****************RESULTADO******************");
		System.out.println("A média dos arremessos foi de: " + (soma/10));
		System.out.println("A quantidade de vezes de maior pontuação foi de: "+ numero6);
		
		leia.close();
		
	}

}
