package design_pattern_factory;

public class Monta_Kombi implements Serviços_Montagem {
	
	public Instala_Acessório Instala (){
		System.out.println("kombi acessório: rádio AM/FM");
		return null;
		
	}

	public Faz_Pintura Pintura() {
		System.out.println("Kombi pintura: tipo saia e blusa \n cor: verde e branco");
		return null;
	}
	
}

