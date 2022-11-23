package design_pattern_factory;

public class Cliente_Factory {
	
	public static void main(String args[]) {
		
		Serviços_Montagem sm = null;
		Montagem_Completa mc = null;
		Encapsula_Objetos_Factory kf = new Encapsula_Objetos_Factory();
		
		sm = kf.Acabamento("kombi");
		sm.Instala();
		sm.Pintura();
		
		sm =kf.Acabamento("fusca");
		sm.Instala();
		sm.Pintura();
		
		sm =kf.Acabamento("brasilia");
		sm.Instala();
		sm.Pintura();
		
		mc = kf.Acabamento_Padrão("acessório");
		mc.Instala();
		
		mc = kf.Acabamento_Padrão("pintura");
		mc.Pintura();
	}
	
}
