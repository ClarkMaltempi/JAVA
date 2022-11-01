package padrão_1;

public abstract class Programacao_Infantil {

	Desenhos desenho;
	Series serie;
	Novelas novela;
	
	public Programacao_Infantil() {
	}
	
	public void set_ver_desenho(Desenhos d) {
		desenho = d;
	}
	
	public void set_ver_serie(Series s) {
		serie = s;
	}
	
	public void set_ver_novela(Novelas n) {
		novela = n;
	}

	public void assistir_desenho() {
		desenho.ver_desenho();
	}
	
	public void assistir_serie() {
		serie.ver_serie();
	}
	
	public void assistir_novela() {
		novela.ver_novela();
	}
		
	public abstract void epoca();
	
	public void ver_televisao() {
		System.out.println("Toda CRIANÇA gosta de ver TELEVISÃO!!!");
	}
}
