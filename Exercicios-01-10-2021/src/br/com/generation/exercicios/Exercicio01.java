package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade, meses, dias;
		int anosEmDias, mesesEmDias, total;
		
		System.out.println("Qual � a sua idade em anos? ");
		idade = leia.nextInt();
		anosEmDias = idade * 365;
		
		
		System.out.println("Quantos meses? ");
		meses = leia.nextInt();
		mesesEmDias = meses * 30;
		
		System.out.println("Quantos dias? ");
		dias = leia.nextInt();
		
		total = anosEmDias + mesesEmDias + dias;
		
		System.out.println("o total de dias � de " + total);
		
		leia.close();
		
		
		
		


	}

}
