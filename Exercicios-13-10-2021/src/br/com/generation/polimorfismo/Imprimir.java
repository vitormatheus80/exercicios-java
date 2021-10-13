package br.com.generation.polimorfismo;

public class Imprimir {

	public static void main(String[] args) {
		
		Teste t = new Teste();
		
		t.FazendoSom(new Cachorro());
		t.FazendoSom(new Cavalo ());
		t.FazendoSom(new Preguica());
	}

}
