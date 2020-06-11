package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteModelos {
	
	private Autor c;
	private Artigo artigo;
	private EstrategiaCitacao es;
	private EstrategiaCitacao es2;

	@Before
	public void setUp() throws Exception {
		c = new Autor("Eduardo", "Lucena", "Falc�o");
		artigo = new Artigo (c,2020,"Programa��o Orientada a Objetos");
		es = new ModeloInternacional();
		es2 = new ModeloBrasileiro();
	}

	@Test
	public void TestGetCitacaoInternacional() throws IllegalArgumentException, AnoInvalidoException {
		assertEquals("FALC�O, E.L., Programa��o Orientada a Objetos, 2020", es.getCitacao(artigo));
	}
	
	@Test
	public void TestGetCitacaoBrasileiro() throws IllegalArgumentException, AnoInvalidoException{
		assertEquals("EDUARDO L. FALC�O, 2020, Programa��o Orientada a Objetos.", es2.getCitacao(artigo));
	}

}
