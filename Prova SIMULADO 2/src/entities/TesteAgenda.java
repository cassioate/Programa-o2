package entities;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TesteAgenda {
	
	private MinhaAgendaDeAniversarios agenda;

	@Before
	public void setUp() throws Exception {
		agenda = new MinhaAgendaDeAniversarios();
		agenda.adicionarAniversariante("Cassio", 12, 1);
		agenda.adicionarAniversariante("Pedro", 9, 5);
		agenda.adicionarAniversariante("Paulo", 4, 7);
		agenda.adicionarAniversariante("Carlos", 1, 7);
	}

	@Test
	public void testAdcAniversariante() {
		assertEquals(4, agenda.getAniversariantes().size());
		agenda.adicionarAniversariante("Carla", 5, 11);
		assertEquals(5, agenda.getAniversariantes().size());
	}
	
	@Test
	public void TestObterAniversariantesDoMes() throws NaoExisteAniversariante {
		ArrayList<String> retorno = new ArrayList<String>();
		retorno.add("Paulo");
		retorno.add("Carlos");
		assertEquals(retorno, agenda.obterAniversariantesDoMes(7));
	}
	
	@Test (expected = NaoExisteAniversariante.class)
	public void TestObterAniversariantesDoMesExpected() throws NaoExisteAniversariante {
		ArrayList<String> retorno = new ArrayList<String>();
		retorno.add("Paulo");
		retorno.add("Carlos");
		assertEquals(retorno, agenda.obterAniversariantesDoMes(12));
	}
	
	@Test
	public void TestRemoverAniversariante() throws NaoExisteAniversariante {
		agenda.removerAniversariante("Paulo");
		assertEquals(3, agenda.getAniversariantes().size());
		agenda.removerAniversariante("Carlos");
		assertEquals(2, agenda.getAniversariantes().size());
		agenda.removerAniversariante("Cassio");
		assertEquals(1, agenda.getAniversariantes().size());
		agenda.removerAniversariante("Pedro");
		assertEquals(0, agenda.getAniversariantes().size());
	}
	
	@Test (expected = NaoExisteAniversariante.class)
	public void TestRemoverAniversarianteExpected() throws NaoExisteAniversariante {
		agenda.removerAniversariante("Doisinho");
	}
}
