package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class teste_3 {

	@Test
	void test() {
		//fail("Not yet implemented"); // TODO
		System.out.println("teste1");
		String expResult ="v";
		String result = Codigo_teste.teste1();
		assertEquals(expResult,result);
	}

}
