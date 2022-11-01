package padrão_1;

public class Simula_Programacao_Infantil {

	public static void main(String[] args) {
		
		System.out.println("Implementação de ** Programação Anos 60 **");
		Programacao_Infantil anos_60 = new Programacao_anos_60();
		anos_60.set_ver_desenho(anos_60.desenho);
		anos_60.assistir_desenho();
		anos_60.set_ver_novela(anos_60.novela);
		anos_60.assistir_novela();
		anos_60.set_ver_serie(anos_60.serie);
		anos_60.assistir_serie();
		anos_60.epoca();
		anos_60.ver_televisao();
		System.out.println();
		
		System.out.println("Implementação de ** Programação Anos 70 **");
		Programacao_Infantil anos_70 = new Programacao_anos_70();
		anos_70.set_ver_desenho(anos_70.desenho);
		anos_70.assistir_desenho();
		anos_70.set_ver_novela(anos_70.novela);
		anos_70.assistir_novela();
		anos_70.set_ver_serie(anos_70.serie);
		anos_70.assistir_serie();
		anos_70.epoca();
		anos_70.ver_televisao();
		System.out.println();
		
		System.out.println("Implementação de ** Programação Anos 80 **");
		Programacao_Infantil anos_80 = new Programacao_anos_80();
		anos_80.set_ver_desenho(anos_80.desenho);
		anos_80.assistir_desenho();
		anos_80.set_ver_novela(anos_80.novela);
		anos_80.assistir_novela();
		anos_80.set_ver_serie(anos_80.serie);
		anos_80.assistir_serie();
		anos_80.epoca();
		anos_80.ver_televisao();
		System.out.println();
	}
}
