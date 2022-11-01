package padrão_1;

public class Programacao_anos_70 extends Programacao_Infantil {

	public Programacao_anos_70() {
		desenho = new Desenhos_anos_70();
		serie = new Series_anos_70();
		novela = new Novelas_anos_70();
	}
	public void epoca() {
	System.out.println("Fã dos anos 70!!!");
	}
}

