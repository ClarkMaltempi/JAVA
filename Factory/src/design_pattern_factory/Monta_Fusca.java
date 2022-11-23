package design_pattern_factory;

public class Monta_Fusca implements Serviços_Montagem {
	
	public Instala_Acessório Instala () {
		System.out.println("Fusca acessório: antena e alto falante");
		return null;
	}

	public Faz_Pintura Pintura() {
		System.out.println("Fusca pintura: cor amarelo");
		return null;
	}
}
