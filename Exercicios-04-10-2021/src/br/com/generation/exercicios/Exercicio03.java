package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Quantos anos voc� tem? ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("adulto");
		}
		leia.close();
	}

}
