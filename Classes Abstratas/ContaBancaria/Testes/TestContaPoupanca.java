package Testes;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Contas.ContaPoupanca;
import Excecoes.SaldoInsuficienteException;
import Excecoes.SenhaInvalidaException;

public class TestContaPoupanca {
	
	private ContaPoupanca poupanca1;
	private ContaPoupanca poupanca2;
	
	@Before
	public void setUp() throws Exception {
		poupanca1 = new ContaPoupanca("Cassio", "123456", 2000);
		poupanca2 = new ContaPoupanca("Eduardo", "123", 50000);
	}

	@Test
	public void testTransferir() throws SaldoInsuficienteException, SenhaInvalidaException {
		poupanca1.transferir("123456", 1500, poupanca2);
		assertEquals(495, poupanca1.getSaldo(),0);
		poupanca2.transferir("123", 1500, poupanca1);
		assertEquals(1995, poupanca1.getSaldo(),0);
	}
	
	@Test (expected = SaldoInsuficienteException.class)
	public void testTransferirExpectedSaldo() throws SaldoInsuficienteException, SenhaInvalidaException {
		poupanca1.transferir("123456", 2000, poupanca2);
		assertEquals(0, poupanca1.getSaldo(),0);
	}
	
	@Test (expected = SenhaInvalidaException.class)
	public void testTransferirExpectedSenha() throws SaldoInsuficienteException, SenhaInvalidaException {
		poupanca1.transferir("123", 1995, poupanca2);
		assertEquals(0, poupanca1.getSaldo(),0);
	}

}
