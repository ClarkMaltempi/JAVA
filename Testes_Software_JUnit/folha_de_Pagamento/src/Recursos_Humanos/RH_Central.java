package Recursos_Humanos;

import Pagamento.Calculo_Salario;
import Pagamento.Salario;
import Identificação.Empresa;
import Identificação.Funcionario;

public class RH_Central {
	
	public static void main(String[] args) {
		Salario s = new Salario();
		Calculo_Salario c = new Calculo_Salario();
		Empresa d = new Empresa();
		Funcionario e = new Funcionario();
		
		
		s = valores(s);
		s.get_salario();
		d.set_nome_Empresa("Fabrica de Copos");
		d.set_seção("Modela Vidro");
		e.set_nome_funcionario("Francisco Jose");
		e.set_matrícula("654YFV800");
		Imprime(c,d,e,s);
		
		c.set_salario(3456.98);
		c.set_dias_trabalhados(21);
		c.set_horas_trabalhadas(10);
		d.set_nome_Empresa("Medicinal Lama Negra");
		d.set_seção("Shampoo Peruibe");
		e.set_nome_funcionario("Regina Itatins");
		e.set_matrícula("178RUA7380");
		Imprime(c,d,e,c);
		
	}
	
	public static Salario valores(Salario r) {
		r.set_salario(1234.90);
		r.set_horas_trabalhadas(8.8);
		r.set_dias_trabalhados(28);
		
		return r;
	}
	
	public static void Imprime(Calculo_Salario c, Empresa d, Funcionario e, Salario r) {
		System.out.println("Empresa "+ d.get_nome_Empresa());
		System.out.println("Secao "+ d.get_seção());
		System.out.println("Funcionario "+ e.get_nome_funcionario());
		System.out.println("Matricula "+ e.get_matrícula());
		System.out.println("Salario: R$ "+ c.Calculo_Salario(r));
		
	}

}
