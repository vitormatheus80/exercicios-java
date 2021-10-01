package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int segundos, horas, minutos, segundos_total;
		
		System.out.println("Quantos segundos de duração possui este evento? ");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
				minutos = (segundos % 3600)/60;
				segundos_total = (segundos % 3600)%60;
				
		
		System.out.println("Este evento possui " + horas + " horas , " + minutos + " minutos e " + segundos_total + "segundos.");
		
		
		leia.close();
		
		

	}

}
