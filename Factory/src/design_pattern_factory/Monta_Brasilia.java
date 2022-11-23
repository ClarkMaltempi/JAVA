package design_pattern_factory;

public class Monta_Brasilia implements Serviços_Montagem {
		
		public Instala_Acessório Instala () {
			System.out.println("Brasília acessório: Banco de couro e Apliques do velocímetro");
			return null;
		}

		public Faz_Pintura Pintura() {
			System.out.println("Brasília pintura: cor verde limão");
			return null;
		}
	}

