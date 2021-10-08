package br.com.generation.exercicios;

public class Exercicio01TestandoAnimais {

	public static void main(String[] args) {
		
	Cachorro c = new Cachorro();
	Cavalo ca = new Cavalo();
	Preguiça p = new Preguiça();
	
	//cachorro
	c.setNome("REX");
	c.setIdade(10);
	
	//cavalo
	ca.setIdade(5);
	ca.setNome("Pé de pano");
	
	//Preguiça
	p.setIdade(50);
	p.setNome("Sid");
	
	System.out.println("Nome cachorro: " + c.getNome());
	System.out.println("Idade cachorro: " + c.getIdade());
	c.correr();
	c.Emitirsom("AUAU-AUAU");
	
	System.out.println("\nNome cavalo: " + ca.getNome());
	System.out.println("Idade cavalo: " + ca.getIdade());
	ca.correr();
	ca.Emitirsom("IRRRIINN");
	
	System.out.println("\nNome preguiça: " + p.getNome());
	System.out.println("Idade preguiça: " + p.getIdade());
	p.subirArvore();
	p.Emitirsom("AAAAAAHHHHZZZZ");
	}

}
