package Pagamento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Pagamento.Salario;


class Calculo_SalarioTest {

	@Test
	void testCalculo_Salario() {
		//fail("Not yet implemented"); // TODO
		double fator_dias;
		double fator_horas;
		double ValEsperado;
		double resultado;
		
		ValEsperado = 3024.8575;
		
		double salario = 3456.98;
		double dias_trabalhados = 21;
		double horas_trabalhadas = 10;
		
		fator_dias = dias_trabalhados/30;
		fator_horas = horas_trabalhadas/8;
			
			
		resultado = salario*fator_horas*fator_dias;
		
		assertEquals(ValEsperado, resultado,0);
		
	
	}

}
