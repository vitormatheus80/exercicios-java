package br.com.generation.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
    	ExercicioAviao a = new ExercicioAviao();
    
    	a.setCompanhia("GOL");
    	a.setCapacidade(300);
    	a.setOrigem("São Paulo");
    	
    	System.out.println("A companhia de aviação é: " + a.getCompanhia());
    	System.out.println("A capacidade de passageiros é: " + a.getCapacidade());
    	System.out.println("A origem do avião é: " + a.getCapacidade());
    	
    	
    	a.atual(350);
    	System.out.println("\nA velocidade atual do avião é: " + a.getVelocidade());
    	
    	a.pousar(50);
    	System.out.println("A velocidade para pousar é de: " + a.getVelocidade());
    	
    	

    	
    	
    	
    	
    
    		
    	
    		
    	
    	
    	
    	
    	
    	
    	
    	}
		
	}


