package Contas;

import Excecoes.SaldoInsuficienteException;
import Excecoes.SenhaInvalidaException;

public class ContaCorrente extends ContaBancaria{

	private double taxa = 0.025;
	private double taxaFixa = 15;
	
	public ContaCorrente(String nome, String senha, double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException {
			
			if(this.senha.equals(senha)) {
				if(this.saldo >= valor + (valor*taxa) && valor < 5000) {
					this.saldo -= (valor*taxa) + valor;
					conta.saldo += valor;
				} else if (this.saldo >= valor + taxaFixa && valor >= 5000) {
					this.saldo -= taxaFixa + valor;
					conta.saldo += valor;
					} else {
						throw new SaldoInsuficienteException();
					}
				} else {
					throw new SenhaInvalidaException();
					}
		}
}
