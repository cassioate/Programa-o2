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
		c = new Autor("Eduardo", "Lucena", "Falcão");
		artigo = new Artigo (c,2020,"Programação Orientada a Objetos");
		es = new ModeloInternacional();
		es2 = new ModeloBrasileiro();
	}

	@Test
	public void TestGetCitacaoInternacional() throws IllegalArgumentException, AnoInvalidoException {
		assertEquals("FALCÃO, E.L., Programação Orientada a Objetos, 2020", es.getCitacao(artigo));
	}
	
	@Test
	public void TestGetCitacaoBrasileiro() throws IllegalArgumentException, AnoInvalidoException{
		assertEquals("EDUARDO L. FALCÃO, 2020, Programação Orientada a Objetos.", es2.getCitacao(artigo));
	}

}
