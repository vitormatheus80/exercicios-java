package br.com.generation.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
    	ExercicioAviao a = new ExercicioAviao();
    
    	a.setCompanhia("GOL");
    	a.setCapacidade(300);
    	a.setOrigem("S�o Paulo");
    	
    	System.out.println("A companhia de avia��o �: " + a.getCompanhia());
    	System.out.println("A capacidade de passageiros �: " + a.getCapacidade());
    	System.out.println("A origem do avi�o �: " + a.getCapacidade());
    	
    	
    	a.atual(350);
    	System.out.println("\nA velocidade atual do avi�o �: " + a.getVelocidade());
    	
    	a.pousar(50);
    	System.out.println("A velocidade para pousar � de: " + a.getVelocidade());
    	
    	

    	
    	
    	
    	
    
    		
    	
    		
    	
    	
    	
    	
    	
    	
    	
    	}
		
	}


