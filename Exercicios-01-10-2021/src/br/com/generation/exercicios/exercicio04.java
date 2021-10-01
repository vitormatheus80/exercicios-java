package br.com.generation.exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
	   
		double a, b, c, d,r,s;
	   
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o coeficiente A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o coeficiente B: ");
		b= leia.nextDouble();
		
		System.out.println("Digite o coeficiente C: ");
		c= leia.nextDouble();
		
		r = Math.pow(a+b, 2.0); 
		s = Math.pow(b+c, 2.0); 
		
		d = (r + s)/2;
		
		System.out.println(" o valor de R é: " + r + "\n o valor de S é: " + s + "\n o valor de D é: " + d);
		
		leia.close();
		
		
		
		
		
		
		
		
		

	}

}
