package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		while(idade != -99 || idade == 0) {
			
			
			System.out.println("Digite a sua idade:  \nDIGITE -99 PARA SAIR" );
			idade = leia.nextInt();
			
			
			if(idade <=21) {
				menor++;
			}
			else if(idade >= 50) {
				maior++;
			}
		}
		
		System.out.println("O numero de menores de 21 anos é......"+menor);
		System.out.println("O numero de maiores de 50 anos é......"+maior);
		leia.close();
	}

}
