package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		double[][] n1 = new double [3][3];
		double[][] n2 = new double [3][3];
		double[][] m1 = new double [3][3];
		double[][] m2 = new double [3][3];

			   
			System.out.println("****Matriz N1*****");
			for(int l = 0; l < n1.length; l++) { 	//leitura das linhas
			for(int c = 0; c < n1[l].length; c++) { //leitura de colunas
				System.out.println("Valor da posição: N1 [" + (l+1) + "]" + "[" + (c+1) + "]");
				n1[l][c] = leia.nextDouble();
				
			}
				
			}
			
			System.out.println("****Matriz N2*****");
			for(int l = 0; l < n2.length; l++) { 	//leitura das linhas
			for(int c = 0; c < n2[l].length; c++) { //leitura de colunas
				System.out.println("Valor da posição: N2 [" + (l+1) + "]" + "[" + (c+1) + "]");
				n2[l][c] = leia.nextDouble();
			
			
				
			}
				
			}
			System.out.println("\n\n *******Matriz M1********");
			for(int l = 0; l < m1.length; l++) {
				for(int c = 0; c < m1[l].length; c++) {
					m1[l][c] = n1[l][c] + n2 [l][c];
					//System.out.println("M1 Posição ["+ (l+1) +"]" + "["+ (c+1) + "] " + m1[l][c]);	
					System.out.printf("["+m1[l][c]+"] ");
				}
			System.out.println();
			}
			System.out.println("\n\n *******Matriz M2********");
			for(int l = 0; l < m1.length; l++) {
				for(int c = 0; c < m2[l].length; c++) {
					m2[l][c] = n1[l][c] - n2 [l][c];
					//System.out.println("M2 Posição ["+ (l+1) +"]" + "["+ (c+1) + "] " + m2[l][c]);	
					System.out.printf("["+m2[l][c]+"] ");

				}
			System.out.println();

			}
		
		leia.close();
	}

}
