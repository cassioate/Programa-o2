package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCliente {
	private Cliente c;
	private Bebida bebida;
	private Refeicao refeicao;
	
	@Before
	public void setUp() throws Exception {
		c = new Cliente (1);
		bebida = new Bebida(Tamanho.GRANDE,Sabor.CERVEJA);
		refeicao = new Refeicao(Proteina.FRANGO,Carboidrato.MACARRAO);
		c.adicionarPedido(bebida);
		c.adicionarPedido(refeicao);
	}

	@Test
	public void testClienteAdc() {
		assertEquals(2, c.getPedidos().size());
		c.adicionarPedido(bebida);
		assertEquals(3, c.getPedidos().size());
		c.adicionarPedido(bebida);
		assertEquals(4, c.getPedidos().size());
	}
	
	@Test
	public void testClienteRemvoer() {
		assertEquals(2, c.getPedidos().size());
		c.removerPedido(bebida);
		assertEquals(1, c.getPedidos().size());
		c.removerPedido(refeicao);
		assertEquals(0, c.getPedidos().size());
	}
	
	@Test
	public void testGetConta() {
		assertEquals(20.5, c.getConta(), 0);
		c.removerPedido(bebida);
		assertEquals(17, c.getConta(), 0);
		c.removerPedido(refeicao);
		assertEquals(0, c.getConta(), 0);
	}

}
