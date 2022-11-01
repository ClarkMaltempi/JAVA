package padrão_1;

public class Programacao_anos_80 extends Programacao_Infantil {

	public Programacao_anos_80() {
		desenho = new Desenhos_anos_80();
		serie = new Series_anos_80();
		novela = new Novelas_anos_80();
	}
	public void epoca() {
	System.out.println("Fã dos anos 80!!!");
	}
}

