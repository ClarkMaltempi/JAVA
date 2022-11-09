package alvares_cabral;

public abstract class Feira {
	
	Fazer_feira comprar;
	Fiscaliza_feira fiscalizar;
	
	public Feira() {}
	
	public void set_fiscalizar (Fiscaliza_feira f) {
		fiscalizar = f;
	}
	
	public void set_fruta (Fazer_feira f) {
		comprar = f;
	}
	
	public void set_verdura (Fazer_feira v) {
		comprar = v;
	}
	
	public void chama_comprar_fruta() {
		comprar.comprar_na_barraca();
	}
	
	public void chama_comprar_verdura() {
		comprar.comprar_na_barraca();
	}
	
	public void chama_aplicar_multa() {
		fiscalizar.aplicar_multa();
	}
}
