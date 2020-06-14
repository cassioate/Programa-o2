package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Contas.ContaCorrente;
import Excecoes.SaldoInsuficienteException;
import Excecoes.SenhaInvalidaException;


public class TestContaCorrente {
	
	private ContaCorrente corrente1;
	private ContaCorrente corrente2;
	
	@Before
	public void setUp() throws Exception {
		corrente1 = new ContaCorrente("Cassio", "123456", 2000);
		corrente2 = new ContaCorrente("Eduardo", "123", 50000);
	}

	@Test
	public void testTransferir() throws SaldoInsuficienteException, SenhaInvalidaException {
		corrente1.transferir("123456", 500, corrente2);
		assertEquals(1498.75, corrente1.getSaldo(),0);
		corrente2.transferir("123", 5500, corrente1);
		assertEquals(6998.75, corrente1.getSaldo(),0);
		assertEquals(44985.0, corrente2.getSaldo(),0);
	}
	
	@Test (expected = SaldoInsuficienteException.class)
	public void testTransferirExpectedSaldo() throws SaldoInsuficienteException, SenhaInvalidaException {
		corrente1.transferir("123456", 2000, corrente2);
		assertEquals(1487.5, corrente1.getSaldo(),0);
	}
	
	@Test (expected = SenhaInvalidaException.class)
	public void testTransferirExpectedSenha() throws SaldoInsuficienteException, SenhaInvalidaException {
		corrente1.transferir("15257", 500, corrente2);
		assertEquals(1487.5, corrente1.getSaldo(),0);
	}
}
