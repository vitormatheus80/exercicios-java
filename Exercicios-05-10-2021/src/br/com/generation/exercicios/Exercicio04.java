package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		
		int cont = 1 ,sexo = 0, idade, calma = 0, nervosa = 0, agressiva = 0;
		
		int mulheres = 0, homens = 0, temperamento = 0, idade40 = 0, idade18 = 0;
		
		while(cont <=3) {
			cont++;
			
			System.out.println("Qual é a sua idade? ");
			idade = leia.nextInt();
			
			System.out.println("Qual é o seu sexo? [1 = FEMININO  |  2 = MASCULINO]");
			sexo = leia.nextInt();
			
			if(sexo == 1) {
				mulheres++;
			}
			else if(sexo == 2) {
				homens++;
			}
			
			System.out.println("Você se considera:\n [1]CALMO] \n [2]NERVOSO \n [3]AGRESSIVO");
			temperamento = leia.nextInt();
			
			if(temperamento == 1) {
				calma++;
			}
			else if(temperamento == 2) {
				nervosa++;
			}
			else if(temperamento == 3) {
				agressiva++;
			}
			if(idade > 40 && temperamento == 2) {
				idade40++;
			}
			else if(idade < 18 && temperamento == 1) {
				idade18++;
			}
			
		}
		System.out.println("O total de homens foi de..........................."+homens);
		System.out.println("O total de mulheres foi de........................."+mulheres);
		System.out.println("O total de calmos foi de..........................."+calma);
		System.out.println("O total de nervosas foi de........................."+nervosa);
		System.out.println("O total de agressivos foi de......................."+agressiva);
		System.out.println("O total de menores de 18 anos calmos é de.........."+idade18);
		System.out.println("O total de maiores de 40 anos nervosos é de.........."+idade40);


		
		
		leia.close();
		
		
		
	}

}
