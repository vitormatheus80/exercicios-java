package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, maior = 0;
		
		
		System.out.println("Digite o 1° numero");
		num1 = leia.nextInt();
		
		System.out.println("Digite o 2° numero");
		num2 = leia.nextInt();
		
		System.out.println("Digite o 3° numero");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
		}
		else if(num2 > num1 && num2 > num3) {
			maior = num2;
		}
		else if(num3 > num1 && num3 > num2) {
			maior = num3;
		}
		
		System.out.println("O maior numero foi: " + maior);
		
		leia.close();
		
	}

}
