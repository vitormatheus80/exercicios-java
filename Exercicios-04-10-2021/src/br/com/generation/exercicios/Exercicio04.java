package br.com.generation.exercicios;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		int numero = 0; 
		double raiz, potencia; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero inteiro: "));
        
        
        if(numero % 2 == 0) {
        	raiz = Math.sqrt(numero);

            JOptionPane.showMessageDialog(null, "O número é Par e sua raiz quadrada é "+ raiz, "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
        else {
        	potencia = Math.pow(numero, 2);
        	
            JOptionPane.showMessageDialog(null, "O número é Impar e sua potencia ao quadrado é: "+ potencia, "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
	}

 }
}
