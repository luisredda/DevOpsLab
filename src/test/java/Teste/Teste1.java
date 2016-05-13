package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste1 {

	@Test
	public void test() {
		
		lab.view.Negocio teste = new lab.view.Negocio();
		String resultado =	teste.Concatenate("oioi", "tchau2");
		
		
		assertEquals("oioitchau24", resultado);
	}

}
