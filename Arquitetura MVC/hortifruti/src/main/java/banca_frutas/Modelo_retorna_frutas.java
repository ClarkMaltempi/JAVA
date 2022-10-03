package banca_frutas;

import java.util.*;

public class Modelo_retorna_frutas {
	
	public List getFrutas(String cor) {
		List frutas = new ArrayList();
		
		if(cor.equals("fruta vermelha"))
			frutas.add("morango");
		if(cor.equals("fruta amarela"))
			frutas.add("banana");
		if(cor.equals("fruta verde"))
			frutas.add("goiaba");
		if(cor.equals("fruta Laranja"))
			frutas.add("laranja");
		
	return (frutas);
		
	}

}
