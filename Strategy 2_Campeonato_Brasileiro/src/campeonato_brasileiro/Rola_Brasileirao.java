package campeonato_brasileiro;

public class Rola_Brasileirao {
	public static void main(String args[]) {
		
		Brasileirao d = new Serie_A();
		d.set_Serie_A(d.oa);
		d.rodada_Serie_A();
		
		Brasileirao e = new Serie_B();
		e.set_Serie_B(e.ob);
		e.rodada_Serie_B();
		
		Brasileirao f = new Serie_C();
		f.set_Serie_C(f.oc);
		f.rodada_Serie_C();
	}
}
