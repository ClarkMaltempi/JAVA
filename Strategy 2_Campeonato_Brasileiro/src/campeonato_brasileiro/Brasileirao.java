package campeonato_brasileiro;

public class Brasileirao {
	
	//variáveis dos tipos das interfaces
	Organiza_Serie_A oa;
	Organiza_Serie_B ob;
	Organiza_Serie_C oc;
	
	public Brasileirao() {}
	
	public void set_Serie_A(Organiza_Serie_A a) {
		oa = a;}
	
	public void set_Serie_B(Organiza_Serie_B b) {
		ob = b;}
	
	public void set_Serie_C(Organiza_Serie_C c) {
		oc = c;}
	
	public void rodada_Serie_A() {
		oa.tabela_Serie_A();
		oa.pontos_Serie_A();
	}
	
	public void rodada_Serie_B() {
		ob.tabela_Serie_B();
		ob.pontos_Serie_B();
	}
	
	public void rodada_Serie_C() {
		oc.tabela_Serie_C();
		oc.pontos_Serie_C();
	}
}


