package padrão_1;

public class Programacao_anos_60 extends Programacao_Infantil {

	public Programacao_anos_60() {
		desenho = new Desenhos_anos_60();
		serie = new Series_anos_60();
		novela = new Novelas_anos_60();
	}
	
	public void epoca() {
	System.out.println("Fã dos anos 60!!!");
	}
}
