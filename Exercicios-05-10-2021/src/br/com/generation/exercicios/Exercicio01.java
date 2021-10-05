package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner (System.in);
		int div;
				
		for(int cont = 1000; cont <= 1999; cont++) {
			div = cont % 11;
			if(div == 5) {
				
				System.out.println(cont);
				Thread.sleep(50);	

			}
			leia.close();
			
		}
		
		
	}

}
