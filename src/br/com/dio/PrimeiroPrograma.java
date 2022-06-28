package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Gato gato = new Gato("jack","amarelo", 10);
		
		gato.setNome("Victor");
		
		
		System.out.println(gato);
	}

}
