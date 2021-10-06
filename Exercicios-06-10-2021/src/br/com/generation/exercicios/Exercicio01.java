package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] pontos = new int[5]; 
		int maior = 0;
		
		for(int i = 0; i < pontos.length; i++) {
			
			System.out.println("Digite a " + (i+1) +"° pontuação: ");
			pontos[i] = leia.nextInt();
			
			if(pontos[i] > maior) {
				maior = pontos[i];
			}
		}
		
		System.out.println("**************RESULTADO****************");
		System.out.println("A maior pontuação digitada foi: "+ maior);
		leia.close();
		
	}

}
