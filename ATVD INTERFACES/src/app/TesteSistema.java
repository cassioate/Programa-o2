package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteSistema {
	
	private SistemaRestaurante sistema;
	private Cliente c;
	private Cliente c2;
	private Bebida bebida;
	private Refeicao refeicao;

	@Before
	public void setUp() throws Exception {
		sistema = new SistemaRestaurante();
		c = new Cliente(1);
		c2 = new Cliente(2);
		bebida = new Bebida(Tamanho.GRANDE,Sabor.CERVEJA);
		refeicao = new Refeicao(Proteina.FRANGO,Carboidrato.MACARRAO);
	}
	
	@Test
	public void testAdcCliente() {
		sistema.adicionarCliente(c);
		assertEquals(1, sistema.getClientes().size());
		sistema.adicionarCliente(c2);
		assertEquals(2, sistema.getClientes().size());
	}
	
	@Test
	public void testAdcPedido() throws ClienteInexistenteException {
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, bebida);
		assertEquals(2, c.getPedidos().size());
		sistema.adicionarCliente(c2);
		sistema.adicionarPedido(2, bebida);
		assertEquals(1, c2.getPedidos().size());
		sistema.adicionarPedido(2, refeicao);
		assertEquals(2, c2.getPedidos().size());
	}
	
	@Test (expected = ClienteInexistenteException.class)
	public void testAdcPedidoException() throws ClienteInexistenteException {
		sistema.adicionarPedido(3, bebida);
	}
	
	@Test
	public void testeRemoverPedido() throws ClienteInexistenteException, PedidoInexistenteException {
		sistema.adicionarCliente(c);
		sistema.adicionarCliente(c2);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, refeicao);
		sistema.adicionarPedido(2, bebida);
		sistema.adicionarPedido(2, refeicao);
		assertEquals(2, c2.getPedidos().size());
		assertEquals(2, c.getPedidos().size());
		sistema.removerPedido(2, bebida);
		sistema.removerPedido(1, bebida);
		assertEquals(1, c2.getPedidos().size());
		assertEquals(1, c.getPedidos().size());
		sistema.removerPedido(2, refeicao);
		sistema.removerPedido(1, refeicao);
		assertEquals(0, c2.getPedidos().size());
		assertEquals(0, c.getPedidos().size());
	}
	
	@Test (expected = PedidoInexistenteException.class)
	public void testRemoverPedidoException() throws PedidoInexistenteException {
		sistema.removerPedido(3, bebida);
	}
	
	@Test
	public void TestComputarPagamentoCliente() throws ClienteInexistenteException {
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, refeicao);
		assertEquals(23.3, sistema.computarPagamentoCliente(1), 0);
	}
	
	@Test
	public void TestReceberPagamentoCliente() throws ClienteInexistenteException, PagamentoInvalidoException {
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, refeicao);
		sistema.receberPagamentoCliente(1, 23.3);
	}
	
	@Test (expected = PagamentoInvalidoException.class)
	public void TestReceberPagamentoClienteException() throws ClienteInexistenteException, PagamentoInvalidoException {
		sistema.adicionarCliente(c);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, refeicao);
		sistema.receberPagamentoCliente(1, 22.3);
	}
}
