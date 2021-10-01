package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.println("Quantos dias de vida você tem? ");
		totalDias = leia.nextInt();
		
				anos = totalDias/365;
				meses = (totalDias % 365)/ 30;
				dias = (totalDias % 365)% 30;
				
				System.out.println("a sua idade é de " + anos + " anos , " + meses + " meses e " + dias + " dias ");
				
				leia.close();
				

	}

}
