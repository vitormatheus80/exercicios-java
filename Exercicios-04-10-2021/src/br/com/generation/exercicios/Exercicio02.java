package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o primeiro numero: ");
		a=leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b=leia.nextInt();

		System.out.println("Digite o terceiro numero: ");
		c=leia.nextInt();

		if(a>=b && b>=c) {
			System.out.println(c + "-" + b + "-" + a);
		}
		else if(a>=c && c>=b) {
			System.out.println(b + "-" + c + "-" + a);
		}
		
		else if(b>=a && a>=c) {
			System.out.println(c + "-" + a + "-" + b);
		}
		else if(b>=c && c>=a) {
			System.out.println(a + "-" + c + "-" + b);
		}
		else if (c>=a && a>=b) {
			System.out.println(b + "-" + a + "-" + c);
		}
		else if(c>=b && b>=a) {
			System.out.println(a + "-" + b + "-" + c);
		}
		leia.close();
	}

}
