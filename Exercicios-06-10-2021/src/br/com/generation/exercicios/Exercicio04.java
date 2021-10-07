package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double[][] m1  = new double [3][3];
		double soma = 0.0 , somaDiagonal = 0.0;
		
		System.out.println("****Matriz M1*****");
		for(int l = 0; l < m1.length; l++) { 	//leitura das linhas
		for(int c = 0; c < m1[l].length; c++) { //leitura de colunas
			System.out.println("Valor da posição: M1 [" + (l+1) + "]" + "[" + (c+1) + "]");
			m1[l][c] = leia.nextDouble();
			
			if (l == c) {
				somaDiagonal = somaDiagonal + m1[l][c];
				}
			soma = soma + m1[l][c];
		}
		}
		System.out.println("A soma dos Valores: " + soma);
				
		System.out.println("A soma da Diagonal Principal: " + somaDiagonal);
		
		leia.close();
		
		
		
		

		
		
	}

}
