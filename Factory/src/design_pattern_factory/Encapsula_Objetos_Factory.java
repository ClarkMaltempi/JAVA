package design_pattern_factory;

public class Encapsula_Objetos_Factory {
	
	public Serviços_Montagem Acabamento (String modelo) {
		
		Serviços_Montagem carro = null;
		
		if (modelo.equals("kombi")) {
			carro = new Monta_Kombi();
		}
		
		else if (modelo.equals("fusca")){
			carro = new Monta_Fusca();
			
		}
		
		else if (modelo.equals("brasilia")) {
			carro = new Monta_Brasilia();
			
		}
		
			return carro;	
	}

	public Montagem_Completa Acabamento_Padrão (String acabamento) {
		
		Montagem_Completa carro_standard = null;
		
		if (acabamento.equals("acessório")) {
			carro_standard = new Instala_Acessório();
		}
		
		else if (acabamento.equals("pintura")) {
			carro_standard = new Faz_Pintura();
		}
		
		return carro_standard;
	}
}
